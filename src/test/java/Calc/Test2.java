package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2 {

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
        assertEquals("24.8",testingClass.getK(21, 44, 27.5));
      }
} 
