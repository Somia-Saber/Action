/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author somia saber
 */
public class Action_class extends JFrame implements ActionListener{
        JPanel p,p1,p2,p3;
        JTextField t;
        JLabel l;
        JButton U,C;
        JTextArea ta; 
    public Action_class(){
               
        p=new JPanel();
        p.setLayout(new GridLayout(3,1));
        this.add(p);
        
        p1=new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
        p.add(p1);
        l=new JLabel("Enter your text here:");
        p1.add(l);
        t=new JTextField();
        t.setColumns(16);
        p1.add(t);
        
        p2=new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEFT,10,2));
        p.add(p2);
        U=new JButton("UPPER");
        C=new JButton("Clear");
        U.addActionListener(this);
        C.addActionListener(this);
        p2.add(U);
        p2.add(C);
        
        
        p3=new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(p3);
        ta =new JTextArea();
        p3.add(ta);
        
        
        
        
        
        
        
        setVisible(true);
        setSize(600,200);
        setLocation(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o=e.getSource();
        if(o==U){
        String u=t.getText();
        String s=u.toUpperCase();
        ta.setText(s);
        }   
        else if(o==C){
          t.setText("");
          ta.setText("");
                    
                    
        }    
        
    }
}
