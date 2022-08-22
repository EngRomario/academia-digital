package com.projectee.academiadigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectee.academiadigital.entity.Matricula;
import com.projectee.academiadigital.entity.form.MatriculaForm;
import com.projectee.academiadigital.service.impl.MatriculaServiceImpl;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private MatriculaServiceImpl service;
	
	@PostMapping
	public Matricula create(@RequestBody MatriculaForm form) {
		return service.create(form);
	}
}
