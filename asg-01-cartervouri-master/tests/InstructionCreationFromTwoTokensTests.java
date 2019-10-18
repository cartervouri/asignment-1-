import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InstructionCreationFromTwoTokensTests {

    private Instruction instruction;

    @BeforeEach
    void setup() {
        instruction = new Instruction("lOOk YonDER");
    }

    @Test
    @DisplayName("an instruction made from two tokens should have the first token capitalized as its command()")
    void instruction_made_from_two_tokens_1() {

        assertThat(instruction.command()).isEqualTo("LOOK");

    }

    @Test
    @DisplayName("an instruction made from two tokens should have the second token as argumentOne()")
    void instruction_made_from_two_tokens_2() {

        assertThat(instruction.argumentOne()).isEqualTo("YonDER");

    }

    @Test
    @DisplayName("an instruction made from a single token should have an empty string as argumentTwo()")
    void instruction_made_from_two_tokens_3() {

        assertThat(instruction.argumentTwo()).isEqualTo("");
    }

}
