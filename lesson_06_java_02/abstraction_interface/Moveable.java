package abstraction_interface;

public interface Moveable {
	
	int MAX_SPEED = 200;
	
	void move(int speed);
	void stop();
}
