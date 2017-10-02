import static org.junit.Assert.*;

import org.junit.Test;
public class testnum {

	@Test
	public void test() {
		add1 jUnit=new add1();
		int result=jUnit.addNumbers(100,12);
		assertEquals(112,result);
	}

}
