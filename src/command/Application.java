package command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) throws IOException {
		Editor editor = new Editor();
		CommandManager commandManager = new CommandManager();

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String inputText = reader.readLine();

		while (!inputText.equals("/exit")) {
			switch (inputText) {
			case "/u":
				commandManager.undo();
				break;
			case "/c":
				System.out.println("Enter index of first symbol");
				int startIndex = Integer.parseInt(reader.readLine());
				System.out.println("Enter index of last symbol");
				int endIndex = Integer.parseInt(reader.readLine());
				commandManager.add(new CopyToClipBoard(editor, startIndex,
						endIndex));
				break;
			case "/p":
				System.out.println("Enter index of position to paste");
				int position = Integer.parseInt(reader.readLine());
				commandManager.add(new PasteFromClipBoard(editor, position));
				break;
			default:
				if (inputText.length() == 1) {
					commandManager.add(new AddSymbol(editor, inputText
							.charAt(0)));
				} else {
					commandManager.add(new AddString(editor, inputText));
				}
			}
			inputText = reader.readLine();

		}
	}
}
