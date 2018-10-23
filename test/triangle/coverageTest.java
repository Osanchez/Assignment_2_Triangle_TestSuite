package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */

/**
 *  INVALID, SCALENE, EQUILATERAL, ISOSCELES
 *  test have 100% code coverage
 */
public class coverageTest {

    @Test
    public void test1() {
        Type actual = Triangle.classify(3, 3, 3);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        Type actual = Triangle.classify(1,2,3);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        Type actual = Triangle.classify(1,4,3);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        Type actual = Triangle.classify(7,3,4);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test5() {
        Type actual = Triangle.classify(3,3,4);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void test6() {
        Type actual = Triangle.classify(3,4,5);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void test7() {
        Type actual = Triangle.classify(-1,3,2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test8() {
        Type actual = Triangle.classify(1,-3,2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test9() {
        Type actual = Triangle.classify(1,3,-2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test10() {
        Triangle newTriangle = new Triangle();
    }

    @Test
    public void test11() {
        Type actual = Triangle.classify(2,3,2);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void test12() {
        Type actual = Triangle.classify(3,3,7);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void test13() {
        Type actual = Triangle.classify(3,7,3);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void test14() {
        Type actual = Triangle.classify(7,3,3);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void test15() {
        Type actual = Triangle.classify(5,3,3);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

}
