package tp03;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Program extends Frame implements ActionListener {

	private String op = "som";
	private double n1 = 0;
	private double n2 = 0;
	private double result = 0.0;
	private boolean resultOn = false;
    private static JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bc, bsub, bsom, bdiv, bmult, bres, bpto;
    private static JFrame f;
    private static JPanel panelButton;
    private static JPanel panelRes;
    private static JTextField textFieldRes;

    @SuppressWarnings("deprecation")
	public void GUI() {
    	textFieldRes = new JTextField("0");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bc = new JButton("C");
        bsub = new JButton("-");
        bsom = new JButton("+");
        bdiv = new JButton("/");
        bmult = new JButton("*");
        bres = new JButton("=");
        bpto = new JButton(".");
        f = new JFrame("FlowLayout");
        f.setSize(400, 180);
        panelRes = new JPanel();
        panelRes.setLayout(new GridLayout(1, 1));
        panelRes.add(textFieldRes, BorderLayout.EAST);
        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(5, 4));
        panelButton.add(b7);
        panelButton.add(b8);
        panelButton.add(b9);
        panelButton.add(bdiv);
        panelButton.add(b4);
        panelButton.add(b5);
        panelButton.add(b6);
        panelButton.add(bmult);
        panelButton.add(b1);
        panelButton.add(b2);
        panelButton.add(b3);
        panelButton.add(bsub);
        panelButton.add(b0);
        panelButton.add(bpto);
        panelButton.add(bres);
        panelButton.add(bsom);
        panelButton.add(bc);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bc.addActionListener(this);
        bsub.addActionListener(this);
        bpto.addActionListener(this);
        bsom.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bres.addActionListener(this);
        bc.addActionListener(this);
        f.add(panelRes, BorderLayout.NORTH);
        f.add(panelButton);
        f.setVisible(true);
        f.show();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    	double x = Double.parseDouble(textFieldRes.getText());
    	if(ae.getSource() == bc)
        {
        	textFieldRes.setText("0");
        	n1 = 0;
        	n2 = 0;
        	op = "som";
        	resultOn = false;
        }
    	if(resultOn == true)
    	{
    		if(ae.getSource() != bsom && ae.getSource() != bsub && ae.getSource() != bdiv && ae.getSource() != bmult)
    		{
	    		textFieldRes.setText("0");
	        	resultOn = false;
    		}
    	}
        if(ae.getSource() == b0)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "0");
        }
        if(ae.getSource() == b1)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "1");
        }
        if(ae.getSource() == b2)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "2");
        }
        if(ae.getSource() == b3)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "3");
        }
        if(ae.getSource() == b4)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "4");
        }
        if(ae.getSource() == b5)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "5");
        }
        if(ae.getSource() == b6)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "6");
        }
        if(ae.getSource() == b7)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "7");
        }
        if(ae.getSource() == b8)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "8");
        }
        if(ae.getSource() == b9)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "9");
        }
        if(ae.getSource() == bpto)
        {
        	textFieldRes.setText(textFieldRes.getText() + ".");
        }
        if(ae.getSource() == bdiv)
        {
        	n1 = Double.parseDouble(textFieldRes.getText());
        	op = "div";
        	textFieldRes.setText("0");
        }
        if(ae.getSource() == bmult)
        {
        	n1 = Double.parseDouble(textFieldRes.getText());
        	op = "mult";
        	textFieldRes.setText("0");
        }
        if(ae.getSource() == bsom)
        {
        	n1 = Double.parseDouble(textFieldRes.getText());
        	op = "som";
        	textFieldRes.setText("0");
        }
        if(ae.getSource() == bsub)
        {
        	n1 = Double.parseDouble(textFieldRes.getText());
        	op = "sub";
        	textFieldRes.setText("0");
        }
        if(ae.getSource() == bres)
        {
        	n2 = Double.parseDouble(textFieldRes.getText());
        	if(op == "som")
        	{
        		result = n1 + n2;
        	}
        	else if(op == "sub")
        	{
        		result = n1 - n2;
        	}
        	else if(op == "mult")
        	{
        		result = n1 * n2;
        	}
        	else if(op == "div")
        	{
        		result = n1 / n2;
        	}
        	textFieldRes.setText(String.valueOf(result));
        	resultOn = true;
        }
    }

    public static void main(String[] args) {
    	try {
	        Program program = new Program();
	        program.GUI();
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	finally {
    		
    	}
    }
}