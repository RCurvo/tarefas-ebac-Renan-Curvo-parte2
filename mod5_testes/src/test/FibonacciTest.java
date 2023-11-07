package test;

import main.ebac.backend.java.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    Fibonacci fib = new Fibonacci();

    @Test
    public void fibonacciOfZero(){
        int result = fib.getFibElement(0);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void fibonacciOfOne(){
        int result = fib.getFibElement(1);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void fibonacciOfTen(){
        int result = fib.getFibElement(10);
        Assert.assertEquals(result, 55);
    }
}
