package entity;

/**
 * Created by jasonzhu on 3/3/16.
 */
public class Operation {
    private String operation;
    private String input;
    private String output;

    public Operation(String operation, String input, String output) {
        this.operation = operation;
        this.input = input;
        this.output = output;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "operation='" + operation + '\'' +
                ", input='" + input + '\'' +
                ", output='" + output + '\'' +
                '}';
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
