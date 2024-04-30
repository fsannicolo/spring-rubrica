package it.marconi.springrubrica.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marconi.springrubrica.domains.Contact;
import it.marconi.springrubrica.domains.ContactForm;
import it.marconi.springrubrica.repositories.ContactRepository;

@Service
public class ContactService {
    
    @Autowired
    private ContactRepository contactRepo;

    public Contact save(ContactForm contactForm) {

        Contact c = mapContact(contactForm);
        return contactRepo.save(c);
    }

    private Contact mapContact(ContactForm contactForm) {

        Contact c = new Contact();
        c.setName(contactForm.getName());
        c.setSurname(contactForm.getSurname());
        c.setPhone(contactForm.getPhone());
        c.setEmail(contactForm.getEmail());

        return c;
    }

    // un Optional è un contenitore che controlla l'effettiva presenza di un valore non null
    public Optional<Contact> get(UUID id) {
        return contactRepo.findById(id);
    }

    // recupera tutti i contatti dal database
    public List<Contact> findAll() {
        return contactRepo.findAll();
    }

    // elimina un contatto noto il suo id
    public void deleteById(UUID id) {
        contactRepo.deleteById(id); 
    }
}
