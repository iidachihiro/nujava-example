package jp.mzw.nujava.example;

public class ShiftOperatorSample {
    public int sample1(int a) {
        return a >>> 1;
    }
    
    public byte sample2(byte a) {
        return (byte) (a << 1);
    }
}
