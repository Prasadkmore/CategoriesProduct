package com.categoriesProduct.categoriesProduct.Service;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.categoriesProduct.categoriesProduct.Dao.CPRepository;
import com.categoriesProduct.categoriesProduct.Entity.Categories;

@Service
public class CPService {

		@Autowired
		CPRepository data;
		
		@Autowired
		SessionFactory factory;
		
		//get particular data from database
		 public Categories getData(int  id){
		        return data.findById(id).orElse(null);
		    }

		//save the data into  database
		public void saveData(Categories cat) {
			// TODO Auto-generated method stub
			data.save(cat);
		
		}	
		
		//get all data from database
		public List<Categories> getallData(int pagenum,int pagesize){	
			
			Pageable p=PageRequest.of(pagenum,pagesize);
			Page<Categories> categories  = data.findAll(p);
			List<Categories> catList = categories.getContent();
			return catList;
			
		}
		
		//delete particular data into database
		public String deleteData(int id) {	
			data.deleteById(id);
			return "delete data";
			
		}
       
		//update particular data into database
		public void updateData(int id ,Categories cat) {
			
			Session session= factory.openSession();	
			session.beginTransaction();
			Categories categories = session.get(Categories.class, id);
			categories.setC_name(cat.getC_name());
			categories.setProducts(cat.getProducts());
			session.merge(categories);
			session.getTransaction().commit();
			session.close();

		}
}
