package br.com.maicon.livraria.controller;

import br.com.maicon.livraria.model.livrariaModel;
import br.com.maicon.livraria.service.livrariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class livrariaController {

    @Autowired
    private livrariaService service;

    @GetMapping
    public String mostrahome(){;
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastraeLivro(livrariaModel livro){
        service.cadastrarLivro(livro);
        return "index";

    }
}
