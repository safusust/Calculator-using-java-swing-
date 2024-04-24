import java.awt.*;
import javax.swing.*;

class Calc {
        JFrame frame;
        JTextField screen;
        JButton nbtn[]=new JButton[10];
        JButton btnPlus, btnMinus, btnMultiply ,btnDivide,
        btnModulo,btnEqual,btn2Zero,btcAc, btnDel,btnPoint;
        
        public Calc(){
        frame= new JFrame();
        frame.setSize(400,600);

        frame.setLocationRelativeTo(null);  
        frame.setTitle("CALCULATOR");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(new Color(100,100,100));
        frame.setLayout(null);
        frame.setVisible(true);

        }
        public static void main(String [] args){
            new Calc();
        }
    
}