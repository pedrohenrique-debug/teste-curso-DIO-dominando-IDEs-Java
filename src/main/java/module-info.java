module com.example.primeiroprojetointellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeiroprojetointellij to javafx.fxml;
    exports com.example.primeiroprojetointellij;
}