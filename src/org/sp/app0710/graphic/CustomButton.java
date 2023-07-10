package org.sp.app0710.graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 자바의 모든 GUI컴포넌트는 사실 스스로를 그려낸다.
 * 
 *                   현실     Java
 * 주체:            화가      컴포넌트
 * 그려질대상:       캔버스    컴포넌트
 * 그리는행위)          붓 ㅓ     paint()
 * 스타일(색상)       팔레트      paint(Graphics g)
 *                                    현실에서의 팔레트보다 훨씬 다양한 기능 지원
 *                                     (예 :도형,라인, 이미지,String)
 *                                        
 */

//모든 컴포넌트가 ㅂ보유한 paint()메서드를 뺏어서 개발자가 주도하여 그림을 그려본다
//repaint()메서드를 오버라이드하자
public class CustomButton extends JButton{
	
	
	public CustomButton(String title) {
		super(title);
		this.setPreferredSize(new Dimension(200,200));
	
	}
	
	
	public void paint(Graphics g) {
		//System.out.println("뺏어그렸지롱");
		//paint메서드를 Graphics객체를사용하기위한 코드 영역일뿐,
		//사실 대부분의 그림은 Graphics객체가 담당한다.
		
		//그래픽스 객체의페인트 통 색상을 변경
		g.setColor(Color.ORANGE);
		
		//채어진 사각형을 그린다
		g.fillRect(0, 0, 200, 200);
		
	
	}
	
}
