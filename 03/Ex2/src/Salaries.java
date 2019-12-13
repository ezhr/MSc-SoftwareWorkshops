import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

/**
 * The Salaries class stores the salaries of a company's employees and performs analysis on the employees' salaries in the methods included in the class.
 *
 * @author Izhaar Dharsee IMD961
 * @version 22-10-2019
 */
public class Salaries {
    public ArrayList<double[]> allSalaries;

    /**
     * The constructor for Salaries initializes a new allSalaries ArrayList which stores the salaries of all employees of the company.
     */
    public Salaries() {
        allSalaries = new ArrayList<>();
    }

    /**
     * The add method adds an employee's yearly salary array to the allSalaries ArrayList.
     *
     * @param employeeSalaries A salary's month-by-month salary in the form of an array of type double.
     */

    public void add(double[] employeeSalaries) {
        allSalaries.add(employeeSalaries);
    }

    /**
     * The average method calculates the average salary of an employee for a year.
     *
     * @param employeeSalaries The salary of the employee for the whole year, in the form of an array containing doubles.
     * @return The average salary of the employee for the year.
     */
    public static double average(double[] employeeSalaries) {
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < employeeSalaries.length; i++) {
            if (employeeSalaries[i] != 0) {
                sum += employeeSalaries[i];
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException();
        }
        return sum / count;
    }


    /**
     * The averageSalaries method generates an ArrayList of all the averages of all the employees of the year.
     *
     * @return An ArrayList containing the combined salaries of all the employees of the year in double format.
     */
    public ArrayList<Double> averageSalaries() {
        ArrayList<Double> averages = new ArrayList<>();
        for (int i = 0; i < allSalaries.size(); i++) {
            try {
                averages.add(average(allSalaries.get(i)));
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: The salary for employee number " + i + " is 0 for all months of the year and the average can not be calculated.");
            }
        }
        return averages;
    }

    /**
     * The not3TimesHigher method checks whether an employee's average salary is not three times higher than the overall average salary of the other employees.
     *
     * @return Boolean whether the employee's average salary is 3x higher than the overall average salary of the other employees.
     */
    public boolean not3TimesHigher() {
        ArrayList<Double> averages = averageSalaries();
        double totalAverages = 0;
        int numberOfEmployees = averages.size();
        if (numberOfEmployees == 1) {
            return true;
        }
        for (int i = 0; i < numberOfEmployees; i++) {
            totalAverages += averages.get(i);
        }
        int numberOfOthers = numberOfEmployees - 1;
        for (int i = 0; i < numberOfEmployees; i++) {
            double allOtherAverages = (totalAverages - averages.get(i)) / numberOfOthers;
            if (averages.get(i) > 3 * allOtherAverages) {
                return false;
            }
        }
        return true;
    }
}
