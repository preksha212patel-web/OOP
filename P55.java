import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class P55 extends Application {
	 public void start(Stage stage) {
 		System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		VBox projectBox = createBar("Projects — 20%", 20, Color.RED);
 		VBox quizBox = createBar("Quizzes — 10%", 10, Color.BLUE);
 		VBox midtermBox = createBar("Midterm — 30%", 30, Color.GREEN);
 		VBox finalBox = createBar("Final — 40%", 40, Color.ORANGE);
 		HBox root = new HBox(20, projectBox, quizBox, midtermBox, finalBox);
 		root.setAlignment(Pos.BOTTOM_CENTER);
 		Scene scene = new Scene(root, 500, 300);
 		stage.setTitle("Grade Distribution");
 		stage.setScene(scene);
 		stage.show();
 	}
 	VBox createBar(String text, int percent, Color color) {
		Rectangle bar = new Rectangle(60, percent * 4);
 		bar.setFill(color);
 		Label label = new Label(text);
 		VBox box = new VBox(5, bar, label);
 		box.setAlignment(Pos.BOTTOM_CENTER);
 		return box;
 	}
	public static void main(String[] args) {
		launch(args);
 	}
}