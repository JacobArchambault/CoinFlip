package com.jacobarchambault.coinflip;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Create the ImageView control.
		Coin coinImage = new Coin(new Image("file:Heads1.png"), new Image("file:Tails1.png"), new Random());
		coinImage.setFitWidth(150);
		coinImage.setFitHeight(150);
		coinImage.setPreserveRatio(true);
		// Create the tossButton control.
		Button tossButton = new Button("Toss");
		// Register the event handler.
		tossButton.setOnAction(e -> coinImage.flip());
		// Put everything into a VBox
		VBox mainVBox = new VBox(10, coinImage, tossButton);
		mainVBox.setAlignment(Pos.CENTER);
		mainVBox.setPadding(new Insets(10));
		// Add the main VBox to a scene.
		// Set the scene to the stage and display it.
		primaryStage.setScene(new Scene(mainVBox));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}