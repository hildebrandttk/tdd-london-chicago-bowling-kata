package tk.hildebrandt.tdd.chicago;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
   private Game game = new Game();

   @Test
   void gameContainsOf10Frames(){
      Frame[] fames = game.getFames();

      assertThat(fames).hasSize(10);
   }
}
