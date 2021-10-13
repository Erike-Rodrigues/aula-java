package br.itau.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.spring02.model.Produto;

//CRUD = create,read,update,delete
public interface ProdutoRepo extends CrudRepository<Produto, Long>{
    
}
