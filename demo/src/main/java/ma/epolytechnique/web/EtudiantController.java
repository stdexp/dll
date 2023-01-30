package ma.epolytechnique.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ma.epolytechnique.metier.ServiceEtudiant;

@Controller
public class EtudiantController {
    @Autowired
    ServiceEtudiant serviceEtudiant;

    @Secured(value = "ROLE_ADMIN")
    @GetMapping("/etudiants")
    public String AllTaches(Model model) {
        model.addAttribute("etudiant", serviceEtudiant.allEtudiant());
        return "etudiants";
    }

    @Secured(value = { "ROLE_ADMIN", "ROLE_VISITEUR" })
    @GetMapping("/admis")
    public String taches_visiteurs(Model model) {
        model.addAttribute("etudiantAdmis", serviceEtudiant.admis());
        return "admis";
    }
}
