package command;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EditorTest {
	Editor editor;

	@Before
	public void setUp() {
		editor = new Editor();
	}

	@Test
	public void testAddSymbol() {
		editor.addSymbol('f');
		assertEquals(editor.showText().charAt(0), 'f');
	}

	@Test
	public void testRemSymbol() {
		editor.addSymbol('a');
		editor.addSymbol('b');
		editor.remSymbol();
		assertEquals(editor.showText().charAt(0), 'a');
	}

	@Test
	public void testAddString() {
		editor.addString("sasha");
		assertEquals(editor.showText(), "sasha");
	}

	@Test
	public void testRemString() {
		editor.addString("sasha");
		editor.addString("+valia");
		editor.remString(5);
		assertEquals(editor.showText(), "sasha+");
	}
}
