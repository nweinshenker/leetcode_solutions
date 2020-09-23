package Math;

public class CountOddNumbers {
    public int countOdds(int low, int high) {
        if ((low % 2 == 1 && high % 2 == 0) || (low % 2 == 0 && high % 2 == 1)) {
            return (high - low) / 2 + 1;
        }
        else if (low % 2 == 1 && high % 2 == 1) {
            return (high - low) / 2 + 1;
        } else if (low % 2 == 0 && low % 2 == 0) {
            return (high - low) / 2;
        }
        
        return 0;
    }
}
