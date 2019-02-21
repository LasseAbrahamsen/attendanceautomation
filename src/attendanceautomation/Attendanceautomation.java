package attendanceautomation;

import attendanceautomation.gui.controller.AttendanceController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Attendanceautomation extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/attendanceautomation/gui/view/Attendance.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        //AttendanceController controller = fxmlLoader.getController();
        //root = FXMLLoader.load(getClass().getResource("/attendanceautomation/gui/view/Attendance.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
