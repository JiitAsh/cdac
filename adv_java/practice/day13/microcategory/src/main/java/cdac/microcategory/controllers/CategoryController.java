package cdac.microcategory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdac.microcategory.dto.CategoryDTO;
import cdac.microcategory.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@PostMapping("/addCategory")
	public boolean registerCategory(@RequestBody CategoryDTO dto) {

		return categoryService.addNewCategory(dto);
	}

	@GetMapping("/getCategory/{cid}")
	public CategoryDTO getCategoryDetails(@PathVariable("cid") int categoryId) {
		return categoryService.getCategoryById(categoryId);
	}

	@GetMapping("/allCategories")
	public List<CategoryDTO> getAllCategories() {
		return categoryService.allCategories();
	}
}
