import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GPATest {

    @Test
    @DisplayName("Convert grade D to 1.0")
    void testGradeConversion2() {
        GPA calc = new GPA();
        assertEquals(1.0, calc.convertGrade("D"));
    }

    @Test
    @DisplayName("Convert grade D+ to 1.33")
    void testGradeConversion3() {
        GPA calc = new GPA();
        assertEquals(1.33, calc.convertGrade("D+"));
    }

    @Test
    @DisplayName("Convert grade D- to 0.67")
    void testGradeConversion4() {
        GPA calc = new GPA();
        assertEquals(0.67, calc.convertGrade("D-"));
    }

    @Test
    @DisplayName("Convert grade B- to 1.0")
    void testGradeConversion5() {
        GPA calc = new GPA();
        assertEquals(2.67, calc.convertGrade("B-"));
    }

    @Test
    @DisplayName("Convert grade F to 0.0")
    void testGradeConversion6() {
        GPA calc = new GPA();
        assertEquals(0.0, calc.convertGrade("F"));
    }
}