package tk.hildebrandt.tdd.london;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BowlingTest {

   private Bowling game;
   private BowlingGame bowlingGameMock;

   @BeforeEach
   void setUp() {
      bowlingGameMock = mock(BowlingGame.class);
      game = new BowlingController(bowlingGameMock);
   }

   @Test
   void returnsScore0_afterRolling0() {
      when(bowlingGameMock.score()).thenReturn(new Score(0));
      game.roll(0);

      int score = game.score();

      assertThat(score).isEqualTo(0);
   }
}