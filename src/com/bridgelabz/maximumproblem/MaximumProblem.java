package com.bridgelabz.maximumproblem;
public class MaximumProblem<E extends Comparable<E>>{
	E element1, element2, element3;
	public MaximumProblem(E element1, E element2, E element3) {
		this.element1 = element1;
		this.element2 = element2;
		this.element3 = element3;
	}
	public void findMax() {
		MaximumProblem.findMax(element1, element2, element3);
	}
	
	public static void main(String[] args) {
		
		Integer integer1=89, integer2=-33, integer3=-53;
		findMax(integer1,integer2,integer3);
		Float number1=10.9f, number2=-3.55f, number3=1.88f;
		findMax(number1,number2,number3);
		String string1="hello", string2="hello1", string3="hello2";
		findMax(string1,string2,string3);	
	}
public static <E extends Comparable<E>> void findMax(E element1, E element2, E element3) {
	E maximum = element1;
	
	if(element2.compareTo(maximum) > 0)
		maximum=element2;
	
	if(element3.compareTo(maximum) > 0)
		maximum=element3;
	System.out.println("The Maximum of "+element1+""+element2+""+element3+" is: "+maximum);
	
}
}
