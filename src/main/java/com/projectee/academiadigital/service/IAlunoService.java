package com.projectee.academiadigital.service;

import java.util.List;

import com.projectee.academiadigital.entity.Aluno;
import com.projectee.academiadigital.entity.form.AlunoForm;
import com.projectee.academiadigital.entity.form.AlunoUpdateForm;

public interface IAlunoService {
	Aluno create (AlunoForm form);
	
	Aluno get(Long id);
	
	List<Aluno> getAll(String dataDeNascimento);
	
	Aluno update(Long id, AlunoUpdateForm formupdate);
	
	void delete(Long id);
}
