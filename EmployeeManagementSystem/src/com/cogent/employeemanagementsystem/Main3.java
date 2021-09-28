package com.cogent.employeemanagementsystem;

public class Main3 {

	public static void main(String[] args) {
		String s = "Cogent University";
		
		System.out.println("abi".compareTo("aDI"));
		System.out.println("abi".codePointAt(0));
		System.out.println("ABI".codePointAt(0));
		System.out.println("a".compareTo("a"));
		System.out.println("b".compareTo("D"));
		
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		
		System.out.println(s==new String/*.equals*/("Cogent University"));
		
		// Even if you us "==", s and "Cogent University" are pointing
		// to same reference in the spool, so it'll return true. That
		// was not what I expected at all!
		
		// If you put "==new String(content)", it'll return false, b/c
		// spool reference is not literally equal to String object reference.
		
		//String result=s.substring(7);
		//substring(int) uses single int input as starting index,
		//then goes all the way to end.
		//substring(int,int) is not inclusive to end-index.
		//System.out.println(result);
	}

}
