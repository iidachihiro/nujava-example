package jp.mzw.nujava.example;

public class CDLSample {
    public String sample1(int a, int b, int c) {
        if (b*b<4*a*c) {
            return null;
        } else if (b*b==4*a*c) {
            double x1 = -b/(2*a);
            return "x = "+x1;
        } else {
            double x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            double x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
            return "x = "+x1+", "+x2;
        }
    }
}
