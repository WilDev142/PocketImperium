module com.example.pimperium {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.desktop;

    opens pimperium to javafx.fxml;
    exports pimperium; // Replace with your actual package name
}