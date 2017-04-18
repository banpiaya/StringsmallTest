package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringDemoTest {

	private  StringDemo str ;
	@Before
	public void setUp() throws Exception {
		str = new StringDemo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringDemo() {
		assertEquals("字符串全是大写",str.smallString("ABCDEF"),"abcdef");
	}

	@Test
	public void testSmallString() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
	}

	@Test
	public void testObject() {
		assertEquals("含有小写的字符串",str.smallString("aBc"),"abc");
	}

	@Test
	public void testGetClass() {
		assertEquals("含有数字的字符串",str.smallString("A1C"),"a1c");
	}

	@Test
	public void testHashCode() {
		assertEquals("全是数字的字符串",str.smallString("123"),"123");
	}

	@Test
	public void testEquals() {
		assertEquals("含有特殊字符的处理",str.smallString("，ABCDEF"),"，abcdef");
	}

	@Test
	public void testClone() {
		assertEquals("异常处理",str.smallString(""),"error");
	}

	@Test
	public void testToString() {
		assertEquals("全是特殊符号",str.smallString("/。，、]"),"/。，、]");
	}

	@Test
	public void testNotify() {
		assertEquals("含有空格",str.smallString("AB C"),"ab c");
	}

	@Test
	public void testNotifyAll() {
		assertEquals("含有空格",str.smallString("AB C"),"ab c");
	}



}
