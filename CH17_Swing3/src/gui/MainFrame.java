package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title); //JFrame�� Ÿ��Ʋ�� �����ϵ���
	
		final MainPanel mainPanel = new MainPanel();
		//mainPanel.setBackground(Color.RED);
		setLayout(new BorderLayout()); //����������â�� ������Ʈ�� ���̱� ����
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER); //�߾� ��� �г��� ���̱�
		
		setSize(600, 400); //â ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� ������ ���α׷� ����			
		setVisible(true); //���̰� �ϱ�	
	}

}
