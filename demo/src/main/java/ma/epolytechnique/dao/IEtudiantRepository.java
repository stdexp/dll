package ma.epolytechnique.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.epolytechnique.entity.etudiant;

public interface IEtudiantRepository extends JpaRepository<etudiant,Integer>{
    List<etudiant> findByNote(int note);
    
}
