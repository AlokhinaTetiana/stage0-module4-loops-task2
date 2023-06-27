package school.mjc.stage0.loops.task2;

import static java.lang.Math.abs;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i=0;
        if(multiplyByAndToInclusive!=0){
            while (i<=abs(multiplyByAndToInclusive)){
                System.out.println(multiplyByAndToInclusive*i);
                i++;
            }}
    }
}
