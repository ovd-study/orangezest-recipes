package model;

public class Dish {
	Integer id;
	String title;
	String description;
	String imagePath;
	Integer idCuisine;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getIdCuisine() {
		return idCuisine;
	}

	public void setIdCuisine(Integer idCuisine) {
		this.idCuisine = idCuisine;
	}

}
