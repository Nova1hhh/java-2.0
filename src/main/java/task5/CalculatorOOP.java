package task5;

public class CalculatorOOP {
    private Double result;
    private Double val1;
    private Double val2;
    private String op;
    private int status;

    private static final int ERROR_VALUES = -1;
    private static final int ERROR_OPERATION = -2;
    private static final int OK = 0;

    public CalculatorOOP() {
        this.status = ERROR_VALUES;
    }

    public CalculatorOOP(double val1, double val2, String op) {
        this.val1 = val1;
        this.val2 = val2;
        this.op = op;
        setResult(val1, val2, op);
    }

    private void setResult(Double val1, Double val2, String op) {
        if (val1 == null || val2 == null) {
            this.status = ERROR_VALUES;
        } else if (op == null) {
            this.status = ERROR_OPERATION;
        } else {
            switch (op) {
                case "+" -> this.result = val1 + val2;
                case "-" -> this.result = val1 - val2;
                case "*" -> this.result = val1 * val2;
                case "/" -> this.result = val1 / val2;
            }
            this.status = OK;
        }
    }

    public Double getResult() {
        setResult(this.val1, this.val2, this.op);
        if (this.status == OK) {
            return result;
        } else {
            return null;
        }
    }

    public void setVal1(double val1) {
        this.val1 = val1;
        setResult(this.val1, this.val2, this.op);
    }

    public void setVal2(double val2) {
        this.val2 = val2;
        setResult(this.val1, this.val2, this.op);
    }

    public void setOp(String op) {
        this.op = op;
        setResult(this.val1, this.val2, this.op);
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
    //    setResult(this.val1, this.val2, this.op);
        if (this.status == ERROR_OPERATION) {
            return  "Не задана операция!";
        } else if (this.status == ERROR_VALUES) {
            return "Не заданы данные: val1 = " + this.val1 + ", val2 = " + this.val2;
        } else {
            return val1 + " " + op + " " + val2 + " = " + result;
        }
    }
}
