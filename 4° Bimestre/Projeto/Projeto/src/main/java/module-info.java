module gaeeds.projeto {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    opens gaeeds.projeto to javafx.fxml;
    exports gaeeds.projeto;
}