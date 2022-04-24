package headfirst.command.undo;

public class RemoteControlWithUndo {

	private static final int NUM_SLOTS = 7;

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
 
	public RemoteControlWithUndo() {
		onCommands = new Command[NUM_SLOTS];
		offCommands = new Command[NUM_SLOTS];
 
		Command noCommand = new NoCommand();
		for(int i=0; i<NUM_SLOTS; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
 
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
  
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			builder.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("    ").append(offCommands[i].getClass().getName()).append("\n");
		}
		builder.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");
		return builder.toString();
	}
}
