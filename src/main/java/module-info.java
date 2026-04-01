module com.example.javafxactivities {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxactivities to javafx.fxml;
    exports com.example.javafxactivities;
}