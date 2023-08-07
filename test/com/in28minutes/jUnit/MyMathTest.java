package com.in28minutes.jUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private MyMath myMath = new MyMath();

    @Test
    void calculateThreeMemberArray() {
        assertEquals(6, myMath.calculateSum(new int[]{1, 2, 3}));
    }
    @Test
    void calculateZeroMemberArray() {
        assertEquals(0, myMath.calculateSum(new int[]{}));
    }
    @Test
    void calculateTenMemberArray(){
        assertEquals(55, myMath.calculateSum(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}