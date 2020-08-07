module com.mycompany.examen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    
    opens com.mycompany.examen to javafx.fxml;
    exports com.mycompany.examen;
    
}
