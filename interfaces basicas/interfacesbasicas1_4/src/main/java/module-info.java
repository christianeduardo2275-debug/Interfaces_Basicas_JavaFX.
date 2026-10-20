module com.mycompany.Proyectos_Cris {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.Proyectos_Cris to javafx.fxml;
    exports com.mycompany.Proyectos_Cris;
}
