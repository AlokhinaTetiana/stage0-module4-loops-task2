package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i=2;
        while (i<=printToInclusive){
            int j=2;
            int res=0;
            while(j<i){
                if(i%j==0) {res++;}
                j++;
            }
            if(res==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
