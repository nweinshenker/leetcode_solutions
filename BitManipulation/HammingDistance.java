package BitManipulation;
import org.junit.Test;
import org.junit.experimental.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int hamDistance = 0;
        for (int i = 0; i <= 31; i++) {
            hamDistance += ((x & 1) != (y & 1)) ? 1 : 0;
            x = x >>> 1;
            y = y >>> 1;
        }
        return hamDistance;
    }

    @ParameterizedTest
    @ValueSource(ints = {{0,1}, {2,3}, {3,3}})
    public testHammingDistance(int x, int y) {
        
    }
}
