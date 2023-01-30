package app;

import app.repositories.*;
import app.entities.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    @Autowired 
	private TaskRepository taskRepository;
	@Autowired 
	private CategoryRepository categoryRepository;

    private static final Logger log = LoggerFactory.getLogger(TodoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

    @Override
  	public void run(String... strings) throws Exception {
  
        if (categoryRepository.count()==0)  {
 			categoryRepository.save(Category.TODO);
 			categoryRepository.save(Category.WIP);
 			categoryRepository.save(Category.DONE);
 			log.info("CATEGORIES table created and populated");
 			Task t = new Task(Category.TODO, "Relire l'énoncé de TP car il a changé");
 			taskRepository.save(t);
 			t = new Task(Category.TODO, "Etudier le code donné");
 			taskRepository.save(t);
 			t = new Task(Category.TODO, "Faire du CSS et du JS avec ce code");
 			taskRepository.save(t);
 	 	} else  {
 	 		log.info(""+categoryRepository.count()+" rows in table CATEGORIES");
 	 		Category.TODO = categoryRepository.findByName("todo").get(0);
 	 		Category.WIP = categoryRepository.findByName("wip").get(0);
 	 		Category.DONE = categoryRepository.findByName("done").get(0);
 	 	}    
  	}

}
