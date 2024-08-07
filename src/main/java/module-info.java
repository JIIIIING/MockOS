module com.example.mockos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mockos to javafx.fxml;
    exports com.example.mockos;
}