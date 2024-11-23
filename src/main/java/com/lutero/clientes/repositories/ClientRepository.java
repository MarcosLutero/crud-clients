package com.lutero.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lutero.clientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
