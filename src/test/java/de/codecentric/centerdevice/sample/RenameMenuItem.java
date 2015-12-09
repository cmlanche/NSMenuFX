package de.codecentric.centerdevice.sample;

import de.codecentric.centerdevice.MenuToolkit;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RenameMenuItem extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane root = new StackPane();
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.requestFocus();
		primaryStage.show();

		MenuToolkit tk = MenuToolkit.toolkit();
		Menu defaultAppleMenu = tk.createDefaultApplicationMenu("test");
		tk.setApplicationMenu(defaultAppleMenu);

		defaultAppleMenu.getItems().get(1).setText("Hide all the otters");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
