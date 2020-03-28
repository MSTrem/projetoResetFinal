package Dominio;

import java.time.LocalDate;

public class Serie {
    private int id;
    private String nomeSerie;
    private LocalDate dataLancamentoSerie;
    private int numTemporadas;
    private int numEpisodios;
    private String sinopse;

    public Serie(int id, String nomeSerie, LocalDate dataLancamentoSerie, int numTemporadas, int numEpisodios, String sinopse) {
        this.id = id;
        this.nomeSerie = nomeSerie;
        this.dataLancamentoSerie = dataLancamentoSerie;
        this.numTemporadas = numTemporadas;
        this.numEpisodios = numEpisodios;
        this.sinopse = sinopse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeSerie() {
        return nomeSerie;
    }

    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public LocalDate getDataLancamentoSerie() {
        return dataLancamentoSerie;
    }

    public void setDataLancamentoSerie(LocalDate dataLancamentoSerie) {
        this.dataLancamentoSerie = dataLancamentoSerie;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public int getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
