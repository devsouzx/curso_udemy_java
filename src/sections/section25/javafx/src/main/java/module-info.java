module com.devsouzx.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.devsouzx.javafx to javafx.fxml;
    exports com.devsouzx.javafx;
    exports com.devsouzx.javafx.utils;
    opens com.devsouzx.javafx.utils to javafx.fxml;
}