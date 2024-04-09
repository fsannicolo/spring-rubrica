package it.marconi.springrubrica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import it.marconi.springrubrica.domains.ContactForm;

@Controller
@RequestMapping("/contacts")
public class ContactController {
    
    @GetMapping("/new")
    public ModelAndView newContactForm() {
        return new ModelAndView("contact-form").addObject(new ContactForm());
    }
}
