package jp.mzw.nujava.example;

public class AssignmentOperatorSample {
    public int sample1(int a) {
        a += 1;
        a *= 2;
        a -= 3;
        a /= 4;
        a %= 5;
        return a;
    }
    
    public int sample2(int a) {
        a &= 1;
        a |= 2;
        a ^= 3;
        return a;
    }
    
    public int sample3(int a) {
        a <<= 1;
        a >>= 2;
        a >>>= 3;
        return a;
    }
}
