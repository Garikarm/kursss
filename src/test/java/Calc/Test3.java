package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3 {

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
              assertEquals("502.73",testingClass.getP(10, 39, 24, 55));
           }
    } 
