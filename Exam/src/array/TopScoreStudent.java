package array;



public class TopScoreStudent {

	public static void main(String[] args) {
		String[] names = {"Elena","Suzie","John","Emily","Neda","Kate","Alex"
				,"Daniel","Hamilton"};
		int[] scores = {65,74,23,75,68,96,88,98,54};
		int i =topIndex(scores);
		System.out.printf("1등 : %s(%d점)\n",names[i],scores[i]);
	}

	private static int topIndex(int[] arr) {
		int maxAt =0;
		for(int i=0; i<arr.length; i++) {
			
			// 초기값 : arr[1]가 arr[0] 크면 i가 maxAt이 됨 74>65 니깐 maxAt =1
			// arr[2]가 arr[1]보다 크면 maxAt =2 그렇지 않으면 maxAt =1 그대로
			// 23>74 = false => maxAt =1
			// 이런식으로 maxAt 값을 구해서 리턴
			maxAt = arr[i] > arr[maxAt] ? i: maxAt;
		}
		return maxAt;
	}

}
