import java.util.ArrayList;

public class DwarfsandDwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ArrayList<String> dwarfs = new ArrayList<>();
		 ArrayList<String> dwarves = new ArrayList<>();
		 
		 dwarfs.add("Happy");
		 dwarfs.add("Sleepy");
		 dwarfs.add("Dopey");
		 dwarfs.add("Bashful");
		 dwarfs.add("Sneezy");
		 dwarfs.add("Doc");
		 dwarfs.add("Grumpy");
		 
		 dwarves.add("Thorin");
		 dwarves.add("Balin");
		 dwarves.add("Dwalin");
		 dwarves.add("Fíli");
		 dwarves.add("Kíli");
		 dwarves.add("Dori");
		 dwarves.add("Nori");
		 dwarves.add("Ori");
		 dwarves.add("Óin");
		 dwarves.add("Glóin");
		 dwarves.add("Bifur");
		 dwarves.add("Bofur");
		 dwarves.add("Bombur");
		 
		 System.out.println("Disney Dwarfs: \n");
		 
		 
		 for(int i=0; i<dwarfs.size(); i++)
		 {
			 System.out.println(dwarfs.get(i));
		 }
		 
		 
		 System.out.println("\nTolkein Dwarfs: \n");
		 
		 for(int j=0; j<dwarves.size(); j++)
		 {
			 System.out.println(dwarves.get(j));
		 }
		 
	}

}
