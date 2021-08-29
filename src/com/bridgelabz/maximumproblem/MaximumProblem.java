package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String args[]) {
	Float float1=30.98f, float2=88.86f, float3=-54f, max;
	max = float1;
	if(float2.compareTo(max) > 0)
		max=float2;
	if(float3.compareTo(max) > 0)
		max=float3;
	
	System.out.println("The max of \n"+float1+",\n "+float2+" &\n "+float3+" is: "+max);
}
}
