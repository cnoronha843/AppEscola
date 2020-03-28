package br.com.infnet2.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet2.app.negocio.Aluno;
import br.com.infnet2.app.negocio.Escola;
import br.com.infnet2.app.repository.IAlunoRepository;

@RestController
@RequestMapping("/api/escola/")
public class AlunoController {
	
	@Autowired
	private IAlunoRepository repository;
	@GetMapping
	public List<Aluno> obterLista(){
		return (List<Aluno>)repository.findAll();
	}
	@PostMapping
	public void incluir(@RequestBody Aluno	aluno) {
	repository.save(aluno);
		
	}
	@PostMapping("new/{nome}")
	public void incluir(@PathVariable String nome) {
		repository.save(new Aluno(nome));
		
	}
	@GetMapping("{id}")
	public Optional<Aluno> obterPorId(@PathVariable Integer id) {
		
		return repository.findById(id);
	}
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	

}
