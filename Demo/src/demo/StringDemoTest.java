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
		assertEquals("�ַ���ȫ�Ǵ�д",str.smallString("ABCDEF"),"abcdef");
	}

	@Test
	public void testSmallString() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
	}

	@Test
	public void testObject() {
		assertEquals("����Сд���ַ���",str.smallString("aBc"),"abc");
	}

	@Test
	public void testGetClass() {
		assertEquals("�������ֵ��ַ���",str.smallString("A1C"),"a1c");
	}

	@Test
	public void testHashCode() {
		assertEquals("ȫ�����ֵ��ַ���",str.smallString("123"),"123");
	}

	@Test
	public void testEquals() {
		assertEquals("���������ַ��Ĵ���",str.smallString("��ABCDEF"),"��abcdef");
	}

	@Test
	public void testClone() {
		assertEquals("�쳣����",str.smallString(""),"error");
	}

	@Test
	public void testToString() {
		assertEquals("ȫ���������",str.smallString("/������]"),"/������]");
	}

	@Test
	public void testNotify() {
		assertEquals("���пո�",str.smallString("AB C"),"ab c");
	}

	@Test
	public void testNotifyAll() {
		assertEquals("���пո�",str.smallString("AB C"),"ab c");
	}



}
