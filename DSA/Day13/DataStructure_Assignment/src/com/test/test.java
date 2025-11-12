package com.test;

	public class test {
	   
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	  
	    public static int reverseNumber(int num) {
	        int rev = 0;
	        while (num != 0) {
	            rev = rev * 10 + num % 10;
	            num /= 10;
	        }
	        return rev;
	    }

	    public static void main(String[] args) {
	        int[] original = {2, 3, 4, 5, 6, 7, 11, 13, 17};
	        int[] copy = new int[original.length];

	        for (int i = 0; i < original.length; i++) {
	            if (isPrime(original[i]) && original[i] < 5) {
	                copy[i] = reverseNumber(original[i]);
	            } else {
	                copy[i] = original[i];
	            }
	        }

 	        for (int value : copy) {
	            System.out.print(value + " ");
	        }
	    }
	}


