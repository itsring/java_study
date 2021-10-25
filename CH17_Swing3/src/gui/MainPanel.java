package gui;

import java.awt.Color;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ColorChangeListener{
	private static final long serialVersionUID = 1L;
	
	public MainPanel() {
		setBackground(Color.darkGray);
	}

	@Override
	public void changeColor(Color color) {
		setBackground(color);//배경색 바꾸는 추상 메소드 
				
	}
}
