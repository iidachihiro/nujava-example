package jp.mzw.nujava.example;

public class ArrayExample {
    
    private int[] array;
    
    public ArrayExample() {
        array = new int[5];
        array[0] = 3;
        array[1] = 4;
        array[2] = 1;
        array[3] = 4;
        array[4] = 2;
    }
    
    public int getElement(int i) {
        return this.array[i];
    }
    
    public int getLength() {
        return this.array.length;
    }
    
    public int getFirstIndex(int elm) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elm) {
                return i;
            }
        }
        return array.length;
    }
    
    public void incrementAllElements() {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
    
    public void decrementAllElements() {
        for (int i = 0; i < array.length; i++) {
            array[i]--;
        }
    }
}
