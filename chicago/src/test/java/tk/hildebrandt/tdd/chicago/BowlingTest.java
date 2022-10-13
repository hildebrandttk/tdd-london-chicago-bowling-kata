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
   void scoreIs4AfterRolling4AsFirstRoll() {
      game.roll(4);

      assertThat(game.score()).isEqualTo(4);
   }

   @Test
   void scoreIs9AfterRolling4And5AsFirstFrame() {
      game.roll(4);
      game.roll(5);

      int score = game.score();

      assertThat(score).isEqualTo(9);
   }

   @Test
   void addBonusAfterRollingASpare() {
      game.roll(4);
      game.roll(6);
      game.roll(7);

      int score = game.score();

      assertThat(score).isEqualTo(4 + 6 + 7 + 7);
   }
}