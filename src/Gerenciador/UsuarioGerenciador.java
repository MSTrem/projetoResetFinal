package Gerenciador;

import Dominio.Musica;
import Dominio.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsuarioGerenciador {
    private final List<Usuario> usuarios = new ArrayList<>();
    private static int contador = 1;


    public void cadastrarUsuario(Usuario usuario) {
        boolean exists = false;

        for (Usuario usuarioLista : usuarios) {
            if (usuarioLista.getEmail() == usuario.getEmail()) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Usuário já cadastrado");
        } else {
            if (LocalDate.now().getYear() - usuario.getDataDeNascimento().getYear() < 18) {
                System.out.println("Usuário deve ter maioridade para ser cadastrado");

                return;
            }

            usuario.setId(contador++);
            usuarios.add(usuario);

            System.out.println("Usuário cadastrado com sucesso");

            if (usuario.getNomeDoUsuario() == "") {

                System.out.println("Nome do usuário deve ser informado");

                return;
            }

            if (usuario.getDataDeNascimento() == null) {

                System.out.println("Data de nascimento deve ser informada");

                return;
            }

            if (usuario.getNumeroDeTelefone() == "") {

                System.out.println("Nome do usuário deve ser informado");

                return;
            }

            if (usuario.getLatitude() == 0) {

                System.out.println("Latitude deve ser informada");

                return;
            }

            if (usuario.getLongitude() == 0) {

                System.out.println("Longitude deve ser informada");

                return;
            }
        }
    }

    public void listarUsuarios() {
        for (Usuario usuarioLista : usuarios) {
            System.out.println(usuarioLista.getNomeDoUsuario());
        }
    }

    public Usuario pesquisarUsuarioPorNome(String nomeDoUsuario) {
        for (Usuario usuarioLista : usuarios) {
            if (usuarioLista.getNomeDoUsuario() == nomeDoUsuario) {
                return usuarioLista;
            }
        }

        System.out.println("Usuário não encontrado");
        return null;
    }

    public Usuario pesquisarUsuarioPorId(int id) {
        for (Usuario usuarioLista : usuarios) {
            if (usuarioLista.getId() == id) {
                return usuarioLista;
            }
        }
        System.out.println("Usuário não encontrado");

        return null;
    }

    public boolean deletarUsuario(String nomeDoUsuario) {
        Usuario usuario = pesquisarUsuarioPorNome(nomeDoUsuario);
        if (usuario != null) {
            usuarios.remove(usuario);

            System.out.println("Usuário deletado");

            return true;
        }

        System.out.println("Usuário não encontrado");

        return false;
    }

    public boolean deletarUsuario(int idUsuario) {
        Usuario usuario = pesquisarUsuarioPorId(idUsuario);
        if (usuario != null) {
            usuarios.remove(usuario);

            System.out.println("Usuário deletado");

            return true;
        }

        System.out.println("Usuário não encontrado");

        return false;
    }

    public boolean editarNomeDeUsuario(String nomeDeUsuario, String novoNomeDeUsuario) {
        Usuario usuario = pesquisarUsuarioPorNome(nomeDeUsuario);
        if (usuario != null) {
            usuario.setNomeDoUsuario(novoNomeDeUsuario);

            System.out.println("Nome de usuário alterado com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarNomeDeUsuario(int idUsuario, String novoNomeDeUsuario) {
        Usuario usuario = pesquisarUsuarioPorId(idUsuario);
        if (usuario != null) {
            usuario.setNomeDoUsuario(novoNomeDeUsuario);

            System.out.println("Nome de usuário alterado com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarIdUsuario(int idUsuario, int novoIdUsuario) {
        Usuario usuario = pesquisarUsuarioPorId(idUsuario);
        if (usuario != null) {
            usuario.setId(novoIdUsuario);

            System.out.println("Nome de usuário alterado com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarIdUsuario(String nomeDoUsuario, int novoIdUsuario) {
        Usuario usuario = pesquisarUsuarioPorNome(nomeDoUsuario);
        if (usuario != null) {
            usuario.setId(novoIdUsuario);

            System.out.println("Nome de usuário alterado com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarEmailDeUsuario(String nomeDoUsuario, String novoEmail) {
        Usuario usuario = pesquisarUsuarioPorNome(nomeDoUsuario);
        if (usuario != null) {
            usuario.setEmail(novoEmail);

            System.out.println("Email alterado com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarEmailDeUsuario(int idUsuario, String novoEmail) {
        Usuario usuario = pesquisarUsuarioPorId(idUsuario);
        if (usuario != null) {
            usuario.setEmail(novoEmail);

            System.out.println("Email alterado com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarNumeroTelefone(String numeroTelefone, String novoNumeroTelefone) {
        Usuario usuario = pesquisarUsuarioPorNome(numeroTelefone);
        if (usuario != null) {
            usuario.setNumeroDeTelefone(novoNumeroTelefone);

            System.out.println("Número de telefone alterado com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarNumeroTelefone(int id, String novoNumeroTelefone) {
        Usuario usuario = pesquisarUsuarioPorId(id);
        if (usuario != null) {
            usuario.setNumeroDeTelefone(novoNumeroTelefone);

            System.out.println("Número de telefone alterado com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarDataNascimento(String nomeDoUsuario, LocalDate novaDataNascimento) {
        Usuario usuario = pesquisarUsuarioPorNome(nomeDoUsuario);
        if (usuario != null) {
            usuario.setDataDeNascimento(novaDataNascimento);

            System.out.println("Data de nascimento alterada com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarDataNascimento(int id, LocalDate novaDataNascimento) {
        Usuario usuario = pesquisarUsuarioPorId(id);
        if (usuario != null) {
            usuario.setDataDeNascimento(novaDataNascimento);

            System.out.println("Data de nascimento alterada com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarBio(int id, String novaBio) {
        Usuario usuario = pesquisarUsuarioPorId(id);
        if (usuario != null) {
            usuario.setBio(novaBio);

            System.out.println("Bio alterada com sucesso");

            return true;
        }

        return false;
    }

    public boolean editarBio(String nomeDeUsuario, String novaBio) {
        Usuario usuario = pesquisarUsuarioPorNome(nomeDeUsuario);
        if (usuario != null) {
            usuario.setBio(novaBio);

            System.out.println("Bio alterada com sucesso");

            return true;
        }

        return false;
    }
}

