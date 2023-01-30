package ma.epolytechnique.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.epolytechnique.dao.IEtudiantRepository;
import ma.epolytechnique.entity.etudiant;

@Service
public class ServiceEtudiant implements IEtudiant{

    @Autowired
    IEtudiantRepository etudiantRepository;

    @Override
    public List<etudiant> allEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public List<etudiant> admis() {
        return etudiantRepository.findByNote(10);
    }
    
}
