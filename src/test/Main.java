package test;

import domain.Account;
import domain.Owner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Criando a interface gráfica
        JFrame frame = new JFrame("Bank Account");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando painel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1));

        // Criando campos e botões
        JTextField accountNumberField = new JTextField(10);
        JTextField ownerNameField = new JTextField(10);
        JLabel balanceLabel = new JLabel("Balance: 0.0");
        JTextField depositField = new JTextField(10);
        JTextField withdrawalField = new JTextField(10);

        JButton createAccountButton = new JButton("Create Account");
        JButton depositButton = new JButton("Deposit");
        JButton withdrawalButton = new JButton("Withdraw");
        JButton exitButton = new JButton("Exit");

        // Variáveis para armazenar a conta e o proprietário
        final Account[] account = {null};
        final Owner[] owner = {null};

        // Criando conta
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String accountNumber = accountNumberField.getText();
                    String ownerName = ownerNameField.getText();

                    if (accountNumber.isEmpty() || ownerName.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
                        return;
                    }

                    owner[0] = new Owner(ownerName);
                    account[0] = new Account(accountNumber, owner[0], 0.0);
                    balanceLabel.setText("Balance: " + account[0].getBalanceAccount());
                    JOptionPane.showMessageDialog(frame, "Account created successfully.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error creating account: " + ex.getMessage());
                }
            }
        });

        // Depósito
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (account[0] == null) {
                        JOptionPane.showMessageDialog(frame, "Please create an account first.");
                        return;
                    }

                    double depositAmount = Double.parseDouble(depositField.getText());
                    account[0].deposit(depositAmount);
                    balanceLabel.setText("Balance: " + account[0].getBalanceAccount());
                    depositField.setText(""); // Limpa o campo
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid deposit amount.");
                }
            }
        });

        // Saque
        withdrawalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (account == null) {
                        JOptionPane.showMessageDialog(frame, "Please create an account first.");
                        return;
                    }

                    double withdrawalAmount = Double.parseDouble(withdrawalField.getText());
                    account[0].withdrawal(withdrawalAmount);
                    balanceLabel.setText("Balance: " + account[0].getBalanceAccount());
                    withdrawalField.setText(""); // Limpa o campo
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid withdrawal amount.");
                }
            }
        });

        // Saída
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Adicionando os componentes no painel
        panel.add(new JLabel("Account Number:"));
        panel.add(accountNumberField);
        panel.add(new JLabel("Owner Name:"));
        panel.add(ownerNameField);
        panel.add(createAccountButton);
        panel.add(balanceLabel);
        panel.add(new JLabel("Deposit Amount:"));
        panel.add(depositField);
        panel.add(depositButton);
        panel.add(new JLabel("Withdrawal Amount:"));
        panel.add(withdrawalField);
        panel.add(withdrawalButton);
        panel.add(exitButton);

        // Configurando e mostrando a interface
        frame.add(panel);
        frame.setVisible(true);
    }
}
