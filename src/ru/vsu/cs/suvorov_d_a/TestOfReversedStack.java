package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;
import java.io.FileNotFoundException;

public class TestOfReversedStack {

    @Test
    public void testReversedStackWithEmptyString() throws FileNotFoundException {
        String testingInput = ("");
        String actualResult = ReverseStack.reverseStringStandardStack(testingInput);
        String correctOutput = ("");

        Assert.assertEquals(correctOutput, actualResult);
    }

    @Test
    public void testReversedStackWithOneSymbolInString() throws FileNotFoundException {
        String testingInput = ("a");
        String actualResult = ReverseStack.reverseStringStandardStack(testingInput);
        String correctOutput = ("a");

        Assert.assertEquals(correctOutput, actualResult);
    }

    @Test
    public void testReversedStackWithStringFomSameElements() throws FileNotFoundException {
        String testingInput = ("aaaaaaaaaa");
        String actualResult = ReverseStack.reverseStringStandardStack(testingInput);
        String correctOutput = ("aaaaaaaaaa");

        Assert.assertEquals(correctOutput, actualResult);
    }

    @Test
    public void testReversedMyStack() throws FileNotFoundException {
        String testingInput = ("Хорошая погода");
        String actualResult = ReverseStack.reverseStringMySimpleStack(testingInput);
        String correctOutput = ("адогоп яашороХ");

        Assert.assertEquals(correctOutput, actualResult);
    }

    @Test
    public void testReversedStandardStack() throws FileNotFoundException {
        String testingInput = ("_*_ 5 test _*_");
        String actualResult = ReverseStack.reverseStringMySimpleStack(testingInput);
        String correctOutput = ("_*_ tset 5 _*_");

        Assert.assertEquals(correctOutput, actualResult);
    }
}