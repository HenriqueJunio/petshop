package com.henrique.petshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.petshop.domain.Servico;
import com.henrique.petshop.repository.ServicoRepository;
import com.henrique.petshop.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class ServicoService {
	@Autowired
	private ServicoRepository repo;
	
	public Servico find(Integer id) {
		Optional<Servico> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não encontrado. ID: "+id+", Tipo: "+Servico.class.getName()));
	}
}