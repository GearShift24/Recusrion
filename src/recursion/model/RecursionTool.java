package recursion.model;

public class RecursionTool 
{			
	public double calculateFacLoop()
	{
		
	}
	
	public int calculateFibLoop()
	{
		int a = 0;
		int b = 1;
		
		
		
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