module com.gaol.learn.demo01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gaol.learn.demo01 to javafx.fxml;
    exports com.gaol.learn.demo01;
}