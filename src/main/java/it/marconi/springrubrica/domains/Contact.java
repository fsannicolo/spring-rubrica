package it.marconi.springrubrica.domains;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity     // specifico che la classe è entità del database
@Table(name = "contacts")   // associo la classe a una tabella del db
public class Contact {
    
    @Id     // primary key
    @GeneratedValue //generata in automatico
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;
}
