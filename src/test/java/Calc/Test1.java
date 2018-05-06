package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1 {

    korporateCalc testingClass;

    @BeforeEach
   void setUp() {
        testingClass = new korporateCalc();
    }

   @AfterEach
   void tearDown() {
        testingClass = null;
   }

    @Test
    void getP() {
        assertEquals("75.6",testingClass.getP(12, 18, 64, 5.6));
          }
} 
