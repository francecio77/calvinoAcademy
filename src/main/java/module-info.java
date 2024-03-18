module com.example.calvinoacademy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calvinoacademy to javafx.fxml;
    exports com.example.calvinoacademy;
}