package jp.mzw.nujava.example;

public class SDLSample {
    
    public void sample() {
        int a, b;
        a = 1;
        b = 2;
    }
    
    public void sampleIfFor(int a, int b, int c) {
        int t = 0;
        if (a == 0) {
            b = 3;
        }
        for (int i = 0; i < 5; i++) {
            t += b + c;
        }
    }
    
    public void sampleWhile(int a, int b, int c) {
        int t = 0;
        while (a < 5) {
            t += b + c;
            a++;
        }
    }
    
    
}
