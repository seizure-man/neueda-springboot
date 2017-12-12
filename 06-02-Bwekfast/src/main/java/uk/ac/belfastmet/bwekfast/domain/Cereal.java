package uk.ac.belfastmet.bwekfast.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cereal {
	

	@Id
	@GeneratedValue
	private Integer cerealid;
	@NotEmpty
	private String manufacturer;
	@NotEmpty
	private String name;
	private Double energy;
	private Double calories;
	private Double protein;
	private Double carbohydrate;
	private Double sugars;
	private Double fat;
	private Double saturates;
	private Double fibre;
	private String sodium;
	private String salt;
	private String iron;
	
	
	public Cereal() {
		super();
	}
	
	
	
	public Integer getCerealid() {
		return cerealid;
	}



	public void setCerealid(Integer cerealid) {
		this.cerealid = cerealid;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getEnergy() {
		return energy;
	}



	public void setEnergy(Double energy) {
		this.energy = energy;
	}



	public Double getCalories() {
		return calories;
	}



	public void setCalories(Double calories) {
		this.calories = calories;
	}



	public Double getProtein() {
		return protein;
	}



	public void setProtein(Double protein) {
		this.protein = protein;
	}



	public Double getCarbohydrate() {
		return carbohydrate;
	}



	public void setCarbohydrate(Double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}



	public Double getSugars() {
		return sugars;
	}



	public void setSugars(Double sugars) {
		this.sugars = sugars;
	}



	public Double getFat() {
		return fat;
	}



	public void setFat(Double fat) {
		this.fat = fat;
	}



	public Double getSaturates() {
		return saturates;
	}



	public void setSaturates(Double saturates) {
		this.saturates = saturates;
	}



	public Double getFibre() {
		return fibre;
	}



	public void setFibre(Double fibre) {
		this.fibre = fibre;
	}



	public String getSodium() {
		return sodium;
	}



	public void setSodium(String sodium) {
		this.sodium = sodium;
	}



	public String getSalt() {
		return salt;
	}



	public void setSalt(String salt) {
		this.salt = salt;
	}



	public String getIron() {
		return iron;
	}



	public void setIron(String iron) {
		this.iron = iron;
	}



	public Cereal(Integer cerealid, String manufacturer, String name, Double energy, Double calories, Double protein,
			Double carbohydrate, Double sugars, Double fat, Double saturates, Double fibre, String sodium, String salt,
			String iron) {
		super();
		this.cerealid = cerealid;
		this.manufacturer = manufacturer;
		this.name = name;
		this.energy = energy;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.sugars = sugars;
		this.fat = fat;
		this.saturates = saturates;
		this.fibre = fibre;
		this.sodium = sodium;
		this.salt = salt;
		this.iron = iron;
	}

}