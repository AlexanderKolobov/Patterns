package command;

public class AddString extends Command {
	private Editor editor;
	private String text;

	public AddString(Editor editor, String text) {
		super(CommandManager.ADDSTRING_COMMAND);
		this.editor = editor;
		this.text = text;
	}

	@Override
	public void execute() {
		editor.addString(text);
	}

	@Override
	public void undo() {
		editor.remString(text.length());
	}

}
