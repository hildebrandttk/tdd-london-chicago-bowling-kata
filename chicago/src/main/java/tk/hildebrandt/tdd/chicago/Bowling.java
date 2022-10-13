package tk.hildebrandt.tdd.chicago;

import java.util.ArrayList;
import java.util.List;

public class Bowling {

   private int score;
   List<Integer> scores = new ArrayList<>();

   void roll(int pins) {
      score += pins;
      scores.add(pins);
   }

   int score() {
      int bonus = 0;
      for (int i = 2; i < scores.size(); i = i+2) {
         if (scores.get(i - 2) + scores.get(i - 1) == 10) {
            bonus += scores.get(i);
         }
      }
      return scores.stream().reduce(0, Integer::sum) + bonus;
   }
}
