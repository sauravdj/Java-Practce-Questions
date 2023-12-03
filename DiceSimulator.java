import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
// import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DiceSimulator extends Application {

    // public void start(Stage primaryStage) {
    //     try {
           
    //      //   Scene scene = new Scene(root);
           
    //       //  primaryStage.setScene(scene);
    //         primaryStage.setTitle("JavaFX and Maven");
    //         primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/Die1.png")));
    //         primaryStage.show();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }




    @Override
    public void start(Stage primaryStage) {
        // Create the dice images
        Image[] diceImages = new Image[6];
        // Image img = new Image(getClass().getResourceAsStream("/Die1.png"));
        for (int i = 0; i < 6; i++) {

            diceImages[i] = new Image(getClass().getResourceAsStream("/Die" + (i + 1) + ".png"));
           
        }
    
        // Create the dice image views
        ImageView die1ImageView = new ImageView(diceImages[0]);
        ImageView die2ImageView = new ImageView(diceImages[1]);
        // ImageView die3ImageView = new ImageView(diceImages[2]);
        // ImageView die4ImageView = new ImageView(diceImages[3]);
        // ImageView die5ImageView = new ImageView(diceImages[4]);
        // ImageView die6ImageView = new ImageView(diceImages[5]);

        // Create the roll button
        Button rollButton = new Button("Roll");
        rollButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Generate two random numbers between 1 and 6
                Random random = new Random();
                int die1Value = random.nextInt(6) + 1;
              //  int die2Value = random.nextInt(6) + 1;

                // Update the dice image views
                die1ImageView.setImage(diceImages[die1Value - 1]);
        //        die2ImageView.setImage(diceImages[die2Value - 1]);
            }
        });

        // Create the dice hbox
        HBox diceHBox = new HBox(10, die1ImageView, die2ImageView);

        // Create the root node
        HBox root = new HBox(10, diceHBox, rollButton);

        // Create the scene
        Scene scene = new Scene(root);

        // Set the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dice Simulator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
