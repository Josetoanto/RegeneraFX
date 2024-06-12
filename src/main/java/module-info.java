module com.josetoanto.regenerafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.josetoanto.regenerafx to javafx.fxml;
    exports com.josetoanto.regenerafx;
    exports com.josetoanto.regenerafx.controllers;
    opens com.josetoanto.regenerafx.controllers to javafx.fxml;
    exports com.josetoanto.regenerafx.controllers.cuentas;
    opens com.josetoanto.regenerafx.controllers.cuentas to javafx.fxml;
    exports com.josetoanto.regenerafx.controllers.inventario;
    opens com.josetoanto.regenerafx.controllers.inventario to javafx.fxml;
    exports com.josetoanto.regenerafx.controllers.proveedores;
    opens com.josetoanto.regenerafx.controllers.proveedores to javafx.fxml;
    exports com.josetoanto.regenerafx.controllers.ventas;
    opens com.josetoanto.regenerafx.controllers.ventas to javafx.fxml;

}