package gui;

import java.awt.Color;
import java.awt.event.*;
//import java.awt.event.ActionListener;

//import javax.swing.JButton;
//import javax.swing.JToolBar;
import javax.swing.*;

class ColorButtonListener implements ActionListener {
	private MainPanel mainPanel;
	private Color color;

	public ColorButtonListener(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(color);
//		System.out.println(color+" button clicked!");
	}

}
// 하나로 합침 

//class RedButtonListener implements ActionListener {	
//	private MainPanel mainPanel;
//
//	public RedButtonListener(MainPanel mainPanel) {
//		this.mainPanel = mainPanel;
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		mainPanel.setBackground(Color.RED);
//		System.out.println("Red button clicked!");
//
//	}
//
//}
//
//class BlueButtonListener implements ActionListener {
//	private MainPanel mainPanel;
//
//	public BlueButtonListener(MainPanel mainPanel) {
//		this.mainPanel = mainPanel;
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		mainPanel.setBackground(Color.BLUE);
//		System.out.println("Blue button clicked!");
//
//	}
//}
// red, blue 각각

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {
		JButton redButton = new JButton("red");
		JButton blueButton = new JButton("blue");

//		redButton.addActionListener(new RedButtonListener(mainPanel));
//		blueButton.addActionListener(new BlueButtonListener(mainPanel));
		redButton.addActionListener(new ColorButtonListener(mainPanel,Color.RED));
		blueButton.addActionListener(new ColorButtonListener(mainPanel,Color.BLUE));

		add(redButton);
		add(blueButton);
	}
}
