package model;

public class World {
	private int rows;	//줄
	private int columns;	//열
	
	private boolean[][] grid;	//불린 이중 배열
	
	public World(int rows, int columns) {	 //월드 생성자(가로,세로)
		this.rows = rows;
		this.columns = columns;
		
		grid = new boolean[rows][columns];	//다중배열 객체 만들기(크기설정)
		
	}
	public  boolean getCell(int row, int col) {
		return grid[row][col];//월드의 grid에서 현재 셀(사각형)의 상태
	}
	public void setCell(int row, int col, boolean status) {
		grid[row][col]=status;	//셀의 상태를 설정 (셋)	
	}
	public int getRows() {
		//만들어진 배열의 줄수를 리턴
		return rows;
	}
	public int getColumns() {
		// 만들어진 배열의 열수를 리턴
		return columns;	
	}
}
