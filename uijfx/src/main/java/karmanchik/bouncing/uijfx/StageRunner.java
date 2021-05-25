package karmanchik.bouncing.uijfx;

import javafx.scene.image.Image;
import javafx.stage.Stage;
import karmanchik.bouncing.uijfx.JavaFXApplication.StageReadyEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Log4j2
@Component
public class StageRunner implements ApplicationListener<StageReadyEvent> {
    private final ApplicationContext context;
    private static SceneNavigate navigate;
    private final Resource resource;
    private final String appTitle;

    public StageRunner(ApplicationContext context,
                       @Value("classpath:/fxml/main.fxml") Resource resource,
                       @Value("${spring.application.name}") String appTitle) {
        this.context = context;
        this.resource = resource;
        this.appTitle = appTitle;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent stageReadyEvent) {
        try {
            Stage stage = stageReadyEvent.getStage();
            navigate = new SceneNavigate(stage, context);
            run(stage);
            getNavigate().load(resource).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void run(Stage stage) throws FileNotFoundException {
        stage.setTitle(appTitle);
        stage.getIcons().add(new Image(new FileInputStream(Global.FILE_ICON)));
        stage.show();
    }

    public static SceneNavigate getNavigate() {
        return navigate;
    }
}
