import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InstructionCreationFromZeroTokensTests {

    private Instruction instruction;

    @BeforeEach
    void setup() {
        instruction = new Instruction("");
    }

    @Test
    @DisplayName("an instruction made from no tokens should have an empty string as its command()")
    void instruction_made_from_zero_tokens_1() {

        assertThat(instruction.command()).isEqualTo("");

    }

    @Test
    @DisplayName("an instruction made from no tokens should have an empty string as argumentOne()")
    void instruction_made_from_zero_tokens_2() {

        assertThat(instruction.argumentOne()).isEqualTo("");

    }

    @Test
    @DisplayName("an instruction made from no tokens should have an empty string as argumentTwo()")
    void instruction_made_from_zero_tokens_3() {

        assertThat(instruction.argumentTwo()).isEqualTo("");
    }

}
