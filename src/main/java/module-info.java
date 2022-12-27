module com.dtx.firmafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dtx.firmafx to javafx.fxml;
    exports com.dtx.firmafx;
}