/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void addShouldAddTwoIntegers() {
        // Setup
        int expected = 2;
        Library classUnderTest = new Library();

        // Exercise
        int actual = classUnderTest.add(1, 1);

        // Assert
        assertEquals("1 + 1 should equal 2", expected, actual);

        // Teardown
    }
}
