package au.edu.usc.mathgame;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class QuestionTest {
    @Test
    void testCreate() {
        Question q = new Question(3, 4, "+");
        assertFalse(q.checkAnswer(0));
    }

}
