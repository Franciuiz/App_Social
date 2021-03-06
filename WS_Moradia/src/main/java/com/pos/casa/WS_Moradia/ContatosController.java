package com.pos.casa.WS_Moradia;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0")
public class ContatosController {

	@Autowired
	ContatosRepository contatosRepository;
	
	
	// GET ALL
	@GetMapping("/contatos")
	public List<Contatos> getAllContatos(){
		return contatosRepository.findAll();
	}
	
	// POST
	@PostMapping("/contatos")
	public Contatos setContatos(@Valid @RequestBody Contatos contatos) {
		return contatosRepository.save(contatos);
	}
	
	
}
