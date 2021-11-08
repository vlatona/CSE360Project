import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class Prototype extends Application {

	private TabPane tPane;
	private StackPane rootPane;
	private Prototype_LogInPane logInPane;
	private Create_Account createAccountPane;

	@Override
	public void start(Stage stage) {
		// TODO Auto-generated method stub

		rootPane = new StackPane();

		Create_Account createAccountPane = new Create_Account();

		Prototype_LogInPane logInPane = new Prototype_LogInPane();

		Tab tab1 = new Tab();
		tab1.setText("Create Account");
		tab1.setContent(createAccountPane);

		Tab tab2 = new Tab();
		tab2.setText("Log In");
		tab2.setContent(logInPane);

		// Tab tab3 = new Tab();
		// tab3.setText("Patient List");

		tPane.getSelectionModel().select(0);
		tPane.getTabs().addAll(tab1, tab2);

		rootPane.getChildren().add(tPane);

		Scene scene = new Scene(rootPane, 900, 700);
		stage.setTitle("Portal Log In");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
