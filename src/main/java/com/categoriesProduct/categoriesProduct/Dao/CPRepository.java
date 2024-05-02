package com.categoriesProduct.categoriesProduct.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.categoriesProduct.categoriesProduct.Entity.Categories;
public interface CPRepository extends JpaRepository<Categories,Integer>,CrudRepository<Categories,Integer> ,PagingAndSortingRepository<Categories,Integer> {

	
	
}
