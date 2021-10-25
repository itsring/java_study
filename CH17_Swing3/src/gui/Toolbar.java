package gui;

import java.awt.Color;
import java.awt.event.*;
//import java.awt.event.ActionListener;

//import javax.swing.JButton;
//import javax.swing.JToolBar;
import javax.swing.*;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(ColorChangeListener colorChanger) {
		JButton redButton = new JButton("red");
		JButton blueButton = new JButton("blue");

//		redButton.addActionListener(new RedButtonListener(mainPanel));
//		blueButton.addActionListener(new BlueButtonListener(mainPanel));
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.RED);//���콺 Ŭ���� ����
			}
		});
// blue �� ���ٽ� (ȭ�� �Լ� / ��ȸ�� �Լ�)
		blueButton.addActionListener((e)-> colorChanger.changeColor(Color.BLUE));
		add(redButton);
		add(blueButton);
	}
}
