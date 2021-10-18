package method;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * ½Å»ç¿ÁÀÇ ¿¤·¹º£ÀÌÅÍ´Â ÀúÃş°ú °íÃşÀ¸·Î ³ª´µ¾î ¿îÇàµÈ´Ù.
		 * ÀúÃşÀº 1~10Ãş, °íÃşÀº 11~20ÃşÀ» ¿îÇàÇÑ´Ù.
		 * ¹æ¹® Ãş¼ö¸¦ ÀÔ·Â¹Ş¾Æ Å¸¾ßÇÒ ¿¤¸®º£ÀÌÅÍ¸¦ ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå guide()¸¦ ¿Ï¼ºÇÏ¿©,
		 * Ãâ·Â ¿¹¿Í °°Àº °á°ú¸¦ ¾òÀ¸½Ã¿À
		 * 
		 *  Ãâ·Â ¿¹
		 *  13Ãş -> ¼ÒÃş ¿¤·¹º£ÀÌÅÍ
		 *  7Ãş -> ÀúÃş ¿¤·¹º£ÀÌÅÍ
		 *  10Ãş -> ÀúÃş ¿¤·¹º£ÀÌÅÍ
		 */ 
		int a =13;
		int b = 7;
		int c=10;
		System.out.printf("%dÃş -> %s ¿¤·¹º£ÀÌÅÍ \n", a, name(a));
		System.out.printf("%dÃş -> %s ¿¤·¹º£ÀÌÅÍ \n", b, name(b));
		System.out.printf("%dÃş -> %s ¿¤·¹º£ÀÌÅÍ \n", c, name(c));
	}
	public static String name(int stare) {
		if(stare >=11) {
			return "°íÃş";
		}else {
			return "ÀúÃş";
		}
	}
}
