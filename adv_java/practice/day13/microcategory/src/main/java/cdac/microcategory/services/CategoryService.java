package cdac.microcategory.services;

import java.util.List;

import cdac.microcategory.dto.CategoryDTO;

public interface CategoryService {
	
	
	public boolean addNewCategory(CategoryDTO dto);
	public CategoryDTO getCategoryById(int categoryId);
	public List<CategoryDTO> allCategories();
}
