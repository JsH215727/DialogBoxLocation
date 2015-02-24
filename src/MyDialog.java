/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jisheng
 */
import javax.swing.*;
public class MyDialog extends JDialog
{
     private JTextField     tf     = new JTextField("not selected >selected< not selected");

     public static void main(String[] args)
     {
          JFrame f = new JFrame("Some parent frame");
          f.setLocation(500,10);
          f.setSize(500,650);
          f.setAlwaysOnTop(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setVisible(true);

          new MyDialog(f);
          
          JButton button = new JButton("OK GG!!!");
          button.setVisible(true);
          button.setBounds(10,10,50,20);
     }

     public MyDialog(JFrame parent)
     {
          super(parent, "Child dialog", /*Selecct modality*/ true);

          // super();
          super.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

          super.add(this.tf);

          super.pack();
          super.setLocation(520,252);//setLocation  
          super.setSize(250,70);//setSize
          super.setVisible(true);

          // Selection does not work when dialog is modal.
          //this.tf.select(14, 22);
          this.tf.requestFocus();
     }
}