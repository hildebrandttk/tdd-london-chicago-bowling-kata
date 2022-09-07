package tk.hildebrandt.tdd.london;

public class BowlingController implements Bowling{

   private final BowlingGame bowlingGame;
   private final ScoreConverter scoreConverter;

   public BowlingController(BowlingGame bowlingGame, ScoreConverter scoreConverter) {
      this.bowlingGame = bowlingGame;
      this.scoreConverter = scoreConverter;
   }

   @Override
   public void roll(int pins) {

   }

   @Override
   public int score() {
      return scoreConverter.convertToPlain(bowlingGame.score());
   }
}
