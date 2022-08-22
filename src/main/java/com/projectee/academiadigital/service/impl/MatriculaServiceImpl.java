package com.projectee.academiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectee.academiadigital.entity.Aluno;
import com.projectee.academiadigital.entity.Matricula;
import com.projectee.academiadigital.entity.form.MatriculaForm;
import com.projectee.academiadigital.repository.AlunoRepository;
import com.projectee.academiadigital.repository.MatriculaRepository;
import com.projectee.academiadigital.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public Matricula create(MatriculaForm form) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		matricula.setAluno(aluno);
		return matriculaRepository.save(matricula);
	}

	@Override
	public Matricula get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matricula> getAll(String bairro) {
		if(bairro == null) {
			return matriculaRepository.findAll();
		}
		if(bairro.trim().length() == 0) {
			return matriculaRepository.findAll();
		}
		return matriculaRepository.findByAlunoBairro(bairro);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
