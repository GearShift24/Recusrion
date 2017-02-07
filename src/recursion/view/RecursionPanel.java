package recursion.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import recursion.controller.*;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibButton;
	private JButton factButton;
	private JTextField inputField;
	private JTextArea displayArea;
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		inputField = new JTextField(25);
		displayArea = new JTextArea(5,25);
		

		
		fibButton = new JButton("Calc fibonacci");

		factButton = new JButton("Calc Fac");

		
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
		add(inputField);
		add(displayArea);
		
		
	}
	
	private void setupLayout()
	{	
		
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -120, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -61, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 18, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 0, SpringLayout.WEST, inputField);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, 0, SpringLayout.EAST, factButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, factButton, -28, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, 0, SpringLayout.EAST, inputField);
	}
	
	private void setupListener()
	{
		factButton.addActionListener(new ActionListener()
				{
		public void actionPerformed(ActionEvent click)
		{
			
			displayArea.setText(baseController.transferFactorial(inputField.getText()));
		}
			});
		
		
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
	
				displayArea.setText(baseController.transferFibonacci(inputField.getText()));
			}
	});
		
		
		
		
	}
}
