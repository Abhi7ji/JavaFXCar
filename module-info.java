module com.example.carlotapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.carlotapp to javafx.fxml;
    exports com.example.carlotapp;
}
