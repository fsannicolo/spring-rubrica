package it.marconi.springrubrica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.marconi.springrubrica.domains.ContactForm;

@Controller
@RequestMapping("/contacts")
public class ContactController {
    
    @GetMapping("/new")
    public ModelAndView newContactForm() {
        return new ModelAndView("contact-form").addObject(new ContactForm());
    }

    @PostMapping("/new")
    public ModelAndView handleNewContact(@ModelAttribute ContactForm contactForm) {

        return new ModelAndView("contact-detail").addObject("contact", contactForm); 

        // necessita pattern PRG
    }

    /* 
    @GetMapping(params = "id")
    public ModelAndView showContact(@RequestParam("id") int contactId) {


    }
    */

}
