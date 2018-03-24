package be.tiemenvermote.projecteuler003;

//This program finds the largest prime factor of 600851475143, measures the time taken and prints both out on the console as per Project Euler 003

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(largestPrimeFactor(600851475143L));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }

    private static long largestPrimeFactor(long number) {
        long i;
        long copyOfInput = number;

        for (i=2;i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput/=i;
                i--;
            }
        }
        return i;
    }
}
