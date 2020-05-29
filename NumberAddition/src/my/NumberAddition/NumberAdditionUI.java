package my.NumberAddition;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class NumberAdditionUI extends Application {

    private JPanel panel1;
    private JButton сложитьButton;
    private JButton очиститьButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton выходButton;

    public NumberAdditionUI() {
        выходButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        очиститьButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
        сложитьButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;

                num1 = Float.parseFloat(textField1.getText());
                num2 = Float.parseFloat(textField2.getText());
                result = num1+num2;
                textField3.setText(String.valueOf(result));
            }
        });
        JFrame frame = new JFrame("Я удивлена что у меня что-то получилось");
        frame.setContentPane(panel1);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
