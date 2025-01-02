package cdac.springrestrepo.dto;

public class CategoryDTO {
	int categoryId;

	String categoryName;

	String catgoryImageUrl;

	String categoryDescription;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCatgoryImageUrl() {
		return catgoryImageUrl;
	}

	public void setCatgoryImageUrl(String catgoryImageUrl) {
		this.catgoryImageUrl = catgoryImageUrl;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

}