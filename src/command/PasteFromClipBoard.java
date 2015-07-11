package command;

public class PasteFromClipBoard extends Command {
private Editor editor;
private ClipBoard clipBoard = ClipBoard.getInstance();
private int position;
public PasteFromClipBoard(Editor editor, int position) {
	super(CommandManager.PASTE_FROM_CLIPBOARD_COMMAND);
	this.editor = editor;
	this.position = position;
}

@Override
public void execute() {
	editor.pasteFromClipboard(position);
}

@Override
public void undo() {
	editor.remJustPasted(position, clipBoard.paste().length());
}


}
