package com.categoriesProduct.categoriesProduct.Controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.categoriesProduct.categoriesProduct.Entity.Categories;
import com.categoriesProduct.categoriesProduct.Service.CPService;


@RestController
@RequestMapping("/api")
public class CPController {

	@Autowired 
	CPService data;
	
	@PostMapping("/categories")
	public void insDATA(@RequestBody Categories cat) {
			
		data.saveData(cat);
		
	}
		
	@GetMapping("/categories/id")
	public Categories getDATA(@RequestHeader int id) {
		
		Categories cat = data.getData(id);
		return cat;
		
	}
	
	@GetMapping("/categories")
	public List<Categories> getallData(@RequestParam(value = "pagenum",defaultValue ="0",required = false) Integer pagenum,
		                           	@RequestParam(value = "pagesize",defaultValue ="2",required = false) Integer pagesize){
	
		
		List<Categories> cus = data.getallData(pagenum,pagesize);
		return cus;
	}
	
	@DeleteMapping("/categories/id")
	public String deleteData(@RequestHeader int id) {

	     data.deleteData(id);
		return "delete data";
		
	}
	
	@PutMapping("/categories/id")
	public void updateData(@RequestHeader int id ,@RequestBody  Categories cat) {
		
		data.updateData(id, cat);
	}
                
	
}
