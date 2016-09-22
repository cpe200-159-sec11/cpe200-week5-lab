package cpe200;

public class Operand {
    protected String operand;

    public Operand(String operand) {
        this.operand = operand;
    }

    public Operand(int operand) {
        this.operand = Integer.toString(operand);

    }

    public Operand(double operand) {
        this.operand = Double.toString(operand);
    }
}
