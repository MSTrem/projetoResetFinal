package Dominio;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nomeDoUsuario;
    private String email;
    private String numeroDeTelefone;
    private LocalDate dataDeNascimento;
    private String bio;
    private double latitude;
    private double longitude;

    public Usuario(String nomeDoUsuario, String email, String numeroDeTelefone, LocalDate dataDeNascimento, String bio, double latitude, double longitude, String genero) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.bio = bio;
        this.numeroDeTelefone = numeroDeTelefone;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento = dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
