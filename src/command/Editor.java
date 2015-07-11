package command;

/**
 * 
 * @author ITHILLEL8 input string, input symbol, copy text to clipboard, insert
 *         text from clipboard, undo changes.
 **/

public class Editor {
	private StringBuilder text = new StringBuilder();
	private ClipBoard clipBoard = ClipBoard.getInstance();

	public void addSymbol(char symbol) {
		text.append(symbol);
		System.out.println(text);
	}

	public void remSymbol() {
		text.deleteCharAt(text.length() - 1);
		System.out.println(text);
	}

	public void addString(String string) {
		text.append(string);
		System.out.println(text);
	}

	public void remString(int length) {
		text.delete(text.length() - length, text.length());
		System.out.println(text);
	}

	public void copyToClipBoard(int start, int end) {
		
		clipBoard.copy(text.substring(start, end));
		System.out.println(text);
		
	}
	public int pasteFromClipboard(int position){
		if (clipBoard == null){
			System.out.println(text);
			return 0;
		}
		text.insert(position - 1, clipBoard.paste());
		System.out.println(text);		
		return clipBoard.paste().length();
	}

	public void remJustPasted(int position, int length) {
		text.delete(position - 1, position - 1 + length);
		System.out.println(text);
	}
	public String showText(){
		return text.toString();
	}
}
