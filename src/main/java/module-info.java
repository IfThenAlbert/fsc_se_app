module com.example.fsc_se_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fsc_se_app to javafx.fxml;
    exports com.example.fsc_se_app;
}