package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test5 {

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
        assertEquals("127.19",testingClass.getP(16, 4, 37, 55)); 
          }
} 
