package tk.hildebrandt.tdd.chicago;

import org.junit.jupiter.api.BeforeEach;

class BowlingTest {

   private Bowling game;

   @BeforeEach
   void setUp() {
      game = new Bowling();
   }
}