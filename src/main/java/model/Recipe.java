package model;

public class Recipe {

	Integer id;
	String category;
	String timeRequired;
	String[] ingredients;
	String[] steps;
	String[] credits;
	String imagePath;
	Integer idDish;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(String timeRequired) {
		this.timeRequired = timeRequired;
	}

	public String[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}

	public String[] getSteps() {
		return steps;
	}

	public void setSteps(String[] steps) {
		this.steps = steps;
	}

	public String[] getCredits() {
		return credits;
	}

	public void setCredits(String[] credits) {
		this.credits = credits;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getIdDish() {
		return idDish;
	}

	public void setIdDish(Integer idDish) {
		this.idDish = idDish;
	}

}
