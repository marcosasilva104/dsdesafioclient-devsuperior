package com.devsuperior.dsdesafioclient.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdesafioclient.dto.ClientDTO;
import com.devsuperior.dsdesafioclient.entities.Client;
import com.devsuperior.dsdesafioclient.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();

		List<ClientDTO> listDto = new ArrayList<>();
		return list.stream().map(cli -> new ClientDTO(cli)).collect(Collectors.toList());
	}
}
