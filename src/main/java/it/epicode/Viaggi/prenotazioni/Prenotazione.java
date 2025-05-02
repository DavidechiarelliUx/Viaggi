package it.epicode.Viaggi.prenotazioni;

import it.epicode.Viaggi.viaggi.Viaggio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione {

    private Long id;
    private String nomeCliente;
    private Viaggio viaggio;

}
