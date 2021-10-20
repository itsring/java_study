package gui;

import java.awt.event.*;
//import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.*;
class RedButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Red button clicked!");
	}
	
}

class BlueButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Blue button clicked!");
		
	}
	
}

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar() {
		JButton redButton = new JButton("red");
		JButton blueButton = new JButton("blue");
		
		redButton.addActionListener(new RedButtonListener());
		blueButton.addActionListener(new BlueButtonListener());
		
		add(redButton);
		add(blueButton);
	}

}
