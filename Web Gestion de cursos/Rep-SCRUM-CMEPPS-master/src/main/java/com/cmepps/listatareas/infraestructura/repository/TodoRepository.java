package com.cmepps.listatareas.infraestructura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.dominio.model.Todo;


public interface TodoRepository extends JpaRepository < Todo, Long > {
    List < Todo > findByUserName(String user);
}