import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App_Main extends Application {

    public static void main(String[] args) {


        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Main Menu");

        FXMLLoader fxmlLoader = new FXMLLoader(App_Main.class.getResource("resources/com/view/javafx/main-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(),550,400);

        primaryStage.setResizable(true);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
