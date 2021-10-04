package root.gcd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {
    GCD gcd=new GCD();

    @Test
    void firstPos() {
        assertEquals(gcd.gcd(3,9),3); //-2147483648 требование не покрывает данный случай

    }
@Test
void positive(){
    assertEquals(gcd.gcd(3,5),1);
    assertEquals(gcd.gcd(11,11),11);
    assertEquals(gcd.gcd(4,8),4);
    assertEquals(gcd.gcd(8,4),4);
    assertEquals(gcd.gcd(3,9),3);
    assertEquals(gcd.gcd(9,3),3);
    assertEquals(gcd.gcd(3,3),3);
    assertEquals(gcd.gcd(34,55),1);
    assertEquals(gcd.gcd(21,34),1);
    assertEquals(gcd.gcd(124, 124),124);
}
@Test
void negative(){
    assertEquals(gcd.gcd(-3,9),3);
    assertEquals(gcd.gcd(3,-9),3);
    assertEquals(gcd.gcd(-3,-9),3);
    assertEquals(gcd.gcd(-34,-55),1);
    assertEquals(gcd.gcd(34, -21),1);
    assertEquals(gcd.gcd(21, -34),1);
    assertEquals(gcd.gcd(-124, -124),124);
}
@Test
void borderCases(){
    assertEquals(gcd.gcd(2147483647,2147483647),2147483647);
    assertEquals(gcd.gcd(2147483647,5436),1);
    assertEquals(gcd.gcd(1352125,2147483647),1);
    assertEquals(gcd.gcd(-2147483648,2),2);
    assertEquals(gcd.gcd(2,-2147483648),2);
    assertEquals(gcd.gcd(-2147483648,-2147483648), 1073741824);
    assertEquals(gcd.gcd(-2147483648,-2), 2);
}

    @Test
    void zeroCases(){
        assertEquals(gcd.gcd(0,9),9);
        assertEquals(gcd.gcd(9,0),9);
        assertEquals(gcd.gcd(0,0),0);
        assertEquals(gcd.gcd(0,-9),9);
        assertEquals(gcd.gcd(-9, 0),9);
    }
}