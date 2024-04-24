import java.awt.*;
import javax.swing.*;

class Calc {
        JFrame frame;
        JTextField screen;
        JButton nbtn[]=new JButton[10];
        JButton btnPlus, btnMinus, btnMultiply ,btnDivide,
        btnModulo,btnEqual,btn2Zero,btcAc, btnDel,btnPoint;
        Font ff= new Font("Ink.Free",Font.BOLD,30);
        public Calc(){
        frame= new JFrame();
        frame.setSize(400,600);

        frame.setLocationRelativeTo(null);  
        frame.setTitle("CALCULATOR");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(100,100,100));


        screen =new JTextField("Bangladesh");
        screen.setBounds(25,25,325,50);
       screen.setFont(ff);
        frame.add(screen);
        

        frame.setLayout(null);
        frame.setVisible(true);

        }
        public static void main(String [] args){
            new Calc();
        }
    
}