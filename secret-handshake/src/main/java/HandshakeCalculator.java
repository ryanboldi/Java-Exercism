import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class HandshakeCalculator {
    List<Signal> calculateHandshake(int number) {
        if (number > 127) { throw new IllegalArgumentException(); }
        //                  [1  2  4  8 16 32 64]
        int[] placeValues = {0, 0, 0, 0, 0, 0, 0};
        int remainder = number;
        ArrayList<Signal> signals = new ArrayList<Signal>();
        
        for (int i = 6 ; i >= 0; i--){
            if (remainder >= (Math.pow(2, i))){
                remainder -= Math.pow(2, i);
                placeValues[i] = 1;
                if (i < 4) signals.add(Signal.values()[i]);
            }
        }

        if (placeValues[4] == 0) Collections.reverse(signals);
        return signals;
    }
}
