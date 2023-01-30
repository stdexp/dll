package com.tasksprojectabarkihatim.taskproject.metier;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasksprojectabarkihatim.taskproject.TacheDTO;
import com.tasksprojectabarkihatim.taskproject.dao.ITacheRepository;
import com.tasksprojectabarkihatim.taskproject.entity.Tache;

@Service
public class ServiceTache implements ITache {
    
    
        //injection de dépendance
          @Autowired
          ITacheRepository tacherepository;

          
          
          @Override
          public List<Tache> allTaches() {
              return tacherepository.findAll();
          }
      
       
          @Override
          public  List<Tache> tacheAFaire() {
            return tacherepository.findByCategorie("EN COURS");
          }


          @Override
          public Tache addTache(TacheDTO tache) {

            Tache t = new Tache();

            tache.setCode_tache(t.getCode_tache());
            tache.setCategorie(t.getCategorie());
            tache.setContenu(t.getContenu());
            tache.setDate_creation(t.getDate_creation());

            return tacherepository.save(t);
          }
      
       
          
      
      }
      