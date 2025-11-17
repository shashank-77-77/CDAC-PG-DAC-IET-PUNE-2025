package com.dao.arrays;
import java.util.*;

import com.beans.arrays.NumberBean;
    public NumberDAO() {


	
    public int[] sumOfDigits(NumberBean b){
        int[] a = b.getArr();
        int[] out = new int[a.length];
        for(int i=0;i<a.length;i++){
            int x = Math.abs(a[i]);
            int s = 0;
            while(x>0){ s += x%10; x/=10; }
            out[i] = s;
        }
        return out;
    }
}