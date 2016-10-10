package fr.boivina.euler;

public class Problem2 {

    public static long fibo(long limit) {
        long a = 1,b = 0, sum = 0;
        while(a < limit) {
            long res = a + b;
            b = a;
            a = res;
            if(a % 2 == 0) {
                sum += a;
            }
        }
        return sum;
    }
}
