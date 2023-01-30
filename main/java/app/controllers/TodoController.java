package app.controllers;

import app.entities.*;
import app.repositories.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.validation.BindingResult;


@Controller
public class TodoController {
	@Autowired 
	private TaskRepository taskRepository;
	@Autowired 
	private CategoryRepository categoryRepository;
	@Autowired 
	private static final Logger log = LoggerFactory.getLogger(TodoController.class);;

    @GetMapping(path={"/", "/tasks"})
	public String  index(Model model) {
		model.addAttribute("tasks", taskRepository.findAll());
		return "index"; 
	}

    @GetMapping(path="/tasks/new")
    public String  nouveau(Model model, @ModelAttribute Task task, BindingResult br) {
		model.addAttribute("categories", categoryRepository.findAll());
		log.info("NOUVEAU"+ categoryRepository.count());
		task.setCategory(Category.TODO);
		return "nouveau"; 
	}

    @PostMapping(path={"/tasks"})
	public String  create(Model model, @ModelAttribute Task task, BindingResult br) {
		// Au cas où le binding ne se ferait que sur l'id et pas sur category
		// task.setCategory(categoryRepository.findById(task.getCategory().getId()).get());
		taskRepository.save(task);
		return "redirect:/tasks"; 
	}

}