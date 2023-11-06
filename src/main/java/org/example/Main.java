package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,  400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JTextField inputField1 = new JTextField();
        JTextField inputField2 = new JTextField();
        JTextField outputField = new JTextField();
        outputField.setEditable(false);

        inputField1.setFont((new Font("Arial", Font.PLAIN, 30)));
        inputField2.setFont((new Font("Arial", Font.PLAIN, 30)));
        outputField.setFont((new Font("Arial", Font.PLAIN, 30)));

        JLabel label1 = new JLabel("texto:");
        label1.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel label2 = new JLabel("criptografado:");
        label2.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel label3 = new JLabel("decriptografado:");
        label3.setFont((new Font("Arial", Font.BOLD, 30)));

        panel.add(label1);
        panel.add(inputField1);
        panel.add(label2);
        panel.add(inputField2);
        panel.add(label3);
        panel.add(outputField);




        JButton button = new JButton("criptografar");
        button.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(button);
        JButton button2 = new JButton("decriptografar");
        button.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(button);


            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try{
                        inputField2.setText (Seguranca.encrypt(inputField1.getText(), 3));

                    }
                    catch (NumberFormatException ex){
                        outputField.setText("Erro: Entrada inválida");
                    }
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        outputField.setText (Seguranca.encrypt(inputField1.getText(), -3));
                    }
                    catch (NumberFormatException ex){
                        outputField.setText("Erro: Entrada inválida");
                    }
                }
            });

            frame.add(panel);
            frame.setVisible(true);

        }




    }
