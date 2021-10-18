package root.gcd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GCDTest {
    GCD gcd = new GCD();

    @Test
    void positiveTest() {
        assertEquals(gcd.gcd(3, 5), 1);
        assertEquals(gcd.gcd(4, 8), 4);
    }

    @Test
    void negativeTest() {
        assertEquals(gcd.gcd(-3, 9), 3);
        assertEquals(gcd.gcd(3, -9), 3);
        assertEquals(gcd.gcd(-3, -9), 3);
    }

    @Test
    void zeroTest() {
        assertEquals(gcd.gcd(0, 9), 9);
        assertEquals(gcd.gcd(9, 0), 9);
        assertEquals(gcd.gcd(0, 0), 0);
        assertEquals(gcd.gcd(0, -9), 9);
        assertEquals(gcd.gcd(-9, 0), 9);
    }

    @Test
    void primeTest() {
        assertEquals(gcd.gcd(11, 21), 1);
        assertEquals(gcd.gcd(21, 11), 1);
        assertEquals(gcd.gcd(4, 9), 1);
    }

    @Test
    void equalTest() {
        assertEquals(gcd.gcd(11, 11), 11);
        assertEquals(gcd.gcd(1000, 1000), 1000);
    }

    @Test
    void divisionTest() {
        assertEquals(gcd.gcd(3, 27), 3);
        assertEquals(gcd.gcd(30, 10), 10);
    }

    @Test
    void notEqualTest() {
        assertEquals(gcd.gcd(4, 8), 4);
        assertEquals(gcd.gcd(15, 35), 5);
    }

    @Test
    void intMaxTest() {
        assertEquals(gcd.gcd(Integer.MAX_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE);
        assertEquals(gcd.gcd(Integer.MAX_VALUE, 5436), 1);
        assertEquals(gcd.gcd(5436, Integer.MAX_VALUE), 1);
    }

    @Test
    void intMinTest() {
        assertEquals(gcd.gcd(Integer.MIN_VALUE, 2), 2);
        assertEquals(gcd.gcd(-2, Integer.MIN_VALUE), 2);
        assertEquals(gcd.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE), -(long) Integer.MIN_VALUE);
    }

    @Test
    void fibonacciTest() {
        assertEquals(gcd.gcd(10946, 6765), 1);
        assertEquals(gcd.gcd(4181, 2584), 1);
    }


}