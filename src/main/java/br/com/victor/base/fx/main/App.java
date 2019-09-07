package br.com.victor.base.fx.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Classe responsável por startar a aplicação
 */
public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

    @Override
    public void start(Stage stage) throws Exception {
		var location = getClass().getResource("/br/com/victor/base/fx/views/main/Principal.fxml");
        var root = (AnchorPane) FXMLLoader.load(location);
        var scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Aprendizado de Máquina");
        stage.show();
    }

}
