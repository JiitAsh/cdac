package cdac.springresthiber.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@Column(name="categoryid")
	int categoryId;
	
	@Column(name="categoryname")
	String categoryName;
	
	@Column(name="categoryimageurl")
	String catgoryImageUrl;
	
	@Column(name="categorydescription")
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

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", catgoryImageUrl="
				+ catgoryImageUrl + ", categoryDescription=" + categoryDescription + "]";
	}
	
	
}
