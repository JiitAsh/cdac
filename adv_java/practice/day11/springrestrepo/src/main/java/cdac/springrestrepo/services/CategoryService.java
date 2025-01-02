package cdac.springrestrepo.services;

import java.util.List;

import cdac.springrestrepo.dto.CategoryDTO;



public interface CategoryService {
	public boolean addNewCategory(CategoryDTO dto);
	public CategoryDTO getCategoryById(int categoryId);
	public List<CategoryDTO> allCategory();
	public List<CategoryDTO> getCategoryNameLike(String nameLike);
}
