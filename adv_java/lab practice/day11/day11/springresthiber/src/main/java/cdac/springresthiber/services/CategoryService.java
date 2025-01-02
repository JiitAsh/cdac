package cdac.springresthiber.services;

import java.util.List;

import cdac.springresthiber.dto.CategoryDTO;

public interface CategoryService {
	public boolean addNewCategory(CategoryDTO dto);
	public CategoryDTO getCategoryById(int categoryId);
	public List<CategoryDTO> allCategory();
}
