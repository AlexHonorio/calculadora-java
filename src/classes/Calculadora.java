package classes;

import javax.print.attribute.standard.JobKOctets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
    }

    double valor1, valor2, result;
    String operator;

    public Calculadora(){


        //Janela
        JFrame frame = new JFrame("Calculator");
        frame.setSize(306,520);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new java.awt.Color(180,197,215));


        //Tela
        JTextField textField = new JTextField();
        JTextField textField2 = new JTextField();
        frame.add(textField);
        frame.add(textField2);
        textField.setBounds(10,45,270,60);
        textField2.setBounds(10,25,270,20);
        textField.setEditable(false);
        textField2.setEditable(false);
        Font textFont = new Font("Franklin Gothic", Font.BOLD, 30);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField2.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setFont(textFont);


        //Botoes
        JButton[] buttons = new JButton[19];
        JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
                addBtn,subBtn,multBtn,divBtn,pctBtn,decBtn,eqlBtn,delBtn,clrBtn,negBtn;

        btn0 = new JButton("0");
        frame.add(btn0);
        btn0.setBounds(10,410,60,60);

        btn1 = new JButton("1");
        frame.add(btn1);
        btn1.setBounds(10,340, 60,60);

        btn2 = new JButton("2");
        frame.add(btn2);
        btn2.setBounds(80,340,60,60);

        btn3 = new JButton("3");
        frame.add(btn3);
        btn3.setBounds(150,340,60,60);

        btn4 = new JButton("4");
        frame.add(btn4);
        btn4.setBounds(10,270,60,60);

        btn5 = new JButton("5");
        frame.add(btn5);
        btn5.setBounds(80,270,60,60);

        btn6 = new JButton("6");
        frame.add(btn6);
        btn6.setBounds(150,270,60,60);

        btn7 = new JButton("7");
        frame.add(btn7);
        btn7.setBounds(10,200,60,60);

        btn8 = new JButton("8");
        frame.add(btn8);
        btn8.setBounds(80,200,60,60);

        btn9 = new JButton("9");
        frame.add(btn9);
        btn9.setBounds(150,200,60,60);

        decBtn = new JButton(".");
        frame.add(decBtn);
        decBtn.setBounds(80,410, 60,60);

        eqlBtn = new JButton("=");
        frame.add(eqlBtn);
        eqlBtn.setBounds(220,410,60,60);
        eqlBtn.setBackground(new Color(255, 178, 102));

        addBtn = new JButton("+");
        frame.add(addBtn);
        addBtn.setBounds(220,340,60,60);

        subBtn = new JButton("-");
        frame.add(subBtn);
        subBtn.setBounds(220,270,60,60);

        multBtn = new JButton("x");
        frame.add(multBtn);
        multBtn.setBounds(220,200,60,60);

        delBtn = new JButton("C");
        frame.add(delBtn);
        delBtn.setBounds(10,130,60,60);

        clrBtn = new JButton("CE");
        frame.add(clrBtn);
        clrBtn.setBounds(80,130,60,60);

        pctBtn = new JButton("%");
        frame.add(pctBtn);
        pctBtn.setBounds(150,130,60,60);

        divBtn = new JButton("/");
        frame.add(divBtn);
        divBtn.setBounds(220,130,60,60);

        negBtn = new JButton("(-)");
        frame.add(negBtn);
        negBtn.setBounds(150,410,60,60);

        JButton[] buttons1 = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, decBtn,negBtn};
        Arrays.stream(buttons1).forEach(botao -> botao.setBackground(new Color(180, 197, 215)));

        JButton[] buttons2 = {addBtn, subBtn, multBtn, divBtn, pctBtn, delBtn, clrBtn};
        Arrays.stream(buttons2).forEach(botao -> botao.setBackground(new Color(174, 176, 198)));

        Font btnFont = new Font("Franklin Gothic", Font.BOLD, 18);
        JButton[] buttons3 = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, decBtn,eqlBtn,addBtn,subBtn,
                multBtn,divBtn,pctBtn,delBtn,clrBtn,negBtn};
        Arrays.stream(buttons3).forEach(botao -> botao.setFont(btnFont));


        //Calculo


        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });


        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(textField.getText());
                operator = "+";
                textField.setText("");
                textField2.setText(valor1 + " " + operator);
            }
        });

        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(textField.getText());
                operator = "-";
                textField.setText("");
                textField2.setText(valor1 + " " + operator);
            }
        });

        multBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(textField.getText());
                operator = "X";
                textField.setText("");
                textField2.setText(valor1 + " " + operator);
            }
        });

        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(textField.getText());
                operator = "/";
                textField.setText("");
                textField2.setText(valor1 + " " + operator);
            }
        });

        pctBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(textField.getText());
                operator = "%";
                textField.setText("");
                textField2.setText(valor1 + " " + operator);
            }
        });

        decBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().contains(".")) {
                    textField.setText(textField.getText() + ".");
                }
            }
        });

        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField2.setText("");
            }
        });

        clrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                valor1 = 0.0;
                valor2 = 0.0;
                operator = "";
            }
        });

        negBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp = Double.parseDouble(textField.getText());
                temp*=-1;
                textField.setText(String.valueOf(temp));
            }
        });

        eqlBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor2 = Double.parseDouble(textField.getText());
                switch(operator){
                    case "+":
                        result = valor1 + valor2;
                        break;
                    case "-":
                        result = valor1 - valor2;
                        break;
                    case "X":
                        result = valor1 * valor2;
                        break;
                    case "/":
                        result = valor1 / valor2;
                        break;
                    case "%":
                        result = valor1 * valor2 / 100;

                }
                textField.setText(String.valueOf(result));
                textField2.setText(valor1 + " " + operator + " " + valor2 + " = ");
                valor1 = result;
            }
        });

    }

}
