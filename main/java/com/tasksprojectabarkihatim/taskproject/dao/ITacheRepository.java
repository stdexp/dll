package com.tasksprojectabarkihatim.taskproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasksprojectabarkihatim.taskproject.entity.Tache;


public interface ITacheRepository  extends JpaRepository<Tache, Integer>
{
   List<Tache> findByCategorie(String categorie);
}
