import java.io.*;

/**
 * The GenerateClass method generates methods for a class based on its variables, just like Eclipse.
 *
 * @author Izhaar Dharsee IMD961
 * @version 22/10/2019
 */
public class GenerateClass {
    private String className;
    private String[] variableNames;
    private String[] variableTypes;

    /**
     * The GenerateClass method initializes a GenerateClass object by passing in its variables.
     *
     * @param className     The name of the class for which to generate the stubs
     * @param variableNames The names of the variables in a String array
     * @param variableTypes The types of the corresponding variables in a String array, with the same number of items as the variableNames method
     */
    public GenerateClass(String className, String[] variableNames, String[] variableTypes) {
        this.className = className;
        this.variableNames = variableNames;
        this.variableTypes = variableTypes;
    }

    /**
     * The makeFields method returns a String with the declaration of the corresponding field variables
     *
     * @return A string that declares the corresponding field variables of the object
     */
    public String makeFields() {
        String field = "";
        for (int i = 0; i < variableNames.length; i++) {
            field += "  private " + variableTypes[i] + " " + variableNames[i] + ";\n";
        }
        field += "\n";
        return field;
    }

    /**
     * The makeConstructor method produces a constructor method for the class specified.
     *
     * @return A constructor for the class specified in string format
     */
    public String makeConstructor() {
        String constructor = "  public " + className + "(";
        for (int i = 0; i < variableNames.length; i++) {
            constructor += variableTypes[i] + " " + variableNames[i] + ", ";
        }
        if (variableNames.length != 0) {
            constructor = constructor.substring(0, constructor.length() - 2);
        }
        constructor += "){\n";
        for (int i = 0; i < variableNames.length; i++) {
            constructor += "    this." + variableNames[i] + " = " + variableNames[i] + ";\n";
        }
        if (variableNames.length == 0) {
            constructor = constructor.substring(0, constructor.length() - 1) + "}";
        } else {
            constructor += "  }";
        }
        constructor += "\n";
        return constructor;
    }

    /**
     * The makeGetters method produces getters for the class
     *
     * @return Getter method in a String format
     */
    public String makeGetters() {
        String getters = "";
        for (int i = 0; i < variableNames.length; i++) {
            getters += "  public " + variableTypes[i] + " get" + variableNames[i].substring(0, 1).toUpperCase() + variableNames[i].substring(1) + "(){\n";
            getters += "    return " + variableNames[i] + ";\n";
            getters += "  }\n";
        }
        return getters;
    }

    /**
     * The makeSetters method produces setters for the class
     *
     * @return Setter method in a String format
     */
    public String makeSetters() {
        String setters = "";
        for (int i = 0; i < variableNames.length; i++) {
            setters += "  public void set" + variableNames[i].substring(0, 1).toUpperCase() + variableNames[i].substring(1) + "(" + variableTypes[i] + " " + variableNames[i] + "){\n";
            setters += "    this." + variableNames[i] + " = " + variableNames[i] + ";\n";
            setters += "  }\n";
        }
        return setters;
    }

    /**
     * The writeFile method writes a file className.java that automatically generates all the methods provided above for a certain class className
     */
    public void writeFile() {
        String contents = "public class " + className + " {\n";
        contents += makeFields() + makeConstructor() + makeSetters() + makeGetters();
        contents += "}";
        //System.out.println(contents);


        try {
            FileWriter fw = new FileWriter(className + ".java");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contents);
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
