package com.test.arrays;
import java.util.*;

import com.dao.arrays.NumberDAO;
public class TestNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for array: "); int n = sc.nextInt();
        int[] a = new int[n]; System.out.println("Enter numbers:");
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        NumberDAO bean = new NumberDAO();
        NumberDAO dao = new NumberDAO();

        System.out.println("Sum of digits for each: " + Arrays.toString(dao.sumOfDigits(bean)));
        System.out.println("Factorial of primes: " + dao.factorialOfPrimes(bean));
        System.out.println("Maximum prime: " + dao.maxPrime(bean));
        System.out.println("Copy with rule: " + Arrays.toString(dao.copyWithRule(bean)));

        // string bucketing demo
        sc.nextLine();
        System.out.println("Enter strings (enter -1 to stop). Max 20 will be stored.");
        List<String> inputs = new ArrayList<>();
        while(true){ String s = sc.nextLine(); if(s.equals("-1")) break; inputs.add(s); }
        String[] bucketed = dao.bucketBySecondChar(inputs);
        System.out.println("Bucketed array:");
        for(int i=0;i<bucketed.length;i++) System.out.println(i+": "+bucketed[i]);
    }
}