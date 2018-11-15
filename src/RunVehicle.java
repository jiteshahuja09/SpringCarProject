import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunVehicle {
	@Autowired
	private Car car;
	@Autowired
	private Bike bike;

	public void run() {
		car.start();
		car.headlight();
		car.horn();
		car.stop();
		car.showFuel();
		bike.start();
		bike.headlight();
		bike.horn();
		bike.stop();
		bike.showFuel();
	}
}
