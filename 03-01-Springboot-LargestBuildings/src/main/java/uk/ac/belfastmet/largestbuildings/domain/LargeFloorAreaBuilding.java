package uk.ac.belfastmet.largestbuildings.domain;

public class LargeFloorAreaBuilding {

	private String rank;
	private String name;
	private String country;
	private String place;
	private String floorarea;
	private String image;
	
	public LargeFloorAreaBuilding(String rank, String name, String country, String place, String floorarea, String image)
	{
		this.rank=rank;
		this.name=name;
		this.country=country;
		this.place=place;
		this.floorarea=floorarea;
		this.image=image;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getFloorarea() {
		return floorarea;
	}

	public void setFloorarea(String floorarea) {
		this.floorarea = floorarea;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

}