package recursion.view;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import recursion.controller.*;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibButton;
	private JButton factButton;
	private JTextField recursionField;
	private JTextArea recursionArea;
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		recursionField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.SOUTH, recursionField, -120, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, recursionField, -61, SpringLayout.EAST, this);
		recursionArea = new JTextArea(5,25);
		baseLayout.putConstraint(SpringLayout.NORTH, recursionArea, 18, SpringLayout.SOUTH, recursionField);
		
		fibButton = new JButton("fib");
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 0, SpringLayout.WEST, recursionField);
		factButton = new JButton("fact");
		baseLayout.putConstraint(SpringLayout.EAST, recursionArea, 0, SpringLayout.EAST, factButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, factButton, -28, SpringLayout.NORTH, recursionField);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, 0, SpringLayout.EAST, recursionField);
		
		setupPanel();
		setupLayout();
		setupListener();
		
	}
	
	private void setupPanel()
	{
		setLayout(baseLayout);
		setBackground(Color.blue);
		add(fibButton);
		add(factButton);
		add(recursionField);
		add(recursionArea);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListener()
	{
		
	}
}
