package org.sp.app0710.graphic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

//Canvas를 오버라이드 하기 위한 코드 작성
//캔벟스는 현실의 도화지를 표현한 컴포넌트이므로
//최초에 아무것도 그려져있지 않은 빈도화지 상태이다
//따라서 개발자가 주도하여 원하는 그림을 그려야 한다.
public class MyCanvas extends Canvas{
	
	
	public void paint(Graphics g) {
		g.setColor(Color.YELLOW);//페인트통 노란색
		g.fillRect(0, 0, 500, 500);
		
		g.setColor(Color.BLUE);
		g.drawString("송혜령", 50, 150);
		
		g.setColor(Color.RED);
		g.drawLine(0, 0, 150, 300);
		
	}
	
}
