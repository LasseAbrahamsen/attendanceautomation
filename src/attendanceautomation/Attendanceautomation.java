package attendanceautomation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Attendanceautomation extends Application {
    
    int i;
    Pane root;
    
    @Override
    public void start(Stage stage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("/attendanceautomation/gui/view/Attendance.fxml"));

        generateButtons();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void generateButtons() {
        for (Node node : root.getChildren()) {
            if (node.getId() != null) {
                if(node.getId().equals("hest")) {
                    for (i = 0; i < 11; i++) {
                        Button button = new Button("student: " + i);
                        ((VBox) node).getChildren().add(button);
                        button.setOnAction(e->{
                            ((Button)e.getSource()).setText("Fingerprint scan complete.");
                        });
                    }
                    node.setStyle(node.getStyle()+"-fx-background-color:rgb(235,177,64)");
                }
                if(node.getId().equals("ged"))  {
                    if (i > 10) {
                        for (i = 11; i < 21; i++) {
                            Button button = new Button("student: " + i);
                            ((VBox) node).getChildren().add(button);
                            button.setOnAction(e->{
                                ((Button)e.getSource()).setText("Fingerprint scan complete.");
                            });
                        }
                    node.setStyle(node.getStyle()+"-fx-background-color:rgb(0,176,235)");
                    }
                }
                if(node.getId().equals("æsel"))  {
                    if (i > 20) {
                        for (i = 21; i < 31; i++) {
                            Button button = new Button("student: " + i);
                            ((VBox) node).getChildren().add(button);
                            button.setOnAction(e->{
                                ((Button)e.getSource()).setText("Fingerprint scan complete.");
                            });
                        }
                    node.setStyle(node.getStyle()+"-fx-background-color:rgb(235,177,64)");
                    }
                }
                if(node.getId().equals("enhjørning"))  {
                    if (i > 30) {
                        for (i = 31; i < 41; i++) {
                            Button button = new Button("student: " + i);
                            ((VBox) node).getChildren().add(button);
                            button.setOnAction(e->{
                                ((Button)e.getSource()).setText("Fingerprint scan complete.");
                            });
                        }
                    node.setStyle(node.getStyle()+"-fx-background-color:rgb(0,176,235)");
                    }
                }
            }
        }
    }
    
}
