package attendanceautomation;

import attendanceautomation.gui.model.StudentModel;
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
    StudentModel smodel = new StudentModel();
    
    @Override
    public void start(Stage stage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("/attendanceautomation/gui/view/Attendance.fxml"));
        //test gui..
        smodel.createStudent("Lasse", 55.0);
        smodel.createStudent("a", i);
        smodel.createStudent("b", i);
        smodel.createStudent("c", i);
        smodel.createStudent("d", i);
        smodel.createStudent("e", i);
        smodel.createStudent("f", i);
        smodel.createStudent("g", i);
        smodel.createStudent("h", i);
        smodel.createStudent("i", i);
        smodel.createStudent("j", i);
        smodel.createStudent("k", i);
        smodel.createStudent("l", i);
        smodel.createStudent("m", i);
        smodel.createStudent("n", i);
        smodel.createStudent("o", i);
        smodel.createStudent("p", i);
        smodel.createStudent("q", i);
        smodel.createStudent("r", i);
        smodel.createStudent("s", i);
        smodel.createStudent("t", i);
        smodel.createStudent("u", i);
        smodel.createStudent("v", i);
        smodel.createStudent("w", i);
        smodel.createStudent("x", i);
        smodel.createStudent("y", i);
        smodel.createStudent("z", i);
        smodel.createStudent("a1", i);
        smodel.createStudent("b1", i);
        smodel.createStudent("c1", i);
        smodel.createStudent("d1", i);
        smodel.createStudent("e1", i);
        smodel.createStudent("f1", i);
        smodel.createStudent("g1", i);
        smodel.createStudent("h1", i);
        smodel.createStudent("i1", i);
        smodel.createStudent("j1", i);
        smodel.createStudent("k1", i);
        smodel.createStudent("l1", i);
        smodel.createStudent("m1", i);
        smodel.createStudent("n1", i);
        smodel.createStudent("o1", i);
        smodel.createStudent("p1", i);
        smodel.createStudent("q1", i);
        smodel.createStudent("r1", i);
        smodel.createStudent("s1", i);
        smodel.createStudent("t1", i);
        smodel.createStudent("u1", i);
        smodel.createStudent("v1", i);
        smodel.createStudent("w1", i);
        smodel.createStudent("x1", i);
        smodel.createStudent("y1", i);
        smodel.createStudent("z1", i);
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
        System.out.println(smodel.getAllStudents().size());
        for (Node node : root.getChildren()) {
            if (node.getId() != null) {
                if(node.getId().equals("hest")) {
                    if (smodel.getAllStudents().size() > 0) {
                        for (i = 0; i < smodel.getAllStudents().size(); i++) {
                            if (i < 15) {
                                Button button = new Button("student: " + smodel.getAllStudents().get(i));
                                ((VBox) node).getChildren().add(button);
                                button.setOnAction(e->{
                                    ((Button)e.getSource()).setText("Fingerprint scan complete.");
                                });
                            }
                        }
                    node.setStyle(node.getStyle()+"-fx-background-color:rgb(235,177,64)");
                    }
                }
                if(node.getId().equals("ged"))  {
                    if (smodel.getAllStudents().size() > 15) {
                        for (i = 15; i < smodel.getAllStudents().size(); i++) {
                            if (i < 30) {
                                Button button = new Button("student: " + smodel.getAllStudents().get(i));
                                ((VBox) node).getChildren().add(button);
                                button.setOnAction(e->{
                                    ((Button)e.getSource()).setText("Fingerprint scan complete.");
                                });
                            }
                        }
                    node.setStyle(node.getStyle()+"-fx-background-color:rgb(0,176,235)");
                    }
                }
                if(node.getId().equals("æsel"))  {
                    if (smodel.getAllStudents().size() > 30) {
                        for (i = 30; i < smodel.getAllStudents().size(); i++) {
                            if (i < 45) {
                                Button button = new Button("student: " + smodel.getAllStudents().get(i));
                                ((VBox) node).getChildren().add(button);
                                button.setOnAction(e->{
                                    ((Button)e.getSource()).setText("Fingerprint scan complete.");
                                });
                            }
                        }
                    node.setStyle(node.getStyle()+"-fx-background-color:rgb(235,177,64)");
                    }
                }
                if(node.getId().equals("enhjørning"))  {
                    if (smodel.getAllStudents().size() > 45) {
                        for (i = 45; i < smodel.getAllStudents().size(); i++) {
                            if (i < 60) {
                                Button button = new Button("student: " + smodel.getAllStudents().get(i));
                                ((VBox) node).getChildren().add(button);
                                button.setOnAction(e->{
                                    ((Button)e.getSource()).setText("Fingerprint scan complete.");
                                });
                            }
                        }
                    node.setStyle(node.getStyle()+"-fx-background-color:rgb(0,176,235)");
                    }
                }
            }
        }
    }
    
}
