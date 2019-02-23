package attendanceautomation.gui.controller;

import attendanceautomation.be.Student;
import attendanceautomation.gui.model.Errorbox;
import attendanceautomation.gui.model.StudentModel;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AttendanceController implements Initializable {
    
    @FXML private AnchorPane pane;
    @FXML private VBox hest;
    @FXML private VBox ged;
    @FXML private VBox æsel;
    @FXML private VBox enhjørning;
    @FXML private Label labelTime;
    @FXML private TableView<Student> tableviewStudents;
    @FXML private TableColumn<Student, String> colStudent;
    
    int i;
    StudentModel smodel = new StudentModel();
    @FXML
    private Button buttonFinish;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //test gui..
        smodel.createStudent("a");
        smodel.createStudent("b");
        smodel.createStudent("c");
        smodel.createStudent("d");
        smodel.createStudent("e");
        smodel.createStudent("f");
        smodel.createStudent("g");
        smodel.createStudent("h");
        smodel.createStudent("i");
        smodel.createStudent("j");
        smodel.createStudent("k");
        smodel.createStudent("l");
        smodel.createStudent("m");
        smodel.createStudent("n");
        smodel.createStudent("o");
        smodel.createStudent("p");
        smodel.createStudent("q");
        smodel.createStudent("r");
        smodel.createStudent("s");
        smodel.createStudent("t");
        smodel.createStudent("u");
        smodel.createStudent("v");
        smodel.createStudent("w");
        smodel.createStudent("x");
        smodel.createStudent("y");
        smodel.createStudent("z");
        smodel.createStudent("Lasse");
        
        Student lasse = smodel.getStudent("Lasse");
        lasse.addNonAttendedDate(new Date(119, 1, 1));
        lasse.addNonAttendedDate(new Date(119, 1, 2));
        lasse.addNonAttendedDate(new Date(119, 1, 3));
        lasse.addNonAttendedDate(new Date(119, 1, 4));
        lasse.addNonAttendedDate(new Date(119, 1, 5));
        lasse.addNonAttendedDate(new Date(119, 1, 6));
        lasse.addNonAttendedDate(new Date(119, 1, 7));
        lasse.addNonAttendedDate(new Date(119, 1, 8));
        lasse.addNonAttendedDate(new Date(119, 1, 9));
        lasse.addNonAttendedDate(new Date(119, 1, 10));
        lasse.addNonAttendedDate(new Date(119, 1, 23));
        
        System.out.println(smodel.getAllStudents().size());
        generateButtons();
        
        colStudent.setCellValueFactory(new PropertyValueFactory("name"));
        Date now = new Date();
        labelTime.setText(String.valueOf(now.getYear() + 1900) + "/" + String.valueOf(now.getMonth() + 1) + "/" + String.valueOf(now.getDate()));
        
        reloadTable();
    }
    
    private void reloadTable() {
        if(smodel.getAllStudents() != null) {
            tableviewStudents.setItems(smodel.getAllStudents());
        }
    }

    @FXML
    private void seeOverview(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/attendanceautomation/gui/view/Overview.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        OverviewController controller = fxmlLoader.getController();
        controller.setStudentModel(smodel);
        Scene scene = new Scene(root);
        Stage stage = (Stage) new Stage();
        stage.setScene(scene);
        stage.setTitle("Overview of all students");
        stage.show();
        
        controller.reload();
    }
    
     @FXML
    private void moreInfo(ActionEvent event) throws IOException {
        Student selectedStudent = tableviewStudents.getSelectionModel().getSelectedItem();
        if (selectedStudent == null) {
            Errorbox.displayError("You must select a student to see information");
        } else {
            showStudentInfo(selectedStudent);
        }
    }
    
    private void showStudentInfo(Student student) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/attendanceautomation/gui/view/MoreInfo.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        MoreInfoController controller = fxmlLoader.getController();
        controller.setAllInfo(student);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("More info on student");
        stage.showAndWait();

        reloadTable();
    }
    
    private void addVBoxButtons(VBox box, int startIndex, boolean odd) {
        EventHandler<ActionEvent> onButtonClick = e -> {
            Button thisButton = ((Button)e.getSource());
            thisButton.setText("Student " + ((Student)thisButton.getUserData()).getName() + " has attended.");
            thisButton.disableProperty().set(true);
        };
        int endIndex = startIndex + 15;
        if (smodel.getAllStudents().size() > 0) {
            for (i = startIndex; i < smodel.getAllStudents().size(); i++) {
                if (i < endIndex) {
                    Button button = new Button("Student: " + smodel.getAllStudents().get(i));
                    box.getChildren().add(button);
                    Student student = smodel.getAllStudents().get(i);
                    button.setUserData(student);
                    button.setOnAction(onButtonClick);
                }
            }
        }
        if(odd) {
            box.setStyle(box.getStyle()+"-fx-background-color:rgb(235,177,64)");
        }
        else {
            box.setStyle(box.getStyle()+"-fx-background-color:rgb(0,176,235)");
        }
    }
    public void generateButtons() {
        addVBoxButtons(hest, 0, true);
        addVBoxButtons(ged, 15, false);
        addVBoxButtons(æsel, 30, true);
        addVBoxButtons(enhjørning, 45, false);
    }
    
    @FXML
    public void finishAttendanceCheck(ActionEvent event) throws IOException {
        ArrayList<VBox> buttonBoxes = new ArrayList<>();
        buttonBoxes.add(hest);
        buttonBoxes.add(ged);
        buttonBoxes.add(æsel);        
        buttonBoxes.add(enhjørning);
        for (VBox box : buttonBoxes) {
            for (Node node : box.getChildren()) {
                if(!(node instanceof Button)) {
                    continue;
                }
                
                Button b = (Button)node;
                Student s = (Student)b.getUserData();
                if(!b.isDisable()) {
                    Date now = new Date();
                    s.addNonAttendedDate(new Date(now.getYear(), now.getMonth(), now.getDate()));
                }
                
                b.disableProperty().set(false);
                b.setText("Student Info: " + s.getName());
                b.setOnAction(e -> {
                    try {
                        showStudentInfo((Student)((Button)e.getSource()).getUserData());
                    }
                    catch(IOException ex) {
                        
                    }
                });
            }
        }
        buttonFinish.disableProperty().set(true);
    }
    
}
