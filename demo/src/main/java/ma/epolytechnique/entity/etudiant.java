package ma.epolytechnique.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String nom;
	private int note;


    public etudiant() {
        super();
    }


    public etudiant(int id, String nom, int note) {
        this.id = id;
        this.nom = nom;
        this.note = note;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getNote() {
        return note;
    }


    public void setNote(int note) {
        this.note = note;
    }

    
    
}
