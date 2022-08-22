package com.projectee.academiadigital.service;


import java.util.List;

import com.projectee.academiadigital.entity.AvaliacaoFisica;
import com.projectee.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.projectee.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {
	
	AvaliacaoFisica create(AvaliacaoFisicaForm form);
	
	AvaliacaoFisica get(Long id);
	
	List<AvaliacaoFisica> getAll();

	AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
	
	void delete(Long id);
}
