module app.uc4javafxalissonvidal {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.uc4javafxalissonvidal to javafx.fxml;
    exports app.uc4javafxalissonvidal;
}