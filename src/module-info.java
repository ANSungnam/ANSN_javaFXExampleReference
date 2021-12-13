module ANSN_javaFXExampleReference {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;

	opens example.y211213 to javafx.graphics, javafx.fxml;
}