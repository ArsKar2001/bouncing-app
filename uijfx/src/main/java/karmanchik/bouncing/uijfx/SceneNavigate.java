package karmanchik.bouncing.uijfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import karmanchik.bouncing.uijfx.controller.AbstractUIController;
import karmanchik.bouncing.uijfx.controller.UIController;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class SceneNavigate {
    private final ApplicationContext context;
    private final Scene scene;
    private final List<UIController> controllers = new ArrayList<>();

    public SceneNavigate(Stage stage, ApplicationContext context) {
        this.context = context;
        this.scene = new Scene(new Pane());
        stage.setScene(scene);
    }

    public UIController load(Resource resource) {
        try {
            FXMLLoader loader = new FXMLLoader(resource.getURL());
            loader.setControllerFactory(context::getBean);
            Node root = loader.load();
            UIController controller = loader.getController();
            controller.setNode(root);
            return controller;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void goBack() {
        if (controllers.size() > 1) {
            controllers.remove(controllers.size() - 1);
            scene.setRoot((Parent) controllers.get(controllers.size() - 1).getNode());
        }
    }

    public void show(UIController controller) {
        controllers.add(controller);
        scene.setRoot((Parent) controller.getNode());
    }
}
