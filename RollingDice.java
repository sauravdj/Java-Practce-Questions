import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RollingDice extends Application{
    public static void main(String[] args) throws Exception { launch(args); }
    @Override
    public void start(final Stage stage) throws Exception {

        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        Button button = new Button("Roll Dice");
        button.setMinWidth(100);
        pane.getChildren().add(button);


        ImageView dice1 = new ImageView();
        pane.getChildren().add(dice1);
        dice1.setFitWidth(100);
        dice1.setFitHeight(100);
        dice1.setVisible(false);


        ImageView dice2 = new ImageView();
        pane.getChildren().add(dice2);
        dice2.setFitWidth(100);
        dice2.setFitHeight(100);
        dice2.setVisible(false);

        
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try{
                    Random rand = new Random();
                    int i = rand.nextInt(6)+1;
                    dice1.setVisible(true);
                    dice1.setImage(new Image("Die"+i+".png"));
                    i = rand.nextInt(6)+1;
                    dice2.setVisible(true);
                    dice2.setImage(new Image("Die"+i+".png"));
                }catch(Exception ex){
                    System.out.println("Error");

                }
            }
        });


        

        Scene scene = new Scene(pane,350,150);
        stage.setTitle("Roll Dice");
        stage.setScene(scene);
        stage.show();
    }
}

 