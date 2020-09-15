package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Logger;

import static java.awt.Font.BOLD;
import static java.awt.Font.SANS_SERIF;

/*Упражнение 1.
Напишите интерактивную программу с использованием GUI имитирует
таблицу результатов матчей между командами Милан и Мадрид. Создайте JFrame
приложение у которого есть следующие компоненты GUI:
• одна кнопка JButton labeled “AC Milan”
• другая JButton подписана “Real Madrid”
• надпись JLabel содержит текст “Result: 0 X 0”
• надпись JLabel содержит текст “Last Scorer: N/A”
• надпись Label содержит текст “Winner: DRAW”;
Всякий раз, когда пользователь нажимает на кнопку AC Milan, результат
будет увеличиваться для Милана, сначала 1 X 0, затем 2 X 0 и так далее. Last Scorer
означает последнюю забившую команду. В этом случае: AC Milan. Если
пользователь нажимает кнопку для команды Мадрид, то счет приписывается ей.
Победителем становится команда, которая имеет больше кликов кнопку на
соответствующую, чем другая.*/



public class Programm extends JFrame {

    int scoreAC = 0;
    int scoreRM = 0;
    String cmnd1 = "AC Milan";
    String cmnd2 = "Real Madrid";


    JButton jButton1 = new JButton(cmnd1);
    JButton jButton2 = new JButton(cmnd2);
    JLabel lbl1 = new JLabel("Result: "+scoreAC + "X"+scoreRM);
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    Label endlbl = new Label("Winner: DRAW");

    class MyListener implements MouseListener{
        private Logger log = Logger.getLogger(MyListener.class.getName());
        public void mouseExited(MouseEvent a){}
        public void mouseClicked(MouseEvent a)
        {
            JButton btn= (JButton) a.getSource();
            String temp = btn.getText();
            if (temp.equals(cmnd1)){
                scoreAC++;
                lbl1.setText("Result: "+scoreAC + "X"+scoreRM);
                lbl2.setText("Last Scorer: "+cmnd1);
                //log.info("AC clicked");
            }
            else {
                scoreRM++;
                lbl1.setText("Result: "+scoreAC + "X"+scoreRM);
                lbl2.setText("Last Scorer: "+cmnd2);
                //log.info("RM clicked");
            }
            if (scoreAC>scoreRM){
                endlbl.setText("Winner: "+cmnd1);
            }
            else if(scoreAC<scoreRM){
                endlbl.setText("Winner: "+cmnd2);
            }
            else endlbl.setText("Winner: DRAW");


        }
        public void mouseEntered(MouseEvent a) {}
        public void mouseReleased(MouseEvent a) {}
        public void mousePressed(MouseEvent a) {}
    };

    public Programm(){
        super("ScoreBoard");
        setLayout(null);
        setSize(500,350);
        jButton1.setBounds(30,50,150,20);
        jButton2.setBounds(300,50,150,20);
        lbl1.setBounds(200,100,200,40);
        lbl2.setBounds(180,160,200,40);
        endlbl.setFont(Font.getFont(SANS_SERIF));
        endlbl.setBounds(180,200,200,40);
        jButton1.addMouseListener(new MyListener());
        jButton2.addMouseListener(new MyListener());
        add(jButton1);
        add(jButton2);
        add(lbl1);
        add(lbl2);
        add(endlbl);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}



