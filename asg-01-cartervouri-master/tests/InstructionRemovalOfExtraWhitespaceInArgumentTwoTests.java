import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InstructionRemovalOfExtraWhitespaceInArgumentTwoTests {

    @Test
    @DisplayName("argumentTwo() returns a string with tokens separated by a single space")
    void argumentTwo_returns_string_with_tokens_separated_by_single_space() {
        Instruction instruction = new Instruction("take the road\t \tless     \t  \t traveled");

        assertThat(instruction.argumentTwo()).isEqualTo("road less traveled");

    }

}
