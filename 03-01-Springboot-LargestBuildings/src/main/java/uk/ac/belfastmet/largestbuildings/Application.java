package uk.ac.belfastmet.largestbuildings;

import java.util.ArrayList;	
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.ac.belfastmet.largestbuildings.domain.LargeFloorAreaBuilding;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
