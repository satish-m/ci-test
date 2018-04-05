package junit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitHelloWorldTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isGreaterTest() {
        System.out.println("Test");
        JUnitHelloWorld tester = new JUnitHelloWorld();
        assertTrue("Num 1 is greater than Num 2", tester.isGreater(4, 3));
    }

    @Test
    public void greetTest() {
        String name = "World";
        JUnitHelloWorld tester = new JUnitHelloWorld();
        String greet = tester.greet(name);
        String expected = "Hello : " + name;
        assertTrue(expected.equals(greet));
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
