/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */
package com.gaol.learn.demo02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/03/28
 * @copyright Copyright (c) 2010 Company: CODECENTER OF AVIC
 */
public class JavaFx01 extends Application {

    @Override
    public void start(Stage stage) {
        VBox box = new VBox();
        final Scene scene = new Scene(box, 300, 250);
        scene.setFill(null);

        Line line = new Line();
        line.setStartX(0.0f);
        line.setStartY(0.0f);
        line.setEndX(100.0f);
        line.setEndY(100.0f);

        box.getChildren().add(line);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}