package Dominio;

import java.time.LocalDate;

public class Filme {
    private int idFilme;
    private String nomeFilme;
    private String diretor;
    private LocalDate dataLancamento;
    private String sinopse;
    private FilmeCategoria categoria;

    public Filme(int idFilme, String nomeFilme, String diretor, LocalDate dataLancamento, String sinopse, FilmeCategoria categoria) {
        this.idFilme = idFilme;
        this.nomeFilme = nomeFilme;
        this.diretor = diretor;
        this.dataLancamento = dataLancamento;
        this.sinopse = sinopse;
        this.categoria = categoria;
    }

    public FilmeCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(FilmeCategoria categoria) {
        this.categoria = categoria;
    }

    public void setIdFilme(final int idFilme) {
        this.idFilme = idFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public FilmeCategoria getfilmeCategoria(FilmeCategoria filmeCategoria) {
        FilmeCategoria filmeCategoria1 = filmeCategoria;
        return filmeCategoria1;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "idFilme=" + idFilme +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", diretor='" + diretor + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}



