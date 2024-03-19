module com.example.innovatixjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.innovatixjava to javafx.fxml;
    exports com.example.innovatixjava;
}