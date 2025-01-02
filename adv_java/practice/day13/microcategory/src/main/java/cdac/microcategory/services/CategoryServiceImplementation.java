package cdac.microcategory.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdac.microcategory.dto.CategoryDTO;
import cdac.microcategory.entity.Category;
import cdac.microcategory.repositories.CategoryRepository;

@Service
public class CategoryServiceImplementation implements CategoryService {

	@Autowired
	CategoryRepository categoryRepo;

	@Override
	public boolean addNewCategory(CategoryDTO dto) {
		Category entityCategory = new Category();
		BeanUtils.copyProperties(dto, entityCategory);
		categoryRepo.save(entityCategory);
		return true;
	}

	@Override
	public CategoryDTO getCategoryById(int categoryId) {
		Optional<Category> optCat = categoryRepo.findById(categoryId);

		if (optCat.isPresent()) {
			Category entityCategory = optCat.get();
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(entityCategory, dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<CategoryDTO> allCategories() {
		Iterator<Category> iter = categoryRepo.findAll().iterator();
		ArrayList<CategoryDTO> finalList = new ArrayList<>();

		while (iter.hasNext()) {
			Category entityCategory = iter.next();
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(entityCategory, dto);
			finalList.add(dto);

		}
		return finalList;
	}

}
