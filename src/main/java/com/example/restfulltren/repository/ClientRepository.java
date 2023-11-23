package com.example.restfulltren.repository;

import com.example.restfulltren.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
