package command;

public class CopyToClipBoard extends Command {
	private Editor editor;
	private int start;
	private int end;

	public CopyToClipBoard(Editor editor, int start, int end) {
		super(CommandManager.COPY_TO_CLIPBOARD_COMMAND);
		this.editor = editor;
		this.start = start;
		this.end = end;
	}

	@Override
	public void execute() {
		editor.copyToClipBoard(start, end);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
