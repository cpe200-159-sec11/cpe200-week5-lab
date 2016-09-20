package cpe200;

public class Operand {
    private String operand;

    public Operand(String operand) throws Exception {
        this.operand = operand;
    }

    public Operand(int operand) throws Exception {
        this.operand = Integer.toString(operand);
    }

    public Operand(double operand) throws Exception {
        this.operand = Double.toString(operand);
    }

    public String getOperand()
    {
        return operand;
    }
}
