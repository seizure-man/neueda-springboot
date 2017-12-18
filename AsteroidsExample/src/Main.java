import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		//Asteroid ArrayList
		ArrayList<Asteroid> asteroids=new ArrayList<Asteroid>();
		
		//Creating asteroids
		Asteroid asteroid1 = new Asteroid(3, 5, 125, 1000);
		Asteroid asteroid2 = new Asteroid(7, 8, 265, 880);
		Asteroid asteroid3 = new Asteroid(1, 12, 125, 1255);
		
		//Adding asteroids to ArrayList
		asteroids.add(asteroid1);
		asteroids.add(asteroid2);
		asteroids.add(asteroid3);
		
		
		
		
		//Spaceship ArrayList
		ArrayList<Spaceship> spaceships = new ArrayList<Spaceship>();
		
		//Creating spaceships
		Spaceship spaceship1 = new Spaceship(3,1,125,2500);
		
		//Adding spaceships to ArrayList
		spaceships.add(spaceship1);


		
		System.out.println(spaceship1.getLives());
		spaceship1.crash();
		System.out.println(spaceship1.getLives());
		spaceship1.crash();
		System.out.println(spaceship1.getLives());
		spaceship1.crash();
		System.out.println(spaceship1.getLives());
		spaceship1.crash();
		
		System.out.println(spaceship1.getAmmo());
		spaceship1.shoot();
		System.out.println(spaceship1.getAmmo());
		spaceship1.shoot();
		System.out.println(spaceship1.getAmmo());
		spaceship1.shoot();
		System.out.println(spaceship1.getAmmo());
		spaceship1.shoot();
		System.out.println(spaceship1.getAmmo());
		spaceship1.shoot();
		System.out.println(spaceship1.getAmmo());
		spaceship1.shoot();
		/*
		System.out.println("Coordinates: " + spaceship1.getxPos() + ", " + spaceship1.getyPos());
		
		spaceship1.fly(7, 11);
		
		System.out.println("Coordinates: " + spaceship1.getxPos() + ", " + spaceship1.getyPos());

		*/
		
		
		
		

		
		

	}

}
