package command;

public abstract class Command {
	private int commandId;

	public abstract void execute();

	public abstract void undo();

	public Command(int commandId) {

		this.commandId = commandId;
	}

	public int getCommandId() {
		return commandId;
	}

}
