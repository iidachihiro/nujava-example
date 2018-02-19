package jp.mzw.nujava.example;

public class ODLSample {
    public int sample1(int x) {
        x += 3;
        x *= 2;
        return x;
    }
    
    public boolean sample2(int x, boolean y) {
        if (x > 0 || (x < -2) && y) return true;
        return false;
    }
}
