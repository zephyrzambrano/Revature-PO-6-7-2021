import java.util.ArrayList;
import java.util.List;

public class SplittingUpNumbers {

	public static void main(String[] args) {
		
		System.out.println(numSplit(39)); // numSplit(39) ➞ [30, 9]
		System.out.println(numSplit(-434)); // numSplit(-434) ➞ [-400, -30, -4]
		System.out.println(numSplit(100)); // numSplit(100) ➞ [100, 0, 0]
		System.out.println(numSplit(121317)); // numSplit(121317) ➞ [100000, 20000, 1000, 300, 10, 7]
		
	}
	
	public static List<Integer> numSplit(int inputNum) {
		
		List<Integer> numList = new ArrayList<Integer>();
		
		StringBuilder sb = new StringBuilder(Integer.toString(inputNum));
		
		boolean negative = false;
		
		if (sb.charAt(0) == '-') {
			negative = true;
			sb.deleteCharAt(0);
		}
		
		for (int i = sb.length(); i > 0; i = i - 1) {
			
			StringBuilder splitNum = new StringBuilder();
			splitNum.append(sb.charAt(0));
			
			for (int j = 1; j < i; j = j + 1) {
				splitNum.append("0");
			}
			
			int num = Integer.parseInt(splitNum.toString());
			if (negative) num = num * -1;
			
			numList.add(num);
			
			sb.deleteCharAt(0);
		}
		
		return numList;
		
	}

}
