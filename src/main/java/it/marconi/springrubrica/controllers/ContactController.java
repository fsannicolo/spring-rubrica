package it.marconi.springrubrica.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.marconi.springrubrica.domains.Contact;
import it.marconi.springrubrica.domains.ContactForm;
import it.marconi.springrubrica.services.ContactService;

@Controller
@RequestMapping("/contacts")
public class ContactController {
    
    @Autowired
    private ContactService contactService;

    @GetMapping("/new")
    public ModelAndView newContactForm() {
        return new ModelAndView("contact-form").addObject(new ContactForm());
    }

    @PostMapping("/new")
    public ModelAndView handleNewContact(@ModelAttribute ContactForm contactForm) {

        Contact contact = contactService.save(contactForm);

        return new ModelAndView("contact-detail").addObject("contact", contact); 


        // necessita pattern PRG
    }

    /* 
    @GetMapping(params = "id")
    public ModelAndView showContact(@RequestParam("id") UUID contactId) {


    }*/
    
    /* 
    @GetMapping(params = "id")
    public ModelAndView showContact(@RequestParam("id") int contactId) {


    }
    */

}
