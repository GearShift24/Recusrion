package recursion.controller;

import javax.swing.JOptionPane;

import recursion.view.*;
import recursion.model.*;
import recursion.model.Timer;

public class RecursionController 
{
	private RecursionFrame recursionFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	public RecursionController()
	{
		this.mathTool = new RecursionTool();
		this.mathTimer = new Timer();
		recursionFrame = new RecursionFrame(this);
		getBaseFrame();
	}
	
	public void start()
	{
		
	}
	
	private RecursionFrame getBaseFrame()
	{
		return recursionFrame;
	}
	
	
	public String transferFactorial(String value)
	{
		String factorialResponse = "the factorial of " + value + " is ";
		mathTimer.startTimer();
		
		if(isValid(value))
		{
			factorialResponse += mathTool.calculateFactorial(Double.parseDouble(value));
		}
		
		mathTimer.stopTimer();
		factorialResponse += "\n " + mathTimer.toString();
		mathTimer.resetTimer();
		
		
		
		//
		mathTimer.startTimer();
		if(isValid(value))
		{
		factorialResponse += mathTool.calculateFacLoop(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		factorialResponse += "the amount of time it took for loop was: " + mathTimer.toString();
		
		//
		return factorialResponse;
	}
	
	
	public String transferFibonacci(String value)
	{
		String fibonacciResponse = "The Fibonacci sequence at " + value + " is: \n";
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(value))
		{
			fibonacciResponse += mathTool.calculateFibonacci(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		fibonacciResponse += "\n" + mathTimer.toString();
		//
		//
		//
		mathTimer.startTimer();
		if(isValid(value))
		{
			fibonacciResponse += mathTool.calculateFibLoop(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		fibonacciResponse += "the amount of time it took for loop was: " + mathTimer.toString();
		//
		///
		return fibonacciResponse;
		
		
		return fibonacciResponse;
	}
	
	
	
	
	private boolean isValid(String current)
	{
		try 
		{
			double test = Double.parseDouble(current);
			if (test >= 0)
			{
			return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(recursionFrame,  "type a valid int weeb");
			return false;
		}
	}

}
	
	
	
	
