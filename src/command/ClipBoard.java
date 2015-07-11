package command;

public class ClipBoard {
	private String content;

	private ClipBoard() {
	}

	private static ClipBoard instance;

	public static ClipBoard getInstance() {
		if (instance == null) {
			instance = new ClipBoard();
		}
		return instance;

	}

	public void copy(String text) {
		content = text;
	}

	public String paste() {
		return content;
	}
		
}
