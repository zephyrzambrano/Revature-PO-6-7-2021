import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BackspaceAttackTest {

	@Test
	public void eraseTest1() {
		assertEquals(BackspaceAttack.erase("he##l#hel#llo"), "hello");
	}
	
	@Test
	public void eraseTest2() {
		assertEquals(BackspaceAttack.erase("major# spar##ks"), "majo spks");
	}
	
	@Test
	public void eraseTest3() {
		assertEquals(BackspaceAttack.erase("si###t boy"), "t boy");
	}
	
	@Test
	public void eraseTest4() {
		assertEquals(BackspaceAttack.erase("####"), "");
	}

}
