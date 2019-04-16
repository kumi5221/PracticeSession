package edu.depauw.csc232;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Demo extends Application {
	private Canvas canvas;
	private GraphicsContext g;
	private double currX;
	private double currY;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		canvas = new Canvas(600, 400);
		g = canvas.getGraphicsContext2D();
		
		g.setFill(Color.WHITE);
		g.fillRect(0, 0, 600, 400);
		
		g.setStroke(Color.RED);
//		g.strokeLine(100, 100, 300, 200);
		
		canvas.setOnMousePressed(e -> mousePressed(e));
		canvas.setOnMouseDragged(e -> mouseDragged(e));
		canvas.setOnMouseReleased(e -> mouseReleased(e));
		
		Pane root = new Pane(canvas);
		Scene scene = new Scene(root);
		
		scene.setOnKeyTyped(e -> keyTyped(e));
		
		stage.setScene(scene);
		stage.setTitle("Demo");
		stage.show();
	}

	private void keyTyped(KeyEvent e) {
		switch (e.getCharacter()) {
		case "r":
			g.setStroke(Color.RED);
			break;
		case "g":
			g.setStroke(Color.GREEN);
			break;
		case "b":
			g.setStroke(Color.BLUE);
			break;
		}
	}

	private void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	private void mouseDragged(MouseEvent e) {
		double newX = e.getX();
		double newY = e.getY();
		g.strokeLine(currX, currY, newX, newY);
		currX = newX;
		currY = newY;
	}

	private void mousePressed(MouseEvent e) {
		currX = e.getX();
		currY = e.getY();
	}

}
