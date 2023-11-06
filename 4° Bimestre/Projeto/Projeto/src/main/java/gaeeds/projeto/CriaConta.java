package gaeeds.projeto;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
    public class CriaConta {

        @FXML
        public Button criaUsuario;

        @FXML
        public TextField nicknameUsuario;

        @FXML
        public TextField nomeUsuario;

        @FXML
        public PasswordField senha;

        @FXML
        public PasswordField confirmar;

        public void onCriarUsuario() {
            boolean senhaValidada  = confirmar.getText().equals(senha.getText());

            if(!senhaValidada) {
                return;
            }


            String nicknameBdd = nicknameUsuario.getText();

            String usuarioBdd = nomeUsuario.getText();

            String senhaBdd = senha.getText();


            Usuario teste = new Usuario(nicknameBdd, usuarioBdd, senhaBdd);
            System.out.println("deu certo!");
        }
    }
