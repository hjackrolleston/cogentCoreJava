package com.cogent.employeemanagementsystem;

public class MainStringBuffer2 {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		
		StringBuffer buffer2=buffer;
		buffer2.delete(0, 5);
		//System.out.println(buffer);
		System.out.println(buffer.compareTo(buffer2));
		
		System.out.println(buffer);
	}

}
