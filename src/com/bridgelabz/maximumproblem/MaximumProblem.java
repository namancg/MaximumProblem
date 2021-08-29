package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String args[]) {
	String string1="hello", string2="hello1", string3="hello2", max;
	max = string1;
	if(string2.compareTo(max) > 0)
		max=string2;
	if(string3.compareTo(max) > 0)
		max=string3;
	
	System.out.println("The max of \n"+string1+",\n "+string2+" &\n "+string3+" is: "+max);
}
}
