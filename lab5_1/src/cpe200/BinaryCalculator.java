package cpe200;


import java.text.DecimalFormat;

public class BinaryCalculator {
    private Operand firstOperand;           //We have to set it as Private object.
    private Operand secondOperand;          //We have to set it as Private object.

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }

    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }
    public String add() throws RuntimeException {

        if(Double.parseDouble(firstOperand.operand) < 0 || Double.parseDouble(secondOperand.operand) < 0 ){
            throw new RuntimeException();
        }

        double sum = Double.parseDouble(firstOperand.operand) + Double.parseDouble(secondOperand.operand);
        if (sum == Math.floor(sum)) {
              int sum_int = (int) sum;
            return Integer.toString(sum_int);
        }
        else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(sum);
        }
    }

    public String subtract() throws RuntimeException {

        double fir = Double.parseDouble(firstOperand.operand);
        double sec = Double.parseDouble(secondOperand.operand);
        double s;

        if(fir < 0 || sec <0){
            throw new RuntimeException();
        }
        if(fir > sec){ s = fir-sec;}        //check value which have more value.
        else{
            s = sec-fir;
            if(fir < 0 && sec <0){s *= -1;}
        }
        //Check double.
        if(fir != (int)fir || sec != (int)sec){
            s *= 10;
            double temp = s;
            temp = Math.round(temp);
            temp /= 10;

            return Double.toString(temp);}
        else{
            int sum;
            sum = (int)s;
            return Integer.toString(sum);
        }
    }

    public String multiply() throws RuntimeException {
        double fir = Double.parseDouble(firstOperand.operand);
        double sec = Double.parseDouble(secondOperand.operand);
        double s = fir * sec;

        if(fir < 0 || sec <0){                    //RuntimeException func.
            throw new RuntimeException();
        }

        if(fir != (int)fir || sec != (int)sec){
            s *= 10;
            double temp = s;
            temp = Math.round(temp);
            temp /= 10;

            return Double.toString(temp);}
        else{
            int sum;
            sum = (int)s;
            return Integer.toString(sum);
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        double fir = Double.parseDouble(firstOperand.operand);
        double sec = Double.parseDouble(secondOperand.operand);
        double s;

        if(fir < 0 || sec <0){                    //RuntimeException func.
            throw new ArithmeticException();
        }

        if(sec == 0.0 || sec == 0){
            throw new ArithmeticException();
        }
        s = fir / sec;
        s = (double)Math.round(s*100000d)/100000d;
        if(s != (int)s ){
            return Double.toString(s) ; }
        else{
            int sum;
            sum = (int)s;
            return Integer.toString(sum);
        }
    }

    public String power() throws RuntimeException {
        double fir = Double.parseDouble(firstOperand.operand);
        double sec = Double.parseDouble(secondOperand.operand);
        double s = Math.pow(fir, sec);

        if(fir < 0 || sec <0){                    //RuntimeException func.
            throw new RuntimeException();
        }
        if(s != (int)s ){
            return Double.toString(s) ; }
        else{
            int sum;
            sum = (int)s;
            return Integer.toString(sum);
        }
    }

}
