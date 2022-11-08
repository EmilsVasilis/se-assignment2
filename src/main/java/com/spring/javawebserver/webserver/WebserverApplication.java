package com.spring.javawebserver.webserver;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import Calc.Calculator;

@SpringBootApplication
public class WebserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserverApplication.class, args);
	}

}

// @Document(collection = "notes")
// @Setter
// @Getter
// @NoArgsConstructor
// @AllArgsConstructor
// class Note {
//     @Id
//     private String id;
//     private String description;
//
//
//     @Override
//     public String toString() {
//         return description+" "+id;
//     }
// }







@Controller
class NoteController {
		//
    // @Autowired
    // private NotesRepository notesRepository;


    // @GetMapping("/")
    // public String index(Model model) {
    //     // getAllNotes(model);
    //     return "index";
    // }

    @PostMapping("/note")
    public String saveNotes(@RequestParam String description,
                            @RequestParam(required = false) String add,
                            Model model) throws Exception {
				Calculator Calc = new Calculator();
				double result = Calc.evaluate(description);
				// String error= Calc.evaluate(description);
				model.addAttribute("result", result);
				// model.addAttribute("error", error);
        // if (add != null && add.equals("Add note")) {
        //     // saveNote(description, model);
        //     // getAllNotes(model);
        //     return "redirect:/";
        // }
        return "index";
    }


    // private void getAllNotes(Model model) {
    //     List<Note> notes = notesRepository.findAll();
    //     Collections.reverse(notes);
    //     model.addAttribute("notes", notes);
    // }
		//
		//
		//
    // private void saveNote(String description, Model model) {
    //     if (description != null && !description.trim().isEmpty()) {
    //     	java.util.Date timeStamp=new java.util.Date();
    //         notesRepository.save(new Note(timeStamp.toString(), description.trim()));
    //         model.addAttribute("description", "");
    //     }
    // }

}
