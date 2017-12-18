
public abstract class SpaceObject {
	
	private int xPos;
	private int yPos;
	private int direction;
	private int speed;
	
	public SpaceObject() {
		super();
	}
	
	public SpaceObject(int xPos, int yPos, int direction, int speed) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.direction = direction;
		this.speed = speed;
	}
	
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
