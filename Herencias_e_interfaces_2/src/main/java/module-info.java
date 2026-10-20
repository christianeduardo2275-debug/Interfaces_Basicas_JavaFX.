module com.mycompany.proyectos_chris {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyectos_chris to javafx.fxml;
    exports com.mycompany.proyectos_chris;
}
