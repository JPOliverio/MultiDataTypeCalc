

import javax.swing.JFrame;
import javax.swing.JPanel;
import math.MathOps;
import java.awt.TextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.*;
import java.time.chrono.JapaneseChronology;

public class SimpleCalc implements ActionListener{
    public static void main(String args[]){

        JFrame frame;
        frame = new JFrame("Simple Calc for Various Data Types");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 500);
        frame.setLocation(430, 100);

        String dataType[] = {"double","int","octalString","binary","hexString"};

        JComboBox dataTypeSelection1 = new JComboBox(dataType);
        JComboBox dataTypeSelection2 = new JComboBox(dataType);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        TextField textField1 = new TextField(15);
        TextField textField2 = new TextField(15);
        JLabel label1 = new JLabel("Value 1");
        JLabel label2 = new JLabel("Value 2");
        panel1.add(textField1);
        panel2.add(textField2);
        frame.add(label1);
        frame.add(dataTypeSelection1);
        frame.add(panel1);
        frame.add(label2);
        frame.add(dataTypeSelection2);
        frame.add(panel2);

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton multiplyButton = new JButton("x");
        JButton divisionButton = new JButton("/");
        frame.add(addButton);
        frame.add(subButton);
        frame.add(multiplyButton);
        frame.add(divisionButton);

        JComboBox dataTypeSelectionResult = new JComboBox(dataType);
        JLabel label3 = new JLabel("Results");
        JPanel panel3 = new JPanel();
        TextField textFieldResults = new TextField(15);
        panel3.add(textFieldResults);
        frame.add(label3);
        frame.add(dataTypeSelectionResult);
        frame.add(panel3);

        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setVisible(true);


        /*
        int dataType1 = 0;
        int dataType2 = 0;
        int dataTypeResult = 0;
        String stringValue1 = "";
        String stringValue2 = "";
        String stringResults = "";
        double value1 = 0;
        double value2 = 0;
        double results = 0;
        */
        
        

        addButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e ) {
            int dataType1 = dataTypeSelection1.getSelectedIndex();
            int dataType2 = dataTypeSelection2.getSelectedIndex();
            int dataTypeResult = dataTypeSelectionResult.getSelectedIndex();
            String stringValue1 = textField1.getText();
            String stringValue2 = textField2.getText();
            double value1 = CalcLogic.dataConvertToDouble(dataType1,stringValue1);
            double value2 = CalcLogic.dataConvertToDouble(dataType2,stringValue2);
            double results = MathOps.add(value1, value2);
            String stringResults = CalcLogic.resultsToSlectedDataType(dataTypeResult, results);
            textFieldResults.setText(stringResults);
          }
        });

        subButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            int dataType1 = dataTypeSelection1.getSelectedIndex();
            int dataType2 = dataTypeSelection2.getSelectedIndex();
            int dataTypeResult = dataTypeSelectionResult.getSelectedIndex();
            String stringValue1 = textField1.getText();
            String stringValue2 = textField2.getText();
            double value1 = CalcLogic.dataConvertToDouble(dataType1,stringValue1);
            double value2 = CalcLogic.dataConvertToDouble(dataType2,stringValue2);
            double results = MathOps.subtract(value1, value2);
            String stringResults = CalcLogic.resultsToSlectedDataType(dataTypeResult, results);
            textFieldResults.setText(stringResults);
          }
        });

        multiplyButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            int dataType1 = dataTypeSelection1.getSelectedIndex();
            int dataType2 = dataTypeSelection2.getSelectedIndex();
            int dataTypeResult = dataTypeSelectionResult.getSelectedIndex();
            String stringValue1 = textField1.getText();
            String stringValue2 = textField2.getText();
            double value1 = CalcLogic.dataConvertToDouble(dataType1,stringValue1);
            double value2 = CalcLogic.dataConvertToDouble(dataType2,stringValue2);
            double results = MathOps.multiply(value1, value2);
            String stringResults = CalcLogic.resultsToSlectedDataType(dataTypeResult, results);
            textFieldResults.setText(stringResults);
          }
        });

        divisionButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            int dataType1 = dataTypeSelection1.getSelectedIndex();
            int dataType2 = dataTypeSelection2.getSelectedIndex();
            int dataTypeResult = dataTypeSelectionResult.getSelectedIndex();
            String stringValue1 = textField1.getText();
            String stringValue2 = textField2.getText();
            double value1 = CalcLogic.dataConvertToDouble(dataType1,stringValue1);
            double value2 = CalcLogic.dataConvertToDouble(dataType2,stringValue2);
            double results = MathOps.divide(value1, value2);
            String stringResults = CalcLogic.resultsToSlectedDataType(dataTypeResult, results);
            textFieldResults.setText(stringResults);
          }
        });

    }
  }
