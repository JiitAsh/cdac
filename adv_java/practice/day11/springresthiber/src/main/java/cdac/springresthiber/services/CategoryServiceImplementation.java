package cdac.springresthiber.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdac.springresthiber.dto.CategoryDTO;
import cdac.springresthiber.entity.Category;

@Service
public class CategoryServiceImplementation implements CategoryService {

	@Autowired
	SessionFactory hibernateFactory;
	
	@Override
	public boolean addNewCategory(CategoryDTO dto) {
		Category entityCategory = new Category();
		BeanUtils.copyProperties(dto, entityCategory);
		
		try (Session hibernateSession = hibernateFactory.openSession()) {
			hibernateSession.beginTransaction();
			hibernateSession.persist(entityCategory);
			hibernateSession.getTransaction().commit();
		} catch (HibernateException e) {
				e.printStackTrace();
		}
		return true;
	}

	@Override
	public CategoryDTO getCategoryById(int categoryId) {
		
		try (Session hibernateSession = hibernateFactory.openSession()) {
//			Category entityCategory = hibernateSession.get(Category.class, categoryId);
			Category entityCategory = (Category)hibernateSession.get(Category.class, categoryId);   // both code works same but casting to category(in lower line) is a safeguard it is working as extra safeguard
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(entityCategory, dto);
			return dto;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<CategoryDTO> allCategory() {
		
		try (Session hibernateSession = hibernateFactory.openSession()) {
			Query<Category> qrCategory = hibernateSession.createQuery("from Category", Category.class);
			List<Category> list = qrCategory.getResultList();
			ArrayList<CategoryDTO> finalList=new ArrayList<>();
			
			for(Category eCategory:list) {
				CategoryDTO dto = new CategoryDTO();
				BeanUtils.copyProperties(eCategory, dto);
				finalList.add(dto);
			}
			return finalList;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
