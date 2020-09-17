package May.BitManipulation;

public class Hamming_Distance {
   public int hammingDistance(int x, int y) {
       int xor = x ^ y;
       int hamming = 0;
       while (xor != 0) {
           if ((xor & 1) == 1) {
               hamming++;
           }
           xor = xor >> 1;
       }
       return hamming;
   } 
}