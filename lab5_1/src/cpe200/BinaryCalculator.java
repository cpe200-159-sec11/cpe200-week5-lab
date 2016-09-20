package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.operand);
    }

    public String add() {
        if(firstOperand.compareTo(BigDecimal.ZERO)<=0 || secondOperand.compareTo(BigDecimal.ZERO)<=0) {
            throw new RuntimeException("Operand must greater than 0");
        }
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() {
        if(firstOperand.compareTo(BigDecimal.ZERO)<=0 || secondOperand.compareTo(BigDecimal.ZERO)<=0){
            throw  new RuntimeException("Operand must greater than 0");
        }
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() {
        if(firstOperand.compareTo(BigDecimal.ZERO)<=0 || secondOperand.compareTo(BigDecimal.ZERO)<=0){
            throw  new RuntimeException("Operand must greater than 0");
        }
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(secondOperand.equals(BigDecimal.ZERO)){
            throw new ArithmeticException();
        }
        if(firstOperand.compareTo(BigDecimal.ZERO)<=0 || secondOperand.compareTo(BigDecimal.ZERO)<=0){
            throw  new RuntimeException("Operand must greater than 0");
        }
        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if(firstOperand.compareTo(BigDecimal.ZERO)<=0 || secondOperand.compareTo(BigDecimal.ZERO)<=0){
            throw  new RuntimeException("Operand must greater than 0");
        }
        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }

}
