package com.cg.t1.ui;

public class ArithOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      if(args.length != 2) {
    	  System.out.println("Provide 2 integers");
    	  System.exit(0);
      }
      int firstNumber = Integer.parseInt(args[0]);
      int secondNumber =Integer.parseInt(args[1]);
      int result;
      result = firstNumber - secondNumber;
      System.out.println(result);
	}

}
