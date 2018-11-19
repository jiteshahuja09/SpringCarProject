import java.util.Scanner;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Configuration
public class RunVehicle {
	@Autowired
	private Car car;
	@Autowired
	private Bike bike;

	public void run() {
		try {
    		//Mongodb m = new Mongodb();
			MongoClient mongo = new MongoClient("localhost", 27017);
			MongoDatabase database = mongo.getDatabase("mydb");
			MongoCollection collection = database.getCollection("Employee");
			System.out.println("Connected to the database successfully");
			FindIterable iterDoc = collection.find();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter car type");
			String s=sc.nextLine();
			System.out.println("Enter no of wheels");
			int s1=sc.nextInt();
			System.out.println("Enter No of seats");
			int s2=sc.nextInt();
	        Car car1 = new Car(s,s1,s2);
			Gson gson = new Gson();
			String json = gson.toJson(car1);
			System.out.println(json);
			Document myDoc = Document.parse(json);
			collection.insertOne(myDoc); 
			car.start();
			car.headlight();
			car.horn();
			car.stop();
			car.showFuel();
		    System.out.println(car1);
			bike.start();
			bike.headlight();
			bike.horn();
			bike.stop();
			bike.showFuel();
    			      
    	}
    	catch(Exception e) {
    		System.out.println("Not connected");
    	}
		
	
	
	}
}
