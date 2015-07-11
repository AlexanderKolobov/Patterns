package command;

public class AddSymbol extends Command {
	private Editor editor;
	private char symbol;

	public AddSymbol(Editor editor, char symbol) {
		super(CommandManager.ADDSYMBOL_COMMAND);
		this.editor = editor;
		this.symbol = symbol;
	}

	@Override
	public void execute() {
		editor.addSymbol(symbol);
	}

	@Override
	public void undo() {
		editor.remSymbol();
	}

}
