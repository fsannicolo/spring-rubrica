package it.marconi.springrubrica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import it.marconi.springrubrica.domains.Contact;

public interface ContactRepository extends JpaRepository<Contact, UUID>{
    
}
