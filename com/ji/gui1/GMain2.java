package com.ji.gui1;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

//1920x1080

public class GMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Robot r = new Robot();
			r.mouseMove(1900,1060);
			Thread.sleep(500);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.keyPress(KeyEvent.VK_ENTER);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
