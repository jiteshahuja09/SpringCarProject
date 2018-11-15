import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Autowired
	private Fuel fuel;
	private String type;
	private int noOfWheels;
	private int seat;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public void start() {
		System.out.println("Bike started with the help of Button");
	}

	public void accelerator() {
		System.out.println("Start Accelerator");
	}

	public void headlight() {
		System.out.println("Headlight On");
	}

	public void horn() {
		System.out.println("Bike Horn");
	}

	public void stop() {
		fuel.fuelConsume(1);
		System.out.println("Bike had stopped");
	}

	public void showFuel() {
		fuel.consume();
	}
}
