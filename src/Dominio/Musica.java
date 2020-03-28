package Dominio;

import java.time.LocalDate;

public class Musica {
    private int numeroDeRegistro;
    private String nomeDaMusica;
    private String artista;
    private LocalDate lancamento;
    private EstiloMusical estiloDaMusica;

    public Musica(int numeroDeRegistro, String nomeDaMusica, String artista, LocalDate lancamento, EstiloMusical estiloDaMusica) {
        this.nomeDaMusica = nomeDaMusica;
        this.artista = artista;
        this.estiloDaMusica = estiloDaMusica;
        this.lancamento = lancamento;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public void setNumeroDeRegistro(final int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getNomeDaMusica() {
        return nomeDaMusica;
    }

    public void setNomeDaMusica(String nome) {
        this.nomeDaMusica = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public EstiloMusical getEstiloDaMusica() {
        return estiloDaMusica;
    }

    @Override
    public String toString() {
        return "Música{" +
                "numeroDeRegistro: " + numeroDeRegistro +
                "nomeDaMusica: " + nomeDaMusica +
                "artista: " + artista +
                "lancamento: " + lancamento +
                "estilosMusicais: " + estiloDaMusica;

    }
}
