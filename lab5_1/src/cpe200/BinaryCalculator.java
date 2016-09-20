package cpe200;


import java.text.DecimalFormat;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() throws RuntimeException {
        double total = Double.parseDouble(firstOperand.getOperand()) + Double.parseDouble(secondOperand.getOperand());
        if(Double.parseDouble(firstOperand.getOperand()) <0 || Double.parseDouble(secondOperand.getOperand()) <0){
            throw new RuntimeException();
        }
        if( (total == Math.floor(total) && !Double.isInfinite(total))){
            int i = (int)total;
            return Integer.toString(i);
        }else {

            return Double.toString(total);
        }

    }

    public String subtract() throws RuntimeException {
        double total = Double.parseDouble(firstOperand.getOperand()) - Double.parseDouble(secondOperand.getOperand());
        if(Double.parseDouble(firstOperand.getOperand()) <0 || Double.parseDouble(secondOperand.getOperand()) <0){
            throw new RuntimeException();
        }
        if( (total == Math.floor(total) && !Double.isInfinite(total))){
            int i = (int)total;
            return Integer.toString(i);
        }else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(total);
            //Math.round(total,1);
        }
    }

    public String multiply() throws RuntimeException {
        double total = Double.parseDouble(firstOperand.getOperand()) * Double.parseDouble(secondOperand.getOperand());
        if(total < 0){
            throw new RuntimeException();
        }
        if( (total == Math.floor(total) && !Double.isInfinite(total))){
            int i = (int)total;
            if(i < 0){
                throw new RuntimeException();
            }
            return Integer.toString(i);
        }else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(total);
            //Math.round(total,1);
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(Double.parseDouble(secondOperand.getOperand()) != 0) {
            double total = Double.parseDouble(firstOperand.getOperand()) / Double.parseDouble(secondOperand.getOperand());
            if ((total == Math.ceil(total) && !Double.isInfinite(total))) {
                int i = (int) total;
                if(i < 0){
                    throw new RuntimeException();
                }
                return Integer.toString(i);

            } else {
                total = total*100000;
                total = Math.ceil(total);
                int count = (int)total;
                total = (double)count/100000;
                if(total < 0){
                    throw new RuntimeException();
                }
                return Double.toString(total);

            }
        }else{
            int a=2;
            return Integer.toString(a/0);
        }
    }

    public String power() throws RuntimeException {
        double firs,second;
        double total;
        firs = Double.parseDouble(firstOperand.getOperand());
        second = Double.parseDouble(secondOperand.getOperand());
        total = Math.pow(firs,second);
        if( (total == Math.floor(total) && !Double.isInfinite(total))){
            int i = (int)total;
            if(i < 0){
                throw new RuntimeException();
            }
            return Integer.toString(i);
        }else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            if(total < 0){
                throw new RuntimeException();
            }
            return formatter.format(total);
            //Math.round(total,1);
        }

    }

}
