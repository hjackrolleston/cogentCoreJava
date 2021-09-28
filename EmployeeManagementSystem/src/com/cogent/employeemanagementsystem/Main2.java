package com.cogent.employeemanagementsystem;

public class Main2 {
	public static void main(String[] args) {
		
		// ip : 192.168.1.1
		String ip="192.168.1.1";
		// class C-range address (there are five ranges)
		
		// Are we going to split this address on the
		// basis of '.' characters?
		// Should be 0 to 255; otherwise, substring not valid
		
		String[] ipAddress=ip.split("\\.");
		//"." does not work because regexes interpret "."
		//as wildcards
		for (String string : ipAddress) {
			int a= Integer.parseInt(string);
			if(a>=0&&a<=255) {}
			else {System.exit(0);}
			//Yes, a blank return can be used to terminate an operation.
		}
		try {
			int classCell=Integer.parseInt(ipAddress[0]);
			if (classCell>0&&classCell<=126) {System.out.println("A-class address.");}
			else if (classCell>126&&classCell<=191) {System.out.println("B-class address.");}
			else if (classCell>191&&classCell<=223) {System.out.println("C-class address.");}
			else if (classCell>223&&classCell<=239) {System.out.println("D-class address.");}
			else if (classCell>239&&classCell<=255) {System.out.println("E-class address.");}
		} catch (NumberFormatException e) {e.printStackTrace();}
		//    \\. will be resolved to \.
		// \. is an escape sequence
		
		
		/*String s="Abhinandan";String s2="Cogent";
		String s3=new String("Cogent University"); */
		// CN ref = RT allocation
		
		//String s4="Abhinandan";String s5="Cogent";
		
		// System.out.println(s4.concat(" " +s5));
		// concat only returns an external reference of an
		// operation on the string(/s), does not change
		// any string content itself; the only solution we
		// can trust, because string objs are immutable:
		//System.out.println(s4);
		
		//What're some methods of String that return strings?
		// toUpperCase(),toLowerCase(),valueOf(),replace()
	}
}
