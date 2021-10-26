package gui;

import javax.swing.JFrame;
import java.awt.*;
public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private GamePanel gamePanel = new GamePanel();
	public MainFrame() {
		super("Game Of Life");//타이틀
		
		setLayout(new BorderLayout());//레이아웃 구역설정
		add(gamePanel, BorderLayout.CENTER);
		
		setSize(1000, 800);//창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫을때 프로그램 종료			
		setVisible(true);	//보이게 하기
	}
}
