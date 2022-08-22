package com.projectee.academiadigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectee.academiadigital.entity.Aluno;
import com.projectee.academiadigital.entity.AvaliacaoFisica;
import com.projectee.academiadigital.entity.form.AlunoForm;
import com.projectee.academiadigital.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	@Autowired
	private AlunoServiceImpl service;
	
	@PostMapping
	public Aluno create(@RequestBody AlunoForm form) {
		return service.create(form);
	}
	
	@GetMapping("/{id}/avaliacoes")
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaById(@PathVariable Long id){
		return service.getAllAvaliacaoFisicaById(id);
	}
	
	@GetMapping
	public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento){
		return service.getAll(dataDeNascimento);
	}
}
