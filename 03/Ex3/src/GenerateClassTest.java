import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Izhaar Dharsee IMD961
 * @version 03/11/2019
 */
class GenerateClassTest {

    private GenerateClass employeeClass;

    @BeforeEach
    void setUp() {
        String className = "Employees";
        String[] variableNames = {"Name", "Salary"};
        String[] variableTypes = {"String", "int"};
        employeeClass = new GenerateClass(className, variableNames, variableTypes);
    }

    @Test
    void makeFields() {
        String expected = "  private String Name;\n  private int Salary;\n\n";
        String actual = employeeClass.makeFields();
        assertEquals(expected, actual, "The actual String output did not match the expected String");
    }

    @Test
    void makeConstructor() {
        String expected = "  public Employees(String Name, int Salary){\n    this.Name = Name;\n    this.Salary = Salary;\n  }\n";
        String actual = employeeClass.makeConstructor();
        assertEquals(expected, actual, "The actual String output did not match the expected String");
    }

    @Test
    void makeGetters() {
        String expected = "  public String getName(){\n    return Name;\n  }\n  public int getSalary(){\n    return Salary;\n  }\n";
        String actual = employeeClass.makeGetters();
        assertEquals(expected, actual, "The actual String output did not match the expected String");
    }

    @Test
    void makeSetters() {
        String expected = "  public void setName(String Name){\n    this.Name = Name;\n  }\n  public void setSalary(int Salary){\n    this.Salary = Salary;\n  }\n";
        String actual = employeeClass.makeSetters();
        assertEquals(expected, actual, "The actual String output did not match the expected String");
    }
}