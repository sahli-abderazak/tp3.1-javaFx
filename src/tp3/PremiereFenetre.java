package tp3;



import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application {
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 300, 250, Color.WHITE);
		primaryStage.setTitle("Ma première fenêtre");
		primaryStage.setScene(scene);
		primaryStage.show();
		ObservableList<Node> liste = root.getChildren();
		Line l=new Line(100,100,100,100);
		l.setFill(Color.RED);
		root.getChildren().add(l);
		/*
		 * Rectangle r=new Rectangle(50,50,50,50); r.setFill(Color.YELLOW);
		 * root.getChildren().add(r);
		 */
		/*
		 * Circle c= new Circle(100,100,100); c.setFill(Color.BLACK);
		 * root.getChildren().add(c);
		 */

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
