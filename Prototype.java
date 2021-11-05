import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class Prototype extends Application{

	private TabPane tPane;
	private StackPane rootPane;
	private Prototype_LogInPane pane;
	
	@Override
	public void start(Stage stage) {
		// TODO Auto-generated method stub
		
		rootPane = new StackPane();
		
		Prototype_LogInPane pane = new Prototype_LogInPane();		
		
		tPane = new TabPane();
		Tab tab1 = new Tab();
		tab1.setText("Log In");
		tab1.setContent(pane);
		
		Tab tab2 = new Tab();
		tab2.setText("Staff List");
		
		Tab tab3 = new Tab();
		tab3.setText("Patient List");
		
		tPane.getSelectionModel().select(0);
		tPane.getTabs().addAll(tab1, tab2, tab3);
		
		rootPane.getChildren().add(tPane);
		
	    Scene scene = new Scene(rootPane, 600, 500);
		stage.setTitle("Portal Log In");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	

}
