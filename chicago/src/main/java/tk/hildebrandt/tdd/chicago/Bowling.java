package tk.hildebrandt.tdd.chicago;

import java.util.ArrayList;
import java.util.List;

public class Bowling {
   private List<Integer> rolls = new ArrayList<>();
   void roll(int pins) {
      rolls.add(pins);
   }

   int score() {
      int bonus = 0;
      for (int i = 2; i < rolls.size(); i++) {
         if(rolls.get(i-2) + rolls.get(i-1) == 10) {
            bonus += rolls.get(i);
         }
      }
      return rolls.stream().reduce(0, Integer::sum) + bonus;
   }
}
