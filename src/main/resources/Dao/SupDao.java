package Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shopingcart.bean.Supplier;




@Repository
public class SupplierDAO {
	
	@Autowired
	private Supplier supplier;
	
	public List<Supplier> getAllSuppliers()
	{
		List<Supplier> list = new ArrayList<Supplier>();
		
		Supplier s = new Supplier();
		s.setId("SUP001");
		s.setName("Reliance Digital");
		s.setAddress("Hyderabad");
		list.add(s);
		
		 s = new Supplier();
			s.setId("SUP002");
			s.setName("TMC");
			s.setAddress("Bangalore");
			list.add(s);
			
			 s = new Supplier();
				s.setId("SUP003");
				s.setName("Shoperstop");
				s.setAddress("Delhi");
				list.add(s);
		return list;
		
	}

}
