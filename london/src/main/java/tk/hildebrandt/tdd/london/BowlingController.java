package tk.hildebrandt.tdd.london;

public class BowlingController implements Bowling{

   private BowlingGame bowlingGame;

   public BowlingController(BowlingGame bowlingGame) {
      this.bowlingGame = bowlingGame;
   }

   @Override
   public void roll(int pins) {

   }

   @Override
   public int score() {
      return convert(bowlingGame.score());
   }

   private int convert(Score score) {
      return score.getValue();
   }
}
