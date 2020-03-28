package Acervo;

import Dominio.Musica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcervoMusical {
    private static final List<Musica> musicas = new ArrayList<>();
    private static int contador = 1;

    public void cadastrarMusica(Musica musica) {
        boolean exists = false;

        for (Musica musicaLista : musicas) {
            if (musicaLista.getNomeDaMusica().equals(musica.getNomeDaMusica())) {
                exists = true;
                break;
            }
        }
        if (exists == true) {
            System.out.print("Música existente");
        } else {
            if (LocalDate.now().isBefore(musica.getLancamento()) == true) {
                System.out.print("Data de lançamento incorreta");

                return;
            }
            if (musica.getNomeDaMusica() == "") {

                System.out.println("Nome da música deve ser preenchido");
                return;

            }
            if (musica.getArtista() == "") {

                System.out.println("Nome do artista deve ser preenchido");
                return;
            }
            if (musica.getLancamento() == null) {

                System.out.println("Data de lançamento deve ser preenchida");
                return;
            }
            if (musica.getEstiloDaMusica() == null) {

                System.out.println("Estilo de música deve ser preenchido");

                return;
            }
        }
        musica.setNumeroDeRegistro(contador++);
        this.musicas.add(musica);

        System.out.print("Sua música foi salva");
    }


    public Musica buscarPorNome(String nomeDaMusica) {
        for (Musica musicaLista : musicas) {
            if (musicaLista.getNomeDaMusica() == nomeDaMusica) {
                return musicaLista;
            }
        }

        System.out.print("Música não encontrada");

        return null;
    }

    public boolean artistaExiste(String nomeArtista) {
        for (Musica musicaLista : musicas) {
            if (musicaLista.getArtista() == nomeArtista) {
                return true;
            }
        }
        System.out.print("Artista não encontrado");
        return false;
    }

    public void listarMusicas() {
        for (Musica musicaLista : musicas) {
            System.out.println(musicaLista.getNomeDaMusica());
        }
    }

    public boolean deletar(String nomeMusica) {
        Musica musica = buscarPorNome(nomeMusica);
        if (musica != null) {
            musicas.remove(musica);

            System.out.println("Música deletada");

            return true;
        }

        System.out.println("Música não encontrada");

        return false;
    }

    public boolean editar(String nomeMusica, String novoNomeMusica) {
        Musica musica = buscarPorNome(nomeMusica);
        if (musica != null) {
            musica.setNomeDaMusica(novoNomeMusica);

            System.out.println("Editado com sucesso");

            return true;

        }

        return false;

    }
}

