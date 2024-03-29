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


   private void roll(int... pins) {
      for (int pin : pins) {
         game.roll(pin);
      }
   }
}