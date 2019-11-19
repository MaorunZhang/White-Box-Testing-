package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	a = hw.Method3(6, 0, 1);
    	a = hw.Method3(5, -1, 1);
    	a = hw.Method3(5,0,1);
        a = hw.Method3(6,-1,0);
        a = hw.Method3(6,0,0);
        a = hw.Method3(5,-1,0);
        a = hw.Method3(5,0,0);
        a = hw.Method3(4,0,-3);
        a = hw.Method3(4,0,-2);
        a = hw.Method3(5,0,-3);
        a = hw.Method3(5,0,-2);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */

    @Test
    public void testBug(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(5);
        a = hw.bug(4);
    }

    @Test
    public void testMethod4(){
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 1,2,3,4);
        a = hw.Method4(1,1,2,3,4);
        //a = hw.Method4(1,2,2,2,4);
        a = hw.Method4(1,1,2,2,4);
        //a = hw.Method4(1,2,2,3,4);
        a = hw.Method4(5,5,2,2,4);
        a = hw.Method4(5,5,2,3,4);
        a = hw.Method4(5,4,2,2,4);
        a = hw.Method4(0,0,2,2,4);
        a = hw.Method4(0,0,2,3,4);
        a = hw.Method4(0,1,2,2,4);
    }


    @Test
    public void testIsTriangle(){
        HelloWorld hw = new HelloWorld();
        boolean flag = hw.isTriangle(0,0,0);
        flag = hw.isTriangle(-1,-2,-3);
        flag = hw.isTriangle(1,2,3);
        flag = hw.isTriangle(3,1,2);
        flag = hw.isTriangle(2,3,1);
        flag = hw.isTriangle(3,4,5);
        flag = hw.isTriangle(0,0,1);
        flag = hw.isTriangle(0,1,0);
        flag = hw.isTriangle(1,0,0);
        flag = hw.isTriangle(1,1,0);
        flag = hw.isTriangle(1,0,1);
        flag = hw.isTriangle(0,1,1);
    }

    @Test
    public void testIsBirthday(){
        HelloWorld hw = new HelloWorld();
        boolean flag = hw.isBirthday(1989, 1,1);
        flag = hw.isBirthday(2020, 1,1);
        flag = hw.isBirthday(2019, 10,1);
        flag = hw.isBirthday(2018, 0,1);
        flag = hw.isBirthday(2018, 13,1);
        flag = hw.isBirthday(2018, 0,1);
        flag = hw.isBirthday(2000, 2,29);
        flag = hw.isBirthday(2001, 2,29);
        flag = hw.isBirthday(2004, 2,29);
        flag = hw.isBirthday(2004,1,31);
        flag = hw.isBirthday(2004, 4,30);
        flag = hw.isBirthday(2019,9,30);
        flag = hw.isBirthday(2019, 9,31);
        flag = hw.isBirthday(1989, 0,1);
        flag = hw.isBirthday(1989,1,32);
        flag = hw.isBirthday(2016, 1,0);
        flag = hw.isBirthday(2016, 1,32);
        flag = hw.isBirthday(2016, 2,0);
        flag = hw.isBirthday(2016, 2,29);
        flag = hw.isBirthday(2016, 3,0);
        flag = hw.isBirthday(2016, 3,32);
        flag = hw.isBirthday(2016, 4,0);
        flag = hw.isBirthday(2016, 4,31);
        flag = hw.isBirthday(2016, 5,0);
        flag = hw.isBirthday(2016, 5,32);
        flag = hw.isBirthday(2016, 6,0);
        flag = hw.isBirthday(2016, 6,31);
        flag = hw.isBirthday(2016, 7,0);
        flag = hw.isBirthday(2016, 7,32);
        flag = hw.isBirthday(2016, 8,0);
        flag = hw.isBirthday(2016, 8,32);
        flag = hw.isBirthday(2016, 9,0);
        flag = hw.isBirthday(2016, 9,31);
        flag = hw.isBirthday(2016, 10,0);
        flag = hw.isBirthday(2016, 10,32);
        flag = hw.isBirthday(2016, 11,0);
        flag = hw.isBirthday(2016, 11,32);
        flag = hw.isBirthday(2016, 12,0);
        flag = hw.isBirthday(2016, 12,32);
        flag = hw.isBirthday(1900, 2,29);
        flag = hw.isBirthday(1900, 2,28);
        flag = hw.isBirthday(2020, 0,1);
        flag = hw.isBirthday(2020, 13,1);
    }

    @Test
    public void testMiniCalculator(){
        HelloWorld hw = new HelloWorld();
        Double a = hw.miniCalculator(1,1,'+');
        a = hw.miniCalculator(1,1,'-');
        a = hw.miniCalculator(1,1,'*');
        a = hw.miniCalculator(1,1,'/');
        a = hw.miniCalculator(1,0,'+');
        a = hw.miniCalculator(1,0,'-');
        a = hw.miniCalculator(1,0,'*');
        a = hw.miniCalculator(1,0,'/');
        a = hw.miniCalculator(1,1,'=');
    }
}
