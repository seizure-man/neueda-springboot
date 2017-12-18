import java.util.ArrayList;

public class Whale extends Animal{
	
	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;
	
	
	public Whale() {
		super();
	}
	

	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	}


	public String getMainOcean() {
		return mainOcean;
	}
	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Whale [name=" + super.getName() + ", mainOcean=" + mainOcean + ", weight=" + weight + ", maxSpeed=" + maxSpeed + ", length=" + length
				+ "]";
	}
	
	public String printAllWhales(ArrayList<Whale> whales)
	{
		return "Whale [name=" + super.getName() + ", mainOcean=" + mainOcean + ", weight=" + weight + ", maxSpeed=" + maxSpeed + ", length=" + length
				+ "]";
	}
	
	public static void printAtlanticWhales(ArrayList<Whale> whales)
	{

		Whale atlanticWhale = new Whale();
		
		for (int i=0; i<whales.size(); i++)
		{
			if (atlanticWhale.getMainOcean().equals("Atlantic"))
			{
				System.out.println(atlanticWhale.getName());
			}
		}
	}
	
	public static void storeWhales()
	{
		ArrayList<Whale> whales = new ArrayList<Whale>();
		
		Whale whale1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale whale2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale whale3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale whale4 = new Whale("Humpback", "Antarctic", 919, 13, 13);
		
		whales.add(whale1);
		whales.add(whale2);
		whales.add(whale3);
		whales.add(whale4);
	}
	
	public static void averageWhaleLength()
	{
		
	}

	

}
