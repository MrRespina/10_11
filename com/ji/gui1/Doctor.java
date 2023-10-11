package com.ji.gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Doctor implements ActionListener {

	private JTextField htf;
	private JTextField wtf;
	private JLabel resultLabel;

	public Doctor() {
		super();
	}

	public Doctor(JTextField htf, JTextField wtf, JLabel resultLabel) {
		super();
		this.htf = htf;
		this.wtf = wtf;
		this.resultLabel = resultLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double h = Double.parseDouble(htf.getText());
		double w = Double.parseDouble(wtf.getText());
		h /= 100;

		double bmi = w / (h * h);
		
		String result="저체중";
		
		if(bmi>=40) {
			result="고도비만";
		}else if(bmi>=35) {
			result="중등도비만";
		}else if(bmi>=30) {
			result="경도비만";	
		}else if(bmi>=25) {
			result="과체중";
		}else if(bmi>=18.5) {
			result="정상";
		}
		
		String printResult = String.format("BMI = %.2f\n 당신은 %s",bmi,result);
		resultLabel.setText(printResult);
		
	}

}
