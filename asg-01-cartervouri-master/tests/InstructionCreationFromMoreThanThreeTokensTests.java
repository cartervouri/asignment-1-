import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InstructionCreationFromMoreThanThreeTokensTests {

    private Instruction instruction;

    @BeforeEach
    void setup() {
        instruction = new Instruction("CLick tHAt cat goOD SIR");
    }

    @Test
    @DisplayName("an instruction made from more than three tokens should have the first token capitalized as its command()")
    void instruction_made_from_more_than_three_tokens_1() {

        assertThat(instruction.command()).isEqualTo("CLICK");

    }

    @Test
    @DisplayName("an instruction made from more than three tokens should have the second token as argumentOne()")
    void instruction_made_from_more_than_three_tokens_2() {

        assertThat(instruction.argumentOne()).isEqualTo("tHAt");

    }

    @Test
    @DisplayName("an instruction made from more than three tokens should have the third token onward as argumentTwo()")
    void instruction_made_from_more_than_three_tokens_3() {

        assertThat(instruction.argumentTwo()).isEqualTo("cat goOD SIR");

    }

}
