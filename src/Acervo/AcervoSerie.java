package Acervo;

import Dominio.Serie;
import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcervoSerie {
    private static final List<Serie> series = new ArrayList<>();
    private static int contador = 1;

    public void cadastrarSeries(Serie serie) {
        boolean exists = false;
        for (Serie serieLista : series) {
            if (serieLista.getNomeSerie().equals(serie.getNomeSerie())) {
                exists = true;
                break;
            }
            if (exists == true) {
                System.out.println("Série já cadastrada");
            } else {
                if (LocalDate.now().isBefore(serie.getDataLancamentoSerie()) == true) {
                    System.out.println("Data de lançamento incorreta");
                    return;
                }
            }
        }
    }
}

    /*

•	As categorias aceitas são { drama | comédia | suspense | terror | ação | sitcom }
•	Deve possuir ao menos 1 temporada
•	Deve possuir ao menos 1 episódio por temporada
•	Todos os campos são obrigatórios

     */