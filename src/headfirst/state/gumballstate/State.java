package headfirst.state.gumballstate;

public interface State {
 
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
