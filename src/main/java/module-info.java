module com.example.temp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.temp to javafx.fxml;
    exports com.example.temp;
}