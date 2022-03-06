import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CalculatorLauncher extends Application {
    public static void main(String[] args){
        System.out.println("Coming soon...");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
   //    FXMLLoader loader = FXMLLoader.load(getClass().getClassLoader().getResource(
    //           "res2.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("res2.fxml"));
        AnchorPane pane = loader.load();
        Scene scene  = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}
