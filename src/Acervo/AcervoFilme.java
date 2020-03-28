package Acervo;

import Dominio.Filme;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcervoFilme {

    private static final List<Filme> filmes = new ArrayList<>();
    private static int contador = 1;

    public void cadastrarFilme(Filme filme) {
        boolean exists = false;
        for (Filme filmeLista : filmes) {
            if (filmeLista.getNomeFilme().equals(filme.getNomeFilme())) {
                exists = true;
                break;
            }
            if (exists = true) {
                System.out.println("Filme já cadastrado");
            } else {
                if (LocalDate.now().isBefore(filme.getDataLancamento()) == true) {
                    System.out.println("A data de lançamento não pode ser futura");

                    return;
                }
                if (filme.getNomeFilme().equals("")) {

                    System.out.println("Nome do filme precisa ser informado");
                    return;
                }
                if (filme.getDiretor().equals("")) {

                    System.out.println("Nome do diretor precisa ser informado");
                    return;
                }
                if (filme.getSinopse().equals("")) {

                    System.out.println("Sinopse precisa ser informado");
                    return;
                }

                System.out.println("Categoria precisa ser informado");
                return;
            }
            if (filme.getDataLancamento() == null) {

                System.out.println("Nome do diretor precisa ser informado");
                return;
            }
        }
    }
}

