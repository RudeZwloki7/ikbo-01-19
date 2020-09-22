package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programme extends JFrame {
    static Logger log = Logger.getLogger(Programme.class.getName());
    static void game(JFrame frame, JButton btn, JTextField field) {
        int answer = (int) (Math.random() * 100 % 21);
        log.info( Integer.toString(answer));
        btn.addActionListener(new ActionListener() {
            private int count = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (field.getText().isEmpty()) return;
                if (Integer.parseInt(field.getText()) == answer) {
                    JOptionPane.showMessageDialog(null, new JLabel("<html> <font color=\"#3bec59\">ВЕРНО</font></html>"));
                    frame.setVisible(false);
                    frame.dispose();
                    JOptionPane.showMessageDialog(null, new JLabel("Вы выиграли"));
                } else {
                    String str;
                    if (Integer.parseInt(field.getText()) < answer) str = "Введеное число меньше загаданного";
                    else str = "Введеное число больше загаданного";
                    JLabel[] outp = {new JLabel("<html> <font color=\"#ec3333\">НЕВЕРНО</font></html>"), new JLabel(str)};
                    JOptionPane.showMessageDialog(null, outp);
                    HintTextField fl = (HintTextField) field;
                    fl.setHint();

                    count++;
                    if (count == 3) {
                        frame.setVisible(false);
                        frame.dispose();
                        JOptionPane.showMessageDialog(null, new JLabel("Вы проиграли"));
                    }
                }
            }
        });
    }

    public Programme() {
        JFrame frame = new JFrame("lab6");
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(3, 1));
        JLabel label = new JLabel("<html>Компьютер загадал число от 0 до 20.<br>Попробуйте его отгадать.<br> <i>У Вас три попытки.</i></html>");
        String hint = "Введите число";
        JTextField textField = new HintTextField(hint);
        JButton btn = new JButton("Проверить");
        frame.add(label);
        frame.add(textField);
        frame.add(btn);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        label.requestFocusInWindow();
        game(frame, btn, textField);
    }

}


class HintTextField extends JTextField implements FocusListener {
    String hint;
    boolean hintVisible;
    Font f = new Font("my_font", Font.ITALIC, 12);

    public HintTextField(String hint) {
        super(hint);
        this.hint = hint;
        this.setCaretColor(Color.GRAY);
        this.setFont(f);
        hintVisible = true;
        this.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (this.getText().isEmpty()) {
            super.setText("");
            hintVisible = false;
            setFont(new Font("Serif", Font.PLAIN, 12));
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (this.getText().isEmpty()) {
            super.setText(hint);
            hintVisible = true;
            setFont(f);
        }
    }

    @Override
    public String getText() {
        return hintVisible ? "" : super.getText();
    }

    public void setHint(){
        super.setText(hint);
        hintVisible = true;
        setFont(f);
    }
}