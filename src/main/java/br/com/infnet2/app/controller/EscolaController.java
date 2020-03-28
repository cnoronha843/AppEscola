package br.com.infnet2.app.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet2.app.negocio.Aluno;
import br.com.infnet2.app.negocio.Escola;
@RestController
@RequestMapping("/api/aluno/")
public class EscolaController {
	
	private static Map<Integer, Escola> mapaEscola = new HashMap<Integer, Escola>();
	private static Integer key = 0;
	@GetMapping
	public ArrayList<Escola> obterLista(){
		return new ArrayList<Escola>(mapaEscola.values());
	}
	@PostMapping
	public void incluir(@RequestBody Aluno	aluno) {
		
		
	}
	@PostMapping("new/{nome}")
	public void incluir(@PathVariable String nome) {
		
		
	}
	@GetMapping("{id}")
	public Aluno obterPorId(@PathVariable Integer id) {
		
		return null;
	}
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		
	}
	
	

}
