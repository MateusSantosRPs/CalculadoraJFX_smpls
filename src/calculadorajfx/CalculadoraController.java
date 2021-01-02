/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MATHE
 */
public class CalculadoraController implements Initializable {

    double valor1 = 0;
    double valor2 = 0;
    double valorResultado = 0;

    String operacao = "";

    @FXML
    private TextField TelaTextField;
    @FXML
    private Button btnSete;
    @FXML
    private Button btnQuatro;
    @FXML
    private Button btnUm;
    @FXML
    private Button btnZero;
    @FXML
    private Button btnOito;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnDois;
    @FXML
    private Button btnPonto;
    @FXML
    private Button btnNove;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnSubitracao;
    @FXML
    private Button btnAdicao;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnMultiplicacao;
    @FXML
    private Button btnDivisao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btnZero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "0");
            }
        });
        //
        btnUm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "1");
            }
        });
        //
        btnDois.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "2");
            }
        });
        //
        btnTres.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "3");
            }
        });
        //
        btnQuatro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "4");
            }
        });
        //
        btnCinco.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "5");
            }
        });
        //
        btnSeis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "6");
            }
        });
        //
        btnSete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "7");
            }
        });
        //
        btnOito.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "8");
            }
        });
        //
        btnNove.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + "9");
            }
        });
        //

        btnAdicao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(TelaTextField.getText());
                TelaTextField.setText("");
                operacao = "+";
            }
        });
        //
        btnSubitracao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(TelaTextField.getText());
                TelaTextField.setText("");
                operacao = "-";
            }
        });
        //
        btnMultiplicacao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(TelaTextField.getText());
                TelaTextField.setText("");
                operacao = "*";
            }
        });
        //
        btnDivisao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(TelaTextField.getText());
                TelaTextField.setText("");
                operacao = "/";
            }
        });
        //
        btnLimpar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText("");
                valor1 = 0;
                valor2 = 0;
                operacao = "";
            }
        });
        //
        btnPonto.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TelaTextField.setText(TelaTextField.getText() + ".");
            }
        });
        //
        btnIgual.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor2 = Double.parseDouble(TelaTextField.getText());
                switch (operacao) {
                    case "+":
                        valorResultado = valor1 + valor2;
                        TelaTextField.setText(String.valueOf(valorResultado));
                        break;
                    case "-":
                        valorResultado = valor1 - valor2;
                        TelaTextField.setText(String.valueOf(valorResultado));
                        break;
                    case "*":
                        valorResultado = valor1 * valor2;
                        TelaTextField.setText(String.valueOf(valorResultado));
                        break;
                    case "/":
                        valorResultado = valor1 / valor2;
                        TelaTextField.setText(String.valueOf(valorResultado));
                        break;
                }
                operacao = "";
                valor1 = 0;
                valor2 = 0;
            }
        });
    }

}
