package gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toobar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public Toobar() {
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
	}

}
