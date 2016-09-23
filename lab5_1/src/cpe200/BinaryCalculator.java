package cpe200;


import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;

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

    public String add() {
        String first = this.firstOperand.getOperand();
        String second = this.secondOperand.getOperand();
        String ans;
        double firstdouble = Double.parseDouble(first);
        double seconddobule = Double.parseDouble(second);
        double sum = firstdouble + seconddobule;
        if(firstdouble <0 || seconddobule <0)
        {
            throw new ArithmeticException();
        }
        double hold = (double)Math.round(sum * 100000d)/100000d;
        if (hold*10%10 == 0)
        {
            int hold2 = (int) sum;
            ans = Integer.toString(hold2);
        }
        else {
            ans = Double.toString(sum);
        }
        return ans;
    }

    public String subtract() {
        String first = this.firstOperand.getOperand();
        String second = this.secondOperand.getOperand();
        String ans;
        double firstdouble = Double.parseDouble(first);
        double seconddobule = Double.parseDouble(second);
        double sum = firstdouble - seconddobule;
        if(firstdouble <0 || seconddobule <0)
        {
            throw new ArithmeticException();
        }
        double hold = (double)Math.round(sum * 100000d)/100000d;
        if (hold*10%10 == 0)
        {
            int hold2 = (int) sum;
            ans = Integer.toString(hold2);
        }
        else {
            ans = Double.toString(hold);
        }
        return ans;
    }

    public String multiply() {
        String first = this.firstOperand.getOperand();
        String second = this.secondOperand.getOperand();
        String ans;
        double firstdouble = Double.parseDouble(first);
        double seconddobule = Double.parseDouble(second);
        double sum = firstdouble * seconddobule;
        if(firstdouble <0 || seconddobule <0)
        {
            throw new ArithmeticException();
        }
        double hold = (double)Math.round(sum * 100000d)/100000d;
        if(firstdouble == 0 || seconddobule == 0)
        {
            return "The operation must raise an exception";
        }
        if (hold*10%10 == 0)
        {
            int hold2 = (int) sum;
            ans = Integer.toString(hold2);
        }
        else {
            ans = Double.toString(sum);
        }
        return ans;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        String first = this.firstOperand.getOperand();
        String second = this.secondOperand.getOperand();
        String ans;

        double firstdouble = Double.parseDouble(first);
        double seconddobule = Double.parseDouble(second);
        if(firstdouble <0 || seconddobule <0)
        {
            throw new ArithmeticException();
        }
        if (seconddobule == 0)
        {
            throw new ArithmeticException();
        }
        double sum = firstdouble / seconddobule;

        double hold = (double)Math.round(sum * 100000d)/100000d;
        if (hold*10%10 == 0)
        {
            int hold2 = (int) sum;
            ans = Integer.toString(hold2);
        }
        else {
            ans = Double.toString(hold);
        }
        return ans;
    }

    public String power() {
        String first = this.firstOperand.getOperand();
        String second = this.secondOperand.getOperand();
        String ans;
        double firstdouble = Double.parseDouble(first);
        double seconddobule = Double.parseDouble(second);
        double sum = Math.pow(firstdouble,seconddobule);
        if(firstdouble <0 || seconddobule <0)
        {
            throw new ArithmeticException();
        }
        double hold = (double)Math.round(sum * 100000d)/100000d;
        if (hold*10%10 == 0)
        {
            int hold2 = (int) sum;
            ans = Integer.toString(hold2);
        }
        else {
            ans = Double.toString(sum);
        }
        return ans;
    }

}
