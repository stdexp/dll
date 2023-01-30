package com.tasksprojectabarkihatim.taskproject.metier;

import java.util.List;

import com.tasksprojectabarkihatim.taskproject.TacheDTO;
import com.tasksprojectabarkihatim.taskproject.entity.Tache;



public interface ITache {
	
	public List<Tache> allTaches();

	public List<Tache> tacheAFaire();

	// Save operation
    Tache addTache(TacheDTO tache);
	

}
