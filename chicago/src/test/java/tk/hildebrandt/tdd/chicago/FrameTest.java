package tk.hildebrandt.tdd.chicago;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FrameTest {

   @Test
   void rollFirstRollInFrameReturnsScoreOfRoll() {
      Frame frame = new Frame(4);

      int score = frame.getScore();
      assertThat(score).isEqualTo(4);
   }

   @Test
   void rollSecondRollInFrameReturnsSumOfRolls() {
      Frame frame = new Frame(4);

      frame.addSecondRoll(5);

      int score = frame.getScore();
      assertThat(score).isEqualTo(4 + 5);
   }

   @Test
   void isSpareIfSumOfBothRollsIs10() {
      Frame frame = new Frame(4);

      frame.addSecondRoll(6);

      boolean spare = frame.isSpare();
      assertThat(spare).isTrue();
   }
}
