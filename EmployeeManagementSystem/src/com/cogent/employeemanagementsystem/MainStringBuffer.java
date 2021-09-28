package com.cogent.employeemanagementsystem;

public class MainStringBuffer {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer();
		
		
		System.out.println(buffer.capacity());
		buffer.append("abhinandan");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		buffer.append("advik");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		
		buffer.append(" ");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		
		buffer.append("a");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		// default cap of 16
		
		// Buffer cap is self-growable

	}

}
