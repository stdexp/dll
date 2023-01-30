package com.tasksprojectabarkihatim.taskproject.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tasksprojectabarkihatim.taskproject.TacheDTO;
import com.tasksprojectabarkihatim.taskproject.entity.Tache;
import com.tasksprojectabarkihatim.taskproject.metier.ServiceTache;

import org.springframework.stereotype.Controller;

@Controller
public class TacheController {
    @Autowired
    ServiceTache servicetache;

    @Secured(value = "ROLE_ADMIN")
    @GetMapping("/taches")
    public String AllTaches(Model model) {
        model.addAttribute("tache", servicetache.allTaches());
        return "taches";
    }

    @Secured(value = { "ROLE_ADMIN", "ROLE_VISITEUR" })
    @GetMapping("/tacheafaire")
    public String taches_visiteurs(Model model) {
        model.addAttribute("tache_a_faire", servicetache.tacheAFaire());
        return "tacheafaire";
    }



    // Save operation
    @Secured(value = "ROLE_ADMIN")
    @ModelAttribute("tache")
    public TacheDTO tacheDto() {
        return new TacheDTO();
    }

        // Save operation
    @Secured(value = "ROLE_ADMIN")
    @GetMapping
    public String showAddTaskForm(Model model) {
        return "add_task";
    }

       // Save operation
    @Secured(value = "ROLE_ADMIN")
    @PostMapping
    public String registerTask(@ModelAttribute("tache") @Valid TacheDTO tachedto,
        BindingResult result) {

       

        servicetache.addTache(tachedto);
        return "redirect:/add_task?success";
    }
}
