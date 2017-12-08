package com.string.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;

import org.junit.Test;


public class StringTest {

	@Test
	public void testCharAt_GetVal() throws UnsupportedEncodingException {
		String abc = new String("abcdefghi");
		char ch = abc.charAt(abc.length()-1);
		assertEquals(ch, 'i');
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testCharAt_StringIndexOutOfBoundsException() throws UnsupportedEncodingException {
		String abc = new String("abcdefghi");
		char ch = abc.charAt(abc.length());
		fail();

	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testPointAt_GetVal() {
		String abc = new String("abcdefghi");
		int i = abc.codePointAt(abc.length());
		fail();
	}

	@Test
	public void testStringConructorWithBytes() {
		String abc = new String("abc");
		byte[] byteAbc = abc.getBytes();
		String string = new String(byteAbc);
		assertEquals(string, "abc");
	}

	@Test
	public void testStringConructorWithCharPositios() {
		String abc = new String("abcdefgh");
		byte[] byteAbc = abc.getBytes();
		String string = new String(byteAbc, 2, 5);
		assertEquals(string, "cdefg");
	}

	@Test
	public void testStringConructorWithCharSet() throws UnsupportedEncodingException {
		String abc = new String("abcdefgh");
		byte[] byteAbc = abc.getBytes();
		String string8 = new String(byteAbc, "UTF-8");

		assertEquals(string8, abc);
	}
	@Test
	public void testStringConructorWithCharSetWithTwoArgs() throws UnsupportedEncodingException {
		String abc = new String("abcdefgh");
		byte[] byteAbc = abc.getBytes();
		String string = new String(byteAbc, 2, 5, "UTF-8");
		assertEquals("cdefg", string);
	}

	@Test
	public void testStringDefaultConructor() {
		String string = new String();
		assertEquals(string, "");
	}
}
