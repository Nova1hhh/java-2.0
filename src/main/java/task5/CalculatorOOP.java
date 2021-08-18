package task5;


import java.util.InputMismatchException;

public class CalculatorOOP {
    private Double result;
    private Double val1;
    private Double val2;
    private String op;

    public CalculatorOOP() {
        // this.status = ERROR_VALUES;
    }

    public CalculatorOOP(double val1, double val2, String op) {
        this.val1 = val1;
        this.val2 = val2;
        this.op = op;
        setResult(val1, val2, op);
    }

    public Double getVal1() {
        return val1;
    }

    public Double getVal2() {
        return val2;
    }

    public String getOp() {
        return op;
    }

    private void setResult(Double val1, Double val2, String op) {
        try {
            if (val1 == null || val2 == null) {
                throw new NullPointerException();
            }
            if (op == null || !op.equals("/") && !op.equals("+") && !op.equals("*") && !op.equals("-")) {
                throw new InputMismatchException();
            }
            if (op.equals("/") && val2 == 0) {
                throw new ArithmeticException();
            }
            switch (op) {
                case "+" -> this.result = val1 + val2;
                case "-" -> this.result = val1 - val2;
                case "*" -> this.result = val1 * val2;
                case "/" -> this.result = val1 / val2;
            }
            //  this.status = OK;
        } catch (InputMismatchException e) {
            System.err.println("Неверная операция: op = \"" + this.op + "\" " + e);
        } catch (NullPointerException e) {
            System.err.println("Не заданы данные: val1 = " + this.val1 + " val2 = " + this.val2 + " " + e);
        } catch (ArithmeticException e) {
            System.err.println("Деление на 0!: " + e);
        }
    }

    public Double getResult() {
        setResult(this.val1, this.val2, this.op);
        return result;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
        //    setResult(this.val1, this.val2, this.op);
    }

    public void setVal2(double val2) {
        this.val2 = val2;
        //    setResult(this.val1, this.val2, this.op);
    }

    public void setOp(String op) {
        this.op = op;
        //    setResult(this.val1, this.val2, this.op);
    }


    @Override
    public String toString() {
        setResult(this.val1, this.val2, this.op);
//        if (this.status == ERROR_OPERATION) {
//            return "Не задана операция!";
//        } else if (this.status == ERROR_VALUES) {
//            return "Не заданы данные: val1 = " + this.val1 + ", val2 = " + this.val2;
//        } else {
        return val1 + " " + op + " " + val2 + " = " + result;
//        }
    }
}
