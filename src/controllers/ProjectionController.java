package controllers;

import com.jfoenix.controls.JFXListView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import model.Student;
import model.Subject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProjectionController implements Initializable {

    @FXML
    private JFXListView<AnchorPane> listViewProjection;

    @FXML
    private JFXListView<AnchorPane> listViewSubjects;

    private StackPane stackPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addCardSubjects();
    }

    public ProjectionController(JFXListView<AnchorPane> listViewSubjects, StackPane stackPane) {
        this.listViewSubjects = listViewSubjects;
        this.stackPane = stackPane;
    }

    public void buildCardSubject(Subject subject) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/components/cardSubjectProjection.fxml"));
        loader.setController(new CardSubjectProjectionController(subject, listViewSubjects, stackPane));
        try {
            listViewProjection.getItems().add(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addCardSubjects() {
        Student.getProjection().values().forEach(this::buildCardSubject);
    }
}