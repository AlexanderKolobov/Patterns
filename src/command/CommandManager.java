package command;

import java.util.Stack;

public class CommandManager {

	public static final int UNDO = 0;
	public static final int ADDSTRING_COMMAND = 1;
	public static final int ADDSYMBOL_COMMAND = 2;
	public static final int COPY_TO_CLIPBOARD_COMMAND = 3;
	public static final int PASTE_FROM_CLIPBOARD_COMMAND = 4;
	
	private Stack<Command> commands = new Stack<>();

	public void add(Command command) {
		command.execute();
		commands.push(command);
	}

	public void undo() {
		if(commands.isEmpty()){
			System.out.println("Nothing to undo");
			return;
		}
		Command command = commands.pop();
		command.undo();
	}
}
