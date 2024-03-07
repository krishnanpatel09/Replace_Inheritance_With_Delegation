package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.EmptyStackException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    //Test Case for Push
    public void testPush(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        assertEquals(1, myStack.size());
        myStack.push(2);
        assertEquals(2, myStack.size());
    }

    //Test Case for Pop
    public void testPop(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        assertEquals(Integer.valueOf(2), myStack.pop());
    }
}
