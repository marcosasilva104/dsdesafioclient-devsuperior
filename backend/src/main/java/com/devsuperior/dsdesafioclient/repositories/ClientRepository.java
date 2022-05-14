package com.devsuperior.dsdesafioclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsdesafioclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
