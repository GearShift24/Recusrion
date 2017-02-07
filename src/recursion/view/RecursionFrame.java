package recursion.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import recursion.controller.RecursionController;

public class RecursionFrame extends JFrame
{

	private RecursionController baseController;
	private RecursionPanel appPanel;
	
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new RecursionPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("bruh");
		this.setSize(new Dimension(450,450));
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
