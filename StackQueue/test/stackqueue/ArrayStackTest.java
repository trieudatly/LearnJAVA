package stackqueue;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lytri
 */
public class ArrayStackTest {

    public ArrayStackTest() {
    }

    /**
     * Test of isEmpty method, of class ArrayStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayStack instance = new ArrayStack();
        assertTrue(instance.isEmpty());
        instance.push("facebook.com");
        assertFalse(instance.isEmpty());
        instance.pop();
        assertTrue(instance.isEmpty());

    }

    /**
     * Test of push method, of class ArrayStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        ArrayStack instance = new ArrayStack();
        for (int i = 0; i < 100; i++) {
            assertTrue(instance.push("facebook.com"));
        }

    }

    /**
     * Test of pop method, of class ArrayStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        ArrayStack instance = new ArrayStack();
        assertEquals("", instance.pop());
        instance.push("facebook.com");
        instance.push("google.com");
        instance.push("dantri.com");
        assertEquals("dantri.com", instance.pop());
        assertEquals("google.com", instance.pop());
        assertEquals("facebook.com", instance.pop());
        assertEquals("", instance.pop());

    }

    /**
     * Test of peek method, of class ArrayStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        ArrayStack instance = new ArrayStack();
        instance.push("facebook.com");
        instance.push("google.com");
        instance.push("dantri.com");
        assertEquals("dantri.com", instance.peek());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class ArrayStack.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        ArrayStack instance = new ArrayStack();
        instance.push("google.com");
        assertEquals("google.com|", instance.show());
        instance.push("dantri.vn");
        assertEquals("google.com|dantri.vn|", instance.show());
        instance.push("tuoitre.com");
        assertEquals("google.com|dantri.vn|tuoitre.com|", instance.show());
        instance.push("facebook.com");
        assertEquals("google.com|dantri.vn|tuoitre.com|facebook.com|", instance.show());

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
