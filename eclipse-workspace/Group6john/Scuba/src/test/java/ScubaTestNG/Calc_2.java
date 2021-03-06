package ScubaTestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 

public class Calc_2 {
    @Test(dataProvider = "inputs")

 

    public static void divReal(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }

 

        //double result = ( number1 / number2);
        Reporter.log("The divReal value is" +( double) number1/number2 ,true);
    }

 

    @Test(dataProvider = "inputs_dbl",groups = "test_2")
    public static void exp(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }

 

        double result1 = Math.pow(number1, number2);
        Reporter.log("The exponential value is" + result1,true);
    }

 

    @Test(dataProvider = "inputs")
    public static void mod(int number1, int number2) {

 

        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }

 

        int result2 = number1 % number2;
        Reporter.log("The mod value is" + result2,true);
    }

 

    @Parameters({ "number1" })
    @Test
    public static void inverse(int number1) {
        if (number1 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }

 

        int result3 = 1 / number1;
        Reporter.log("The inverse value is" + result3,true);
    }

 

    @Parameters({ "number1" })
    @Test
    public static void negate(int number1) {
        if (number1 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }

 

        int result4 = (-1) * number1;
        Reporter.log("The negative value is" + result4,true);
    }

 

    @DataProvider(name = "inputs")
    public Object[][] getData() {
        return new Object[][] { { 1, 10 }, { 2, 6 }, { 3, 50 } };
    }

 

    @DataProvider(name = "inputs_dbl")
    public Object[][] getData1() {
        return new Object[][] { { 1.5, 10.0 }, { 2.6, 6.5 }, { 3.8, 50.0 } };
    }

 

}
 