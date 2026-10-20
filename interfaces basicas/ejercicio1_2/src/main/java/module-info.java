module com.mycompany.proyectosChristian {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyectosChristian to javafx.fxml;
    exports com.mycompany.proyectosChristian;
}
