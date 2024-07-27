module CreateInvoice {
	requires javafx.controls;
	requires gson;
	requires java.sql;
	requires javafx.fxml;
	requires kernel;
	requires layout;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}
