import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	private static final int PADDING = 10;
	private static final int FIELD_LABEL_WIDTH = 100;

	@Override
	public void start(Stage stage) throws Exception {
		TextField title = new TextField();
		HBox titleField = createField(title, "Title:");

		TextField author = new TextField();
		HBox authorField = createField(author, "Author:");

		TextField publisher = new TextField();
		HBox publisherField = createField(publisher, "Publisher:");

		TextField year = new TextField();
		HBox yearField = createField(year, "Year:");

		VBox fields = new VBox(titleField, authorField, publisherField, yearField);

		Button ok = new Button("OK");
		ok.setOnAction(e -> {
			System.out.println("Author: " + author.getText());
			System.out.println("Title: " + title.getText());
			System.out.println("Publisher: " + publisher.getText());
			System.out.println("Year: " + year.getText());
		});
		
		Button exit = new Button("Exit");
		exit.setOnAction(e -> Platform.exit());
		
		HBox buttons = new HBox(ok, exit);
		buttons.setSpacing(50);
		buttons.setPadding(new Insets(PADDING));
		buttons.setAlignment(Pos.CENTER);

		BorderPane root = new BorderPane();
		root.setCenter(fields);
		root.setBottom(buttons);

		Scene scene = new Scene(root);

		stage.setScene(scene);
		stage.setTitle("Demo 0410");
		stage.show();
	}

	private HBox createField(TextField field, String labelText) {
		Label label = new Label(labelText);
		label.setPrefWidth(FIELD_LABEL_WIDTH);
		HBox result = new HBox(label, field);
		result.setPadding(new Insets(PADDING));
		return result;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
