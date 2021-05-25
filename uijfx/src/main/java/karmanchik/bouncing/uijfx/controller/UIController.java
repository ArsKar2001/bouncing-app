package karmanchik.bouncing.uijfx.controller;

import javafx.fxml.Initializable;
import javafx.scene.Node;

import java.io.Serializable;

public interface UIController extends Serializable, Initializable {
    Node getNode();
    void setNode(Node node);

    void show();
}
