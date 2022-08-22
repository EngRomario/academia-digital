package com.projectee.academiadigital.service;

import java.util.List;

import com.projectee.academiadigital.entity.Matricula;
import com.projectee.academiadigital.entity.form.MatriculaForm;

public interface IMatriculaService {

	Matricula create(MatriculaForm form);
	
	Matricula get(Long id);
	
	List<Matricula> getAll(String bairro);
	
	void delete(Long id); 
}
