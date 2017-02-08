package recursion.model;

import java.util.*;

public class RecursionTool 
{			
	public int calculateFacLoop(int factorial)
	{
		  int input = 7;
	        factorial = 1;
	        while (input > 0)
	        {
	          factorial = factorial * input;
	          input--;
	        }
	          return factorial;
	}
	
	public int calculateFibLoop(int temp)
	{
		int num = 0;
		int num2 = 1;
		temp = 0;
		int loop;
		int fibonacci;
		for (loop = 1; loop <= 10; loop ++)
		{
		    fibonacci = num + num2;
		    num = num2;
		    num2 = fibonacci;
		    temp = fibonacci;
		}
		    
	
		    return temp;
		    
	}
	//
	
	
	
	
	
	
	
	
	
	
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber -1) * currentNumber;
		}
	}
	
	
	
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}
}