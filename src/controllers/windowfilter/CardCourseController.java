package controllers.windowfilter;

import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXToggleButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CardCourseController implements Initializable {

    @FXML
    private Label lblCoursesAvailable;
    @FXML
    private Label lblNRC;
    @FXML
    private JFXListView<AnchorPane> listViewSchedules;
    @FXML
    private JFXToggleButton toggleButtonEnable;

    private String nrc;
    private boolean enableToggleButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setNRC(nrc);
        setEnableToggleButton(enableToggleButton);
    }

    public CardCourseController(String nrc, boolean enableToggleButton) {
        this.nrc = nrc;
        this.enableToggleButton = enableToggleButton;
    }

    public void setNRC(String nrc) {
        lblNRC.setText(nrc);
    }

    public void setEnableToggleButton(boolean enableToggleButton) {
        toggleButtonEnable.setSelected(enableToggleButton);
    }

}
