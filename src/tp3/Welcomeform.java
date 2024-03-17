package tp3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Welcomeform  extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JavaFX Welcome");
		primaryStage.show();
		GridPane gp=new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(25,25,25,25));
		Scene scene = new Scene(gp, 300, 275, Color.WHITE);
		primaryStage.setScene(scene);
		
		
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		gp.add(scenetitle, 0, 0, 2, 1);
		
		Label userName = new Label("UserName:");
		gp.add(userName, 0, 1);
		
		TextField userTextField = new TextField();
		gp.add(userTextField, 1, 1);
		
		Label pw = new Label("password :");
		gp.add(pw, 0, 2);
		
		PasswordField pwBox = new PasswordField();
		gp.add(pwBox, 1, 2);
		
		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		gp.add(hbBtn, 1, 4);
		
		Text actiontarget = new Text();
		gp.add(actiontarget, 1, 6);
		
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
			actiontarget.setFill(Color.FIREBRICK);
			if(pwBox.getText().equals("123"))
			{
				actiontarget.setFill(Color.GREEN);
				actiontarget.setText("okk !!!!");
			}
			else
			{
				actiontarget.setFill(Color.RED);
				actiontarget.setText("mots de passe incorrect");
			}
			}});
		
		
		Button btn1 = new Button("Exit");
		HBox hbBtn1 = new HBox(10);
		hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn1.getChildren().add(btn1);
		gp.add(hbBtn1, 0, 4);
		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
			Platform.exit();
			}
			});
	}
	public static void main(String[] args) {
		launch(args);
	}
}
