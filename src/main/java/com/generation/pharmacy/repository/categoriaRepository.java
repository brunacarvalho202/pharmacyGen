package com.generation.pharmacy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.pharmacy.model.categoriaModel;

@Repository
public interface categoriaRepository extends JpaRepository<categoriaModel,Long>{
	
	public List <categoriaModel> findAllByCategoriaContainingIgnoreCase(String categoria);
  
}

