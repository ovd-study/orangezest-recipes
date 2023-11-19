package model;

public class Dish {
	Integer id;
	String Title;
	String Description;
	String imagePath;
	Integer idCuisine;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
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
