package game.objects;

public enum GameObject {

	가위, 바위, 보;
	
	private int[][] comparison = {
					//    가위(0)  바위(1)   보(2)
		/* 가위(0) */		{  0,   -1,    1 },
		/* 바위(1) */		{  1,    0,   -1 },
		/* 보 (2)*/		{ -1,    1,    0 }
	};
	
	public int compare(GameObject ob) {
		return comparison[this.ordinal()][ob.ordinal()];
	}	//가위 = 0, 바위 = 1, 보 = 2 / enum에서는 ordinal로 알수 있음
	
}
