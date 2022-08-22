package com.projectee.academiadigital.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectee.academiadigital.entity.Aluno;
import com.projectee.academiadigital.entity.AvaliacaoFisica;
import com.projectee.academiadigital.entity.form.AlunoForm;
import com.projectee.academiadigital.entity.form.AlunoUpdateForm;
import com.projectee.academiadigital.infra.utils.JavaTimeUtils;
import com.projectee.academiadigital.repository.AlunoRepository;
import com.projectee.academiadigital.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

	@Autowired
	private AlunoRepository repository;
	
	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());
		
		return repository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Aluno> getAll(String dataDeNascimento) {
		if(dataDeNascimento == null) {
			return repository.findAll();
		}
		if(dataDeNascimento.trim().length() == 0) {
			return repository.findAll();	
		}
		return repository.findByDataDeNascimento(LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER));
	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public List<AvaliacaoFisica> getAllAvaliacaoFisicaById(Long id) {
		return repository.findById(id).get().getAvaliacoes();
	}
}
