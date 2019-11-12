package com.virtusa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberToWordConverter {
	
	
	public static void main(String args[]) {
	  
	  NumberToWordConverter.method1(24);
	}
	
    public static void method1(int n) {
    	Map<Integer,String> map = new HashMap<Integer,String>();
    	String[] singleDigit = {"one","two","three","four","five","six","seven","eight","nine"};
    	String[] twoDigit = {"ten","twenty","thirty","fourty","fifty","sixtey","seventy"};
    	String[] threeDigit = {"one hundered","two hundered","three hundered"};
    	String str = String.valueOf(n);
    	if(str.length() == 0) {
    		System.out.println("empty characters");
    		
    	}
    	if(str.length() == 1) {
    		System.out.println("Single Digit word : "+singleDigit[n-1]);
    	}
    	if(str.length() == 2) {
    		char ch[] = str.toCharArray();
    		String word = twoDigit[ch[0]-1]+ "and" +singleDigit[ch[1]-1];
    		System.out.println(word);
    		
    	}
    		
    }
}
