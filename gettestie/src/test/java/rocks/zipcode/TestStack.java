package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    //add additional test for push?
    //add tests for pop, peek, isEmpty
    @Test
    public void TestStack2() {
        Stack<String> stack = new Stack<>();
        stack.push("test1");
        stack.push("test2");
        assertEquals("test2", stack.peek());
    }

    @Test
    public void testStack3() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        Integer expected = 3;
        assertEquals(expected, stack.pop());
    }
}
