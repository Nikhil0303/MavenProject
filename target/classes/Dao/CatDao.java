package Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shopingcart.bean.Category;



@Repository
public class CategoryDAO {
	


	public List<Category> getAllCategories() {

		List<Category> list = new ArrayList<Category>();
		Category c1 = new Category();
		c1.setId("CAT_MOB");
		c1.setName("Mobile");
		c1.setDescription("This is Mobile Category");

		list.add(c1);

		c1 = new Category();
		c1.setId("CAT_EL");
		c1.setName("Electronics");
		c1.setDescription("This is Electronics Category");

		list.add(c1);

		c1 = new Category();
		c1.setId("CAT_HK");
		c1.setName("HouseKeeping");
		c1.setDescription("This is House Keeping Category");

		list.add(c1);

		return list;

	}
	
	
	public int updateCategories(List<Category>  categoryList)
	{
		
		
		return 1;
	}
	



}
