package com.tasksprojectabarkihatim.taskproject;

import java.util.Date;

import javax.validation.constraints.NotEmpty;



public class TacheDTO {
    @NotEmpty
    private int code_tache;

    @NotEmpty
	private String contenu;

    @NotEmpty
	private String categorie;

    @NotEmpty
	private Date date_creation;

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
