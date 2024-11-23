package com.lutero.clientes.dto;

import java.time.LocalDate;

import com.lutero.clientes.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ClientDTO {

	private Long id;

	@Size(min = 3, max = 80, message = "Nome precisa ter de 3 a 80 Caracteres")
	@NotBlank(message = "Campo requerido")
	private String name;

	@NotBlank(message = "Campo requerido")
	private String cpf;

	@Positive(message = "O numero de criança(s) deve(m) ser positivo")
	@NotNull(message = "O campo renda é obrigatório")
	private Double income;

	@PastOrPresent
	@NotNull(message = "A data de nascimento é obrigatória")
	private LocalDate birthDate;

	@Positive(message = "O numero de criança(s) deve(m) ser positivo")
	@NotNull(message = "A data de nascimento é obrigatória")
	private Integer children;

	
	
	public ClientDTO() {
		
	}

	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}

}
