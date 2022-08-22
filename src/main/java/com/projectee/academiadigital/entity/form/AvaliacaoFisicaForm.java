package com.projectee.academiadigital.entity.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {
	@NotBlank(message="Preencha o campo corretamente.")
	@Positive(message="O Id do aluno precisa ser positivo.")
	private Long alunoId;
	@NotBlank(message="Preencha o campo corretamente.")
	@Positive(message="'${validatedValue}' precisa ser positivo.")
	private double peso;
	@NotBlank(message="Preencha o campo corretamente.")
	@Positive(message="'${validatedValue}' precisa ser positivo.")
	private double altura;
}
