package tk.hildebrandt.tdd.chicago;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FrameTest {

   @Test
   void isSpare() {
      Frame frame = new Frame();
      assertThat(frame.isSpare()).isFalse();
   }
}