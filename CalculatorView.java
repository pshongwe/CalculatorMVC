package Architectural;

// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it.

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

    private JTextField firstNumber  = new JTextField(13);
    private JTextField secondNumber = new JTextField(13);

    private JLabel operator = new JLabel("?");

    private JLabel equals = new JLabel("=");
    private JButton additionButton = new JButton("+");
    private JButton subtractionButton = new JButton("-");
    private JButton divisionButton = new JButton("/");
    private JButton multiplicationButton = new JButton("*");
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(13);

    CalculatorView(){

        // Sets up the view and adds the components

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(operator);
        calcPanel.add(secondNumber);
        calcPanel.add(equals);
        calcPanel.add(calcSolution);
        calcPanel.add(additionButton);
        calcPanel.add(subtractionButton);
        calcPanel.add(divisionButton);
        calcPanel.add(multiplicationButton);
        calcPanel.add(calculateButton);


        this.add(calcPanel);

        // End of setting up the components --------

    }

    public int getFirstNumber(){

        return Integer.parseInt(firstNumber.getText());

    }

    public int getSecondNumber(){

        return Integer.parseInt(secondNumber.getText());

    }

    public JLabel getOperator() {
        return operator;
    }

    public int getCalcSolution(){

        return Integer.parseInt(calcSolution.getText());

    }

    public void setCalcSolution(int solution){

        calcSolution.setText(Integer.toString(solution));

    }

    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed

    void addCalculateListener(ActionListener listenForCalcButton){

        calculateButton.addActionListener(listenForCalcButton);

    }

    void addOperatorListener(ActionListener listen){
        additionButton.addActionListener(listen);
        subtractionButton.addActionListener(listen);
        divisionButton.addActionListener(listen);
        multiplicationButton.addActionListener(listen);
    }

    // Open a popup that contains the error message passed

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}
