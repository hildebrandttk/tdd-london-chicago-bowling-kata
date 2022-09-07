package tk.hildebrandt.tdd.london;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ScoreConverterTest {
   private final ScoreConverter converter = new ScoreConverter();

   @Test
   void testExistingValueToPlain(){
      assertThat(converter.convertToPlain(new Score(0))).isEqualTo(0);
   }
}