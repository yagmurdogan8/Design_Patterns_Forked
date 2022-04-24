package headfirst.command.party;

public class MacroCommand implements Command {
	Command[] commands;
 
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
 
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

    /**
     * NOTE:  these commands have to be done backwards to ensure proper undo functionality
     */
	public void undo() {
		for (int i = commands.length -1; i >= 0; i--) {
			commands[i].undo();
		}
	}
}

