package org.sp.app0710.graphic2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	int x;
	int y;
	int index;
	
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image[] image=new Image[10];
	
	public MyPanel() {
		for(int i=0;i<image.length;i++) {
		image[i]=kit.getImage("D:/morning/javase_workspace/app0710/res/hero/Attack__00"+i+".png");
	}
}
	public void tick() {
		x+=5;
		y+=5;
	}
	
	public void paint(Graphics g) {
		System.out.println("paint()호출");
		
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 700, 650);//700*650사각형채움
		
		g.setColor(Color.RED);
		g.fillOval(x, y,40, 40);
		
		//이미지 그리기
		//이미지 인스턴스를 얻어오는 방법은 여러가지방법이 있따
		//Toolkit을 이용하는 방법(해당OS에 의존적인 경로로 이미지를 얻는방법) 
		
		g.drawImage(image[index], 20, 30,100, 150, this);
		
	}
}
