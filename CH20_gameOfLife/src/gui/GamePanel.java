package gui;

import javax.swing.*;

import model.World;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final static int CELLSIZE = 100;// 격자의 크기 설정
	private final static Color backgroundColor = Color.BLACK; // 배경색 검은색
	private final static Color gridColor = Color.GRAY;// 격자선 색

	private int topBottomMargin;// 위 아래 마진
	private int leftRightMargin;// 양 옆 마진
	private World world;

	public GamePanel() {
//		setBackground(Color.BLUE);//게임 패널 생성시 배경색 파랑
		// 게임 패널을 생성시에 이벤트중(마우스 이벤트 추가)
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getY()<topBottomMargin || e.getX()<leftRightMargin) {
					return; //벗어난 값이기 때문에 그냥 리턴
				}
				
				int row = (e.getY()-topBottomMargin)/CELLSIZE;
				int col = (e.getX()-leftRightMargin)/CELLSIZE;
				if(row >=world.getRows()||col >= world.getColumns()) {
					return; // 벗어난 값이기 때문에 그냥 리턴
				}
//				System.out.println(row + "," + col); // 확인용
				boolean status = world.getCell(row, col);//현재 값 
				world.setCell(row, col, !status);//현재값 반전
				repaint(); // 새로고침(게임패널을 새로시작)
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		// 이 메소드는 자동으로 시작및 수정시 자신의 모습을 그린다.
		Graphics2D g2 = (Graphics2D) g; // 2D 그래픽을 사용하기 위해

		int width = getWidth(); // 가로
		int height = getHeight(); // 세로

//		System.out.println(width);
//		System.out.println(height);
		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((width % CELLSIZE) + CELLSIZE) / 2;

		int rows = (height - 2 * topBottomMargin) / CELLSIZE;
		int cols = (width - 2 * leftRightMargin) / CELLSIZE;
		if (world == null) { // 아직 world가 생성이 안됬으면
			world = new World(rows, cols);
		}
//		world.setCell(0, 0, true);// 그리드 2중배열에 좌표(줄,열) 값을 true로 셋(set) 함 / 테스트용
//		world.setCell(2, 2, true);
//		world.setCell(4, 1, true);

		g2.setColor(backgroundColor);// 색 설정
		g2.fillRect(0, 0, width, height);// 사각형의 좌표평면에 색을 칠함
//		fillCell(g2, 0, 0, true);
		drawGrid(g2, width, height);
		for (int col = 0; col < cols; col++) {
			for (int row = 0; row < rows; row++) {
				boolean status = world.getCell(row, col);
				fillCell(g2, row, col, status);

			}
//			fillCell(g2, 2, 2, true);
//			fillCell(g2, 1, 4, true);
		}
	}

	private void fillCell(Graphics2D g2, int row, int col, boolean status) {
		// 하각형에 색을 넣는 메소드 (그래픽, 가로, 세로, 상태(true : 녹색 / false : 배경색))
		Color color = status ? Color.GREEN : backgroundColor;
		g2.setColor(color);

		int x = leftRightMargin + (col * CELLSIZE);
		int y = topBottomMargin + (row * CELLSIZE);
		// x,y 좌표 가로 세로 길이 입력해서 사각형에 색을 칠한다.
		g2.fillRect(x + 1, y + 1, CELLSIZE - 2, CELLSIZE - 2);

	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		// 격자 줄을 긋는 메소드
		g2.setColor(gridColor);// 검정색 설정

		for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			// 줄을 긋는 메소드(x1,yt1)(x2,y2)
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		for (int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE) {
			// 줄을 긋는 메소드(x1,yt1)(x2,y2)
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}

	}

}
