package br.com.maicon.livraria.service;

import br.com.maicon.livraria.model.livrariaModel;
import br.com.maicon.livraria.repository.livrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class livrariaService {
    @Autowired
    private livrariaRepository repository;


    public livrariaModel cadastrarLivro(livrariaModel livro) {
        return repository.save(livro);
    }
}
