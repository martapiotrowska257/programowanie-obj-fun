package test;

import main.StackMethods;
import org.junit.Test;
import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackMethodsTest {

    @Test
    public void testPush() {
        StackMethods stackMethods = new StackMethods();
        stackMethods.pushString("miau");
        assertEquals(1, stackMethods.getSize());
    }

    @Test
    public void testPop() {
        StackMethods stackMethods = new StackMethods();
        stackMethods.pushString("kot");
        assertEquals("kot", stackMethods.popString());
        assertEquals(0, stackMethods.getSize());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopEmptyStack() {
        StackMethods stackMethods = new StackMethods();
        stackMethods.popString();
    }

    @Test
    public void testPeek() {
        StackMethods stackMethods = new StackMethods();
        stackMethods.pushString("pies");
        assertEquals("pies", stackMethods.peekString());
        assertEquals(1, stackMethods.getSize());
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekEmptyStack() {
        StackMethods stackMethods = new StackMethods();
        stackMethods.peekString();
    }

    @Test
    public void testGetSize() {
        StackMethods stackMethods = new StackMethods();
        assertEquals(0, stackMethods.getSize());
        stackMethods.pushString("a");
        stackMethods.pushString("b");
        assertEquals(2, stackMethods.getSize());
        stackMethods.popString();
        assertEquals(1, stackMethods.getSize());
    }
}
