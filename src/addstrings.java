import static org.junit.Assert.*;

import org.junit.Test;

public class addstrings {

	@Test
	public void test() {
		add1 jUnit=new add1();
		String result=jUnit.addString("as", "we");
		assertEquals("aswe",result);
	}

}
