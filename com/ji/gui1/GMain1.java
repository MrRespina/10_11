package com.ji.gui1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame j = new JFrame("BMI Test");
		GridLayout g = new GridLayout(3, 2,1,1);
		
		j.setLayout(g);
		JLabel hLabel = new JLabel("키");
		j.add(hLabel);
		
		JTextField hjtf = new JTextField();
		j.add(hjtf);
		
		JLabel wLabel = new JLabel("몸무게");
		j.add(wLabel);
		
		JTextField wjtf = new JTextField();
		j.add(wjtf);
		
		JLabel resultLabel = new JLabel("결과");
		j.add(resultLabel);
		
		JButton btn = new JButton("확인");
		j.add(btn);
		
		Doctor d = new Doctor(hjtf,wjtf,resultLabel);
		btn.addActionListener(d);
		
		j.setSize(350, 350);
		j.setVisible(true);
	}

}
