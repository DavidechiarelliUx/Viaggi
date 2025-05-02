package it.epicode.Viaggi.viaggi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Viaggio {

    private LocalDate dataPartenza;
    private LocalDate dataArrivo;
    private String destinazione;
    private String descrizione;
    private int prezzo;

}
