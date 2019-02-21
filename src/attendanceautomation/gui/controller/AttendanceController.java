package attendanceautomation.gui.controller;

import attendanceautomation.gui.model.StudentModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AttendanceController implements Initializable {
    
    @FXML private VBox hest;
    @FXML private VBox ged;
    @FXML private VBox æsel;
    @FXML private VBox enhjørning;
    
    Pane pane;
    
    int i;
    StudentModel smodel = new StudentModel();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //test gui..
        smodel.createStudent("Lasse", 55.5);
        smodel.createStudent("a", 5.3);
        smodel.createStudent("b", 5.3);
        smodel.createStudent("c", 5.3);
        smodel.createStudent("d", 5.3);
        smodel.createStudent("e", 5.3);
        smodel.createStudent("f", 5.3);
        smodel.createStudent("g", 5.3);
        smodel.createStudent("h", 5.3);
        smodel.createStudent("i", 5.3);
        smodel.createStudent("j", 5.3);
        smodel.createStudent("k", 5.3);
        smodel.createStudent("l", 5.3);
        smodel.createStudent("m", 5.3);
        smodel.createStudent("n", 5.3);
        smodel.createStudent("o", 5.3);
        smodel.createStudent("p", 5.3);
        smodel.createStudent("q", 5.3);
        smodel.createStudent("r", 5.3);
        smodel.createStudent("s", 5.3);
        smodel.createStudent("t", 5.3);
        smodel.createStudent("u", 5.3);
        smodel.createStudent("v", 5.3);
        smodel.createStudent("w", 5.3);
        smodel.createStudent("x", 5.3);
        smodel.createStudent("y", 5.3);
        smodel.createStudent("z", 5.3);
        /*smodel.createStudent("a1", i);
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
        smodel.createStudent("z1", i);*/
        System.out.println(smodel.getAllStudents().size());
        //generateButtons();
    }

    @FXML
    private void seeOverview(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/attendanceautomation/gui/view/Overview.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        OverviewController controller = fxmlLoader.getController();
        controller.reload();
        
        //Parent root = FXMLLoader.load(getClass().getResource("/attendanceautomation/gui/view/Overview.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) new Stage();
        stage.setScene(scene);
        stage.setTitle("Overview of all students");
        stage.show();
    }
    
    @FXML
    private void moreInfo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/attendanceautomation/gui/view/MoreInfo.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) new Stage();
        stage.setScene(scene);
        stage.setTitle("More info on student");
        stage.show();
    }
    
    public void generateButtons() {
        for (Node node : pane.getChildren()) {
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
                    }
                node.setStyle(node.getStyle()+"-fx-background-color:rgb(235,177,64)");
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
                    }
                node.setStyle(node.getStyle()+"-fx-background-color:rgb(0,176,235)");
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
                    }
                node.setStyle(node.getStyle()+"-fx-background-color:rgb(235,177,64)");
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
                    }
                node.setStyle(node.getStyle()+"-fx-background-color:rgb(0,176,235)");
                }
            }
        }
    }
    
}
