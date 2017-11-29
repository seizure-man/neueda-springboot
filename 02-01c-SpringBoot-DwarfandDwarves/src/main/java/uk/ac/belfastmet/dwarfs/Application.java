package uk.ac.belfastmet.dwarfs;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@SpringBootApplication
public class Application {
	

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void createDwarfs()
	{
		
		//TODO have dwarf names in a list
		//loop through list
		// call constructor once for every name in list 
		// for every name in list 
		//      Dwarf name = new Dwarf(name, "Disney" or "Tolkien" (some logic needed), name + ".png);
		
		
		//Map<String, String> dictionary = new HashMap<String, String>();
		//dictionary.put("Disney", "Sleepy");
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "sleepy.png");
		Dwarf dopey = new Dwarf("Dopey", "Disney", "dopey.png");
		Dwarf bashful = new Dwarf("Bashful", "Disney", "bashful.png");
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "sneezy.png");
		Dwarf doc = new Dwarf("Doc", "Disney", "doc.png");
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "grumpy.png");
		Dwarf happy = new Dwarf("Happy", "Disney", "happy.png");
		
		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "thorin.png");
		Dwarf balin = new Dwarf("Balin", "Tolkien", "balin.png");
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "dwalin.png");
		Dwarf fili = new Dwarf("Fili", "Tolkien", "fili.png");
		Dwarf kili = new Dwarf("Kili", "Tolkien", "kili.png");
		Dwarf dori = new Dwarf("Dori", "Tolkien", "dori.png");
		Dwarf nori = new Dwarf("Nori", "Tolkien", "nori.png");
		Dwarf ori = new Dwarf("Ori", "Tolkien", "ori.png");
		Dwarf oin = new Dwarf("Oin", "Tolkien", "oin.png");
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "bifur.png");
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "bofur.png");
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "bombur.png");
		Dwarf gloin = new Dwarf("Gloin", "Tolkien", "gloin.png");
		
		dwarfs.add(sleepy);
		dwarfs.add(dopey);
		dwarfs.add(bashful);
		dwarfs.add(sneezy);
		dwarfs.add(doc);
		dwarfs.add(grumpy);
		dwarfs.add(happy);
		
		dwarfs.add(thorin);
		dwarfs.add(balin);
		dwarfs.add(dwalin);
		dwarfs.add(fili);
		dwarfs.add(kili);
		dwarfs.add(dori);
		dwarfs.add(nori);
		dwarfs.add(ori);
		dwarfs.add(oin);
		dwarfs.add(bifur);
		dwarfs.add(bofur);
		dwarfs.add(bombur);
		dwarfs.add(gloin);
		
		System.out.println("Snow White's Dwarfs");
		System.out.println("Name\tAuthor\tImage");

		for (Dwarf dwarf: dwarfs)
		{
			if (dwarf.getAuthor().equals("Disney"))
			{
				System.out.print(dwarf.getName()+"\t" + dwarf.getAuthor() +"\t"+ dwarf.getImage()+"\n");
			}
		}
		
		System.out.println("\nTolkiens Dwarves");
		System.out.println("Name\tAuthor\tImage");
		
		for (Dwarf dwarf: dwarfs)
		{
			if (dwarf.getAuthor().equals("Tolkien"))
			{
				System.out.print(dwarf.getName()+"\t" + dwarf.getAuthor() +"\t"+ dwarf.getImage()+"\n");
			}
		}
	}
	
}
