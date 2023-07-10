package org.sp.app0710.graphic;

import java.awt.Font;

import javax.swing.JFrame;

//자바의 GUI컴포넌트 중 그림을 그리기에 적당한 컴포넌트는 주로 컨테이너 이지만
//컨테이너가 아니면서 애초에 그림을 그릴 영역을 지원하기위해 지원되는 컴포넌트가
//있고 java.awt.Canvas이다
public class MyFrame2 extends JFrame{
	MyCanvas can;
	
	
	public MyFrame2() {
		can=new MyCanvas();
		
		add(can);//센터에 부착되면서 대왕만하게
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}
	
}
