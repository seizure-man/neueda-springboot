
public class Spaceship extends SpaceObject{
	
	private int ammo = 20;
	private int lives = 3;
	
	
	
	public Spaceship(int xPos, int yPos, int direction, int speed) {
		super(xPos, yPos, direction, speed);
	}
	
	public Spaceship(int ammo, int lives) {
		super();
		this.ammo = ammo;
		this.lives = lives;
	}
	
	public int getAmmo() {
		return ammo;
	}
	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public void shoot() {
		this.ammo -= 4;
		if (this.ammo == 0)
		{
			System.out.println("Out of ammo");
		}
	}
	
	public void crash() {
		this.lives -= 1;
		
		if (this.lives == 0)
		{
			System.out.println("You lose");
		}
	}
	
	public void fly(int i, int j) {
		this.setxPos(i);
		this.setyPos(j);
	}

	
}
