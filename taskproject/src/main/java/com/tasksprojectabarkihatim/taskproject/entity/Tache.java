package com.tasksprojectabarkihatim.taskproject.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
public class Tache  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code_tache;
	private String contenu;
	private String categorie;
	private Date date_creation;
	
	
	public Tache() {
		super();
	}



    


    public Tache(int code_tache, String contenu, String categorie, Date date_creation) {
        this.code_tache = code_tache;
        this.contenu = contenu;
        this.categorie = categorie;
        this.date_creation = date_creation;
    }






    public int getCode_tache() {
        return code_tache;
    }


    public void setCode_tache(int code_tache) {
        this.code_tache = code_tache;
    }


    public String getContenu() {
        return contenu;
    }


    public void setContenu(String contenu) {
        this.contenu = contenu;
    }


    public String getCategorie() {
        return categorie;
    }


    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


    public Date getDate_creation() {
        return date_creation;
    }


    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

	
	
	
	
}
