import org.junit.Assert;
import org.junit.Test;
import task5.CalculatorOOP;

public class UnitTestCalculator {
    Double val1 = -1000 + Math.random() * 1000;
    Double val2 = -1000 + Math.random() * 1000;
    String[] operations = {"+", "-", "*"};
    int indexOperation = (int) (Math.random() * 2);
    String op = operations[indexOperation];
    Double result;

    public Double expectedResult(){
        switch (op) {
            case "+" -> result = val1 + val2;
            case "-" -> result = val1 - val2;
            case "*" -> result = val1 * val2;
        }
        return result;
    }

    @Test
    public void checkEmptyCalculator(){
        CalculatorOOP calculator = new CalculatorOOP();
        Assert.assertNull(calculator.getVal1());
        Assert.assertNull(calculator.getVal2());
        Assert.assertNull(calculator.getOp());
    }

    @Test
    public void checkConstructorWithParams(){
        CalculatorOOP calculatorOOP = new CalculatorOOP(val1, val2, op);
        Assert.assertEquals(val1, calculatorOOP.getVal1());
        Assert.assertEquals(val2, calculatorOOP.getVal2());
        Assert.assertEquals(op, calculatorOOP.getOp());
        Assert.assertEquals(expectedResult(), calculatorOOP.getResult());
    //    System.out.println(val1 + " " + val2 + " " + op);
    }

    @Test
    public void checkSetters(){
        CalculatorOOP calculatorOOP = new CalculatorOOP();
        calculatorOOP.setVal1(val1);
        calculatorOOP.setVal2(val2);
        calculatorOOP.setOp(op);
    //    System.out.println(val1 + " " + val2 + " " + op);
        checkConstructorWithParams();
    }

    @Test
    public void checkGetters(){
        CalculatorOOP calculatorOOP = new CalculatorOOP(val1, val2, op);
        Assert.assertEquals(val1, calculatorOOP.getVal1());
    }

    @Test
    public void checkDivisionByZero(){
        CalculatorOOP calculatorOOP = new CalculatorOOP();
        calculatorOOP.setVal1(val1);
        calculatorOOP.setVal2(0);
        calculatorOOP.setOp("/");
        Assert.assertNull(calculatorOOP.getResult());
    }

    @Test
    public void checkIncorrectOperation(){
        CalculatorOOP calculatorOOP = new CalculatorOOP();
        calculatorOOP.setVal1(val1);
        calculatorOOP.setVal2(val2);
        calculatorOOP.setOp("asdf");
        Assert.assertNull(calculatorOOP.getResult());
    }

    @Test
    public void checkIncorrectValues(){
        CalculatorOOP calculatorOOP = new CalculatorOOP();
        calculatorOOP.setOp(op);
        Assert.assertNull(calculatorOOP.getResult());
    }

}
