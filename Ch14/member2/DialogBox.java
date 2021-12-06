package member2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*검색이 없는 주소 입력시 알림창*/
public class DialogBox extends JDialog implements ActionListener{
	JButton b1;
	ZipcodeFrame f;
	
	public DialogBox(ZipcodeFrame f, String title, String msg) {
		/*프레임 창의 x,y 좌표값을 알아야 중간에 알림창을 띄울수 있기 때문에 frame값을 넣음*/
		super(f, true);
		this.f =f;
		setTitle(title);
		add(new JLabel(msg, JLabel.CENTER));
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());//bold 레이아웃 = default(기본값)
		b1 = new JButton("확인");
		p.add(b1);
		b1.addActionListener(this);//이벤트 연결
		
		add(p, BorderLayout.SOUTH); // 남쪽에 띄우기
		setSize(250, 150);//알림창 크기
		
		setLocation(f.getX()+f.getWidth()/2-(this.getWidth()/2),
				f.getY()+f.getHeight()/2-(this.getHeight()/2));
		//ZipcodeFrame의 중간에 위치하기 위해 계산해야함 /알림창의 왼쪽 위 좌표값 = 중앙값 - 알림창의 가로 세로 각각 1/2  
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();/* 창이 사라짐 */
		
	}
}
