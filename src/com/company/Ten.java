package com.company;
import java.util.*;
public class Ten{
    static ArrayList<Integer> primes = new ArrayList<Integer>();
    static void SieveofEratosthenes(int n)
    {
        boolean[] visited=new boolean[n*n+2];
        for (int i = 2; i <= n + 1; i++)
            if (!visited[i]) {
                for (int j = i * i; j <= n + 1; j += i)
                    visited[j] = true;
                primes.add(i);
            }
    }
    static boolean specialPrimeNumbers(int n, int k)
    {
        SieveofEratosthenes(n);
        int count = 0;
        for (int i = 0; i < primes.size(); i++) {
            for (int j = 0; j < i - 1; j++) {
                if (primes.get(j) + primes.get(j + 1) + 1
                        == primes.get(i)) {
                    count++;
                    break;
                }
            }
            if (count == k)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int n = 27, k = 2;
        if (specialPrimeNumbers(n, k))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
