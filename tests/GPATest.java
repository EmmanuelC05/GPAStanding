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

    @Test
    @DisplayName("Fail on converting E to value")
    void testGradeConversion7() {
        GPA calc = new GPA();
        assertThrows(IllegalArgumentException.class, () -> calc.convertGrade("E"));
    }

    @Test
    @DisplayName("GPA Standing 1.0 to Needs Help")
    void gpaStanding1() {
        assertEquals("Needs Help", GPA.checkStanding(1.0));
    }

    @Test
    @DisplayName("GPA Standing 1.2 to Needs Help")
    void gpaStanding2() {
        assertEquals("Needs Help", GPA.checkStanding(1.2));
    }

    @Test
    @DisplayName("GPA Standing 1.5 to Needs Help")
    void gpaStanding3() {
        assertEquals("Needs Help", GPA.checkStanding(1.5));
    }

    @Test
    @DisplayName("GPA Standing 2.1 to Good Standing")
    void gpaStanding4() {
        assertEquals("Good Standing", GPA.checkStanding(2.1));
    }

    @Test
    @DisplayName("GPA Standing 3.0 to Very Good Standing")
    void gpaStanding5() {
        assertEquals("Very Good Standing", GPA.checkStanding(3.0));
    }

    @Test
    @DisplayName("GPA Standing 3.5 to Very Good Standing")
    void gpaStanding6() {
        assertEquals("Very Good Standing", GPA.checkStanding(3.5));
    }

}