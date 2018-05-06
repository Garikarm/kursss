package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test4 {

    physhicalCalc testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new physhicalCalc();
    }

   @AfterEach
    void tearDown() {
        testingClass = null;
    }

    @Test
    void getK() {
        assertEquals("6.26",testingClass.getK(22, 52, 5.6));
      }
} 
