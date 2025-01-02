package cdac.springrestrepo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cdac.springrestrepo.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
	@Query("select objCategory from Category objCategory where objCategory.categoryName like :name%")
	public List<Category> getCategoriesWithLike(@Param("name") String name);
	
}