package com.java.palindrome.code;

import java.util.stream.IntStream;

public class Palindrome_Stream {
	public boolean isPalindromeUsingIntStream(String text) {
	    String temp  = text.replaceAll("\\s+", "").toLowerCase();
	    return IntStream.range(0, temp.length() / 2)
	      .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	}
	public static void main(String[] args) {		
	Palindrome_Stream p=new Palindrome_Stream();
	System.out.println(p.isPalindromeUsingIntStream("jaj"));
	
	}
	}


