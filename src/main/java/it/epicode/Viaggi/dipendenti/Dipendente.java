package it.epicode.Viaggi.dipendenti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dipendente {

    private String nome;
    private String cognome;
    private String email;
    private String ruolo;
}
