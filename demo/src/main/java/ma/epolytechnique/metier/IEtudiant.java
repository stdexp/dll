package ma.epolytechnique.metier;

import java.util.List;

import ma.epolytechnique.entity.etudiant;

public interface IEtudiant {
    public List<etudiant> allEtudiant();
    public List<etudiant> admis();

}
