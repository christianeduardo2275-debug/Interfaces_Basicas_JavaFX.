module com.mycompany.ProyectosCris {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ProyectosCris to javafx.fxml;
    exports com.mycompany.ProyectosCris;
}
