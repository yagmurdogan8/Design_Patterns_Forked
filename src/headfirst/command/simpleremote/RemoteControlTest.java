package headfirst.command.simpleremote;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();

		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		remote.setCommand(lightOff);
		remote.buttonWasPressed();
    }
}
