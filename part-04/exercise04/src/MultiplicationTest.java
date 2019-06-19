import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {


        private Multiplication multiplication=new Multiplication();

        @Test
        void isMultiple() {
            boolean actual  = multiplication.isMultiple(8, 1);
            boolean expected= true;
            Assertions.assertEquals(actual,expected);
        }
    }
