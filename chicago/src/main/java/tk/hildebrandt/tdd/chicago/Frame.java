package tk.hildebrandt.tdd.chicago;

public class Frame {
   private final int firstRoll;
   private int secondRoll;

   public Frame(int firstRoll) {
      this.firstRoll = firstRoll;
   }

   public int getScore() {
      return firstRoll + secondRoll;
   }

   public void addSecondRoll(int secondRoll) {

      this.secondRoll = secondRoll;
   }

   public boolean isSpare() {
      return firstRoll + secondRoll == 10;
   }
}
