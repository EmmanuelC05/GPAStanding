import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GPATest {

    @Test
    void checkNeedsHelp() {
        assertAll(() -> {
            assertEquals("Needs Help", GPA.checkStanding(1.7)),
            assertEquals("Needs Help", GPA.checkStanding(1.5)),
            assertEquals("Needs Help", GPA.checkStanding(1.2))
        });
    }
}