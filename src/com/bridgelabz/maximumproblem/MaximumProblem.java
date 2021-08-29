package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String args[]) {
	Integer integer1=30, integer2=88, integer3=-54, max=0;
	max = integer1;
	if(integer2.compareTo(max) > 0)
		max=integer2;
	if(integer3.compareTo(max) > 0)
		max=integer3;
	
	System.out.println("The max of "+integer1+", "+integer2+" & "+integer3+" is: "+max);
}
}
