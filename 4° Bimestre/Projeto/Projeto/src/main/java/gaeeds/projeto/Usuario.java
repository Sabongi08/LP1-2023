package gaeeds.projeto;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column
        private String nickname;

        @Column
        private String nomeUsuario;

        @Column
        private String senha;


        public Usuario(String apelido, String nome_usuario, String senha) {
            super();
            this.nickname = nickname;
            this.nomeUsuario = nomeUsuario;
            this.senha = senha;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNomeUsuario() {
            return nomeUsuario;
        }

        public void setNomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        @Override
        public String toString() {
            return "USUARIO [" + id + "]:" + nickname + ", " + nomeUsuario;
        }
    }