package com.cg.t1.ui;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = Integer.parseInt(args[0]);
       int temp = num, rem=0,sum=0;
       while(temp > 0) {
    	  rem = temp % 10;
    	  sum = sum + (rem*rem*rem);
    	  temp = temp / 10;
       }
       if(sum == num)
    	   System.out.println("Number is Armstrong");
       else
    	   System.out.println("Number is not Armstrong");
	}

}
