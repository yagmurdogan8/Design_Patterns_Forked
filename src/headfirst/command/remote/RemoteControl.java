package headfirst.command.remote;

public class RemoteControl {

	private static final int NUM_SLOTS = 7;

	Command[] onCommands;
	Command[] offCommands;
 
	public RemoteControl() {
		onCommands = new Command[NUM_SLOTS];
		offCommands = new Command[NUM_SLOTS];
 
		Command noCommand = new NoCommand();
		for (int i = 0; i < NUM_SLOTS; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
  
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			builder.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("    ").append(offCommands[i].getClass().getName()).append("\n");
		}
		return builder.toString();
	}
}
