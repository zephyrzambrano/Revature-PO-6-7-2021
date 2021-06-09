import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class SplittingUpNumbersTest {
	
	static List<Integer> list1;
	static List<Integer> list2;
	static List<Integer> list3;
	static List<Integer> list4;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		list1 = new ArrayList<>(List.of(30, 9));
		list2 = new ArrayList<>(List.of(-400, -30, -4));
		list3 = new ArrayList<>(List.of(100, 0, 0));
		list4 = new ArrayList<>(List.of(100000, 20000, 1000, 300, 10, 7));
	}
	
	@Test
	public void numSplitTest1() {
		assertEquals(SplittingUpNumbers.numSplit(39), list1);
	}
	
	@Test
	public void numSplitTest2() {
		assertEquals(SplittingUpNumbers.numSplit(-434), list2);
	}
	
	@Test
	public void numSplitTest3() {
		assertEquals(SplittingUpNumbers.numSplit(100), list3);
	}
	
	@Test
	public void numSplitTest4() {
		assertEquals(SplittingUpNumbers.numSplit(121317), list4);
	}
}
