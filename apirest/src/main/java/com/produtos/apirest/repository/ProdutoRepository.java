package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	//JpaRepository metodos prontos p fazer persistencias no banco 
	
	
	Produto findById(long id);
	

}
