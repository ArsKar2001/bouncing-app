package karmanchik.bouncing.uijfx.controller;

import javafx.scene.Node;
import karmanchik.bouncing.uijfx.StageRunner;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractUIController implements UIController {
    @Getter
    @Setter
    private Node node;

    public void show() {
        preShow();
        StageRunner.getNavigate().show(this);
        postShow();
    }

    protected abstract void postShow();

    protected abstract void preShow();
}
