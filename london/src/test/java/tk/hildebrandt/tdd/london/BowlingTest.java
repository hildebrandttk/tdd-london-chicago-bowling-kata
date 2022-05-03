package tk.hildebrandt.tdd.london;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class BowlingTest {

   private Bowling game;

   @BeforeEach
   void setUp() {
      game = new Bowling();
   }

   @Test
   void scoreIs0_afterRollingOnly0s() {
      roll(0, 0, 0, 0);

      int score = game.score();

      assertThat(score).isEqualTo(0);
   }

   @Test
   void scoreIs1_afterRolling1() {
      roll(1);

      int score = game.score();

      assertThat(score).isEqualTo(1);
   }

   @Test
   void scoreCountsNextRollAsBonus_afterRollingSpare() {
      roll(1, 9, 1);

      int score = game.score();

      assertThat(score).isEqualTo(11 + 1);
   }

   @Test
   void addBonusOnlyWhenSpareIsInFrame() {
      roll(0, 5, 5, 2);
      int score = game.score();
      assertThat(score).isEqualTo(5 + 7);
   }

   @Test
   void addNextTwoRollsBonus_afterRollingStrike() {
      roll(10, 5, 5, 2);
      int score = game.score();
      assertThat(score).isEqualTo(20 + 12 + 2);
   }

   @Test
   void countAdditionalTwoStrikes_afterFirstStrike() {
      roll(10, 10, 10);
      int score = game.score();
      assertThat(score).isEqualTo(30 + 20 + 10);
   }

   private void roll(int... pins) {
      for (int pin : pins) {
         game.roll(pin);
      }
   }
}