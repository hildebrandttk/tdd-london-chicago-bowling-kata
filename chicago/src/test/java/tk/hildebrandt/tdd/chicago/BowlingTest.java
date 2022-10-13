package tk.hildebrandt.tdd.chicago;

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
   void scoreIs4AfterRolling4() {
      game.roll(4);

      assertThat(game.score()).isEqualTo(4);
   }

   @Test
   void scoreIs9AfterRolling3and6() {
      game.roll(3);
      game.roll(6);

      assertThat(game.score()).isEqualTo(3 + 6);
   }

   @Test
   void addBonusForSpareAfterRollingSpare() {
      roll(3, 7, 9);

      assertThat(game.score()).isEqualTo(3 + 7 + 9 + 9);
   }

   @Test
   void addNoBonusIfSpareInNotWithinFrame() {
      roll(2, 3, 7, 1);

      assertThat(game.score()).isEqualTo(2 + 3 + 7 + 1);
   }

   private void roll(int... pins) {
      for (int pin : pins) {
         game.roll(pin);
      }
   }
}