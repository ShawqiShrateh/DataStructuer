package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
       
    	System.out.println(sum(10));
    	System.out.println(sum(5 ,10));
    	//System.out.println(print(6));
    	
    	
    }
    public static int sum(int k) {
    	if(k>0) {
    		return k + sum(k-1);
    	}
    	return 0;
    }
    public static int sum(int start, int end) {
        if (end > start) {
          return end + sum(start, end - 1);
        } else {
          return end;
        }
      }
   /* public static int print(int m) {
    	if(m == 0) {
    		
    	}
    }*/
}
