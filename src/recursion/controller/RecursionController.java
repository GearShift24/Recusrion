package recursion.controller;

import recursion.view.*;


public class RecursionController 
{
	private RecursionFrame recursionFrame;
	
	public RecursionController()
	{
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
}
