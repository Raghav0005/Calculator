import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.border.Border;
//import javax.swing.JTextField;
public class Calculator implements ActionListener {
	JButton add, sub, mul, divide, equal, point, one, two, three, four, five, six, seven, eight, nine, zero, clear, power, delete;
	JLabel l1, l2;
	static double a=0, b=0, result = 0;
	boolean booladd = false, boolsub = false, boolmul = false, booldivide = false, boolpower = false;
	public Calculator() {
		JFrame f = new JFrame("Calculator");
		one = new JButton("1");
		one.setBounds(40, 300, 60, 60);
		f.add(one);
		one.addActionListener(this);
		one.setBackground(Color.WHITE);
		
		two = new JButton("2");
		two.setBounds(100, 300, 60, 60);
		f.add(two);
		two.addActionListener(this);
		two.setBackground(Color.WHITE);
		
		three = new JButton("3");
		three.setBounds(160, 300, 60, 60);
		f.add(three);
		three.addActionListener(this);
		three.setBackground(Color.WHITE);
		
		four = new JButton("4");
		four.setBounds(40, 240, 60, 60);
		f.add(four);
		four.addActionListener(this);
		four.setBackground(Color.WHITE);
		
		five = new JButton("5");
		five.setBounds(100, 240, 60, 60);
		f.add(five);
		five.addActionListener(this);
		five.setBackground(Color.WHITE);
		
		six = new JButton("6");
		six.setBounds(160, 240, 60, 60);
		f.add(six);
		six.addActionListener(this);
		six.setBackground(Color.WHITE);
		
		seven = new JButton("7");
		seven.setBounds(40, 180, 60, 60);
		f.add(seven);
		seven.addActionListener(this);
		seven.setBackground(Color.WHITE);
		
		eight = new JButton("8");
		eight.setBounds(100, 180, 60, 60);
		f.add(eight);
		eight.addActionListener(this);
		eight.setBackground(Color.WHITE);
		
		nine = new JButton("9");
		nine.setBounds(160, 180, 60, 60);
		f.add(nine);
		nine.addActionListener(this);
		nine.setBackground(Color.WHITE);
		
		zero = new JButton("0");
		zero.setBounds(100, 360, 60, 60);
		f.add(zero);
		zero.addActionListener(this);
		zero.setBackground(Color.WHITE);
		
		add = new JButton("+");
		add.setBounds(250, 180, 60, 60);
		f.add(add);
		add.addActionListener(this);
		add.setBackground(Color.GRAY);
		
		sub = new JButton("-");
		sub.setBounds(250, 240, 60, 60);
		f.add(sub);
		sub.addActionListener(this);
		sub.setBackground(Color.GRAY);
		
		mul = new JButton("×");
		mul.setBounds(250, 300, 60, 60);
		f.add(mul);
		mul.addActionListener(this);
		mul.setBackground(Color.GRAY);
		
		divide = new JButton("÷");
		divide.setBounds(250, 360, 60, 60);
		f.add(divide);
		divide.addActionListener(this);
		divide.setBackground(Color.GRAY);
		
		clear = new JButton("C");
		clear.setBounds(250, 120, 60, 60);
		f.add(clear);
		clear.addActionListener(this);
		clear.setBackground(Color.lightGray);
		
		equal = new JButton("=");
		equal.setBounds(160, 360, 60, 60);
		f.add(equal);
		equal.addActionListener(this);
		equal.setBackground(Color.LIGHT_GRAY);
		
		point = new JButton(".");
		point.setBounds(40, 360, 60, 60);
		f.add(point);
		point.addActionListener(this);
		point.setBackground(Color.lightGray);
		
		power = new JButton("^");
		power.setBounds(100, 120, 60, 60);
		f.add(power);
		power.addActionListener(this);
		power.setBackground(Color.lightGray);
		
		delete = new JButton("del");
		delete.setBounds(160, 120, 60, 60);
		f.add(delete);
		delete.addActionListener(this);
		delete.setBackground(Color.lightGray);
		
		l1 = new JLabel();
		l1.setBounds(20, 55, 300, 35);
		f.add(l1);
		Border border = BorderFactory.createLineBorder(Color.black, 3);
		l1.setBorder(border);
		
		l2 = new JLabel();
		l2.setBounds(200, 10, 120, 30);
		f.add(l2);
		l2.setBorder(border);
		
		f.setSize(350, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == clear)
		{
			l1.setText("");
			l2.setText("");
		}
		if(e.getSource() == delete)
		{
			String s1 = l1.getText();
			String s2 = l2.getText();
			l1.setText("");
			l2.setText("");
			for(int i = 0; i < s1.length()-1; i++)
				l1.setText(l1.getText() + s1.charAt(i));
			for(int j = 0; j < s2.length() - 1; j++)
				l2.setText(l2.getText() + s2.charAt(j));
		}
		if(e.getSource() == zero)
		{
			l1.setText(l1.getText() + "0");
			l2.setText(l2.getText() + "0");
		}
		if(e.getSource() == one)
		{
			l1.setText(l1.getText() + "1");
			l2.setText(l2.getText() + "1");
		}
		if(e.getSource() == two)
		{
			l1.setText(l1.getText() + "2");
			l2.setText(l2.getText() + "2");
		}
		if(e.getSource() == three)
		{
			l1.setText(l1.getText() + "3");
			l2.setText(l2.getText() + "3");
		}
		if(e.getSource() == four)
		{
			l1.setText(l1.getText() + "4");
			l2.setText(l2.getText() + "4");
		}
		if(e.getSource() == five)
		{
			l1.setText(l1.getText() + "5");
			l2.setText(l2.getText() + "5");
		}
		if(e.getSource() == six)
		{
			l1.setText(l1.getText() + "6");
			l2.setText(l2.getText() + "6");
		}
		if(e.getSource() == seven)
		{
			l1.setText(l1.getText() + "7");
			l2.setText(l2.getText() + "7");
		}
		if(e.getSource() == eight)
		{
			l1.setText(l1.getText() + "8");
			l2.setText(l2.getText() + "8");
		}
		if(e.getSource() == nine)
		{
			l1.setText(l1.getText() + "9");
			l2.setText(l2.getText() + "9");
		}
		if(e.getSource() == point)
		{
			l1.setText(l1.getText() + ".");
			l2.setText(l2.getText() + ".");
		}
		if(e.getSource() == add)
		{
			a = Double.parseDouble(l1.getText());
			l1.setText("");
			booladd = true;
			l2.setText(l2.getText() + "+");
		}
		if(e.getSource() == sub)
		{
			a = Double.parseDouble(l1.getText());
			l1.setText("");
			boolsub = true;
			l2.setText(l2.getText() + "-");
		}
		if(e.getSource() == mul)
		{
			a = Double.parseDouble(l1.getText());
			l1.setText("");
			boolmul = true;
			l2.setText(l2.getText() + "×");
		}
		if(e.getSource() == divide)
		{
			a = Double.parseDouble(l1.getText());
			l1.setText("");
			booldivide = true;
			l2.setText(l2.getText() + "÷");
		}
		if(e.getSource() == power)
		{
			a = Double.parseDouble(l1.getText());
			l1.setText("");
			boolpower = true;
			l2.setText(l2.getText() + "^");
		}
		if(e.getSource() == equal)
		{
			b = Double.parseDouble(l1.getText());
			if(booladd == true)
			{
				result = a + b;
			}
			else if(boolsub == true)
			{
				result = a - b;
			}
			else if(boolmul == true)
			{
				result = a*b;
			}
			else if(booldivide == true)
			{
				result = a/b;
			}
			else if(boolpower = true)
			{
				result = Math.pow(a, b);
			}
			booladd = false;
			boolsub = false;
			boolmul = false;
			booldivide = false;
			boolpower = false;
			l1.setText(" " + Double.toString(result));
		}
	}
}