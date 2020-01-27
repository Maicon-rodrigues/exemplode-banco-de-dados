package br.com.maicon.livraria.repository;

import br.com.maicon.livraria.model.livrariaModel;
import org.springframework.data.repository.CrudRepository;

public interface livrariaRepository extends CrudRepository<livrariaModel, String> {

}
