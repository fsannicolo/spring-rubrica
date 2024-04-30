package it.marconi.springrubrica.domains;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactForm {
    
    @NotEmpty
    @Size(max = 30)
    private String name;

    @NotEmpty
    @Size(max = 50)
    private String surname;

    @NotEmpty
    @Pattern(regexp = "([0-9]{10})") // regular expression per un numero da 10 cifre
    private String phone;

    //@Pattern(regexp="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
    @Email
    private String email;

    
}
