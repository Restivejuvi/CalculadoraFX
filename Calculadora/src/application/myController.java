package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class myController {

	@FXML
	private TextField num1;

	@FXML
	private TextField num2;

	@FXML
	private TextField result;

	@FXML
	private Button suma;

	@FXML
	private Button resta;

	@FXML
	private Button multiplica;

	@FXML
	private Button divide;

	@FXML
	public void initialize() {
		// TODO (don't really need to do anything here).
	}

	// When user click on myButton this method will be called.
	public void sumar(ActionEvent event) {
		System.out.println("Sumando!");
		Double x = Double.parseDouble(num1.getText());
		Double y = Double.parseDouble(num2.getText());
		Double sumar = x + y;
		result.setText(String.valueOf(sumar));
	}

	public void restar(ActionEvent event) {
		System.out.println("Restando!");
		Double x = Double.parseDouble(num1.getText());
		Double y = Double.parseDouble(num2.getText());
		Double restar = x - y;
		result.setText(String.valueOf(restar));
	}

	public void multiplicar(ActionEvent event) {
		System.out.println("Multiplicando!");
		Double x = Double.parseDouble(num1.getText());
		Double y = Double.parseDouble(num2.getText());
		Double multiplicar = x * y;
		result.setText(String.valueOf(multiplicar));
	}

	public void dividir(ActionEvent event) {
		System.out.println("Dividiendo!");
		Double x = Double.parseDouble(num1.getText());
		Double y = Double.parseDouble(num2.getText());
		Double dividir = x / y;
		if (y == 0) {
			result.setText("Error!!!");
			System.out.println("No de puede dividir entre 0");

		} else {

			result.setText(String.valueOf(dividir));
		}
	}
}
