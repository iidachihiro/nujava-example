package jp.mzw.nujava.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SDLSample {
    
    public int sampleIf(int a) {
        if (a > 0) return a;
        return 0;
    }
    
    public int sampleIfElse(int a) {
        if (a > 0) return a;
        else if (a < 0) return -a;
        else return 0;
    }
    
    public void sampleFor(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello");
        }
    }
    
    public void sampleWHile(int a) {
        while (a < 10) {
            System.out.println("Hello");
            a++;
        }
    }
    
    public void sampleSwitch(int a) {
        int t = 0;
        switch(a) {
        case 0:
            t = a;
            break;
        case 1:
            t = a * a;
        default:
            break;
        }
    }
    
    public void sampleTry(File file) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
