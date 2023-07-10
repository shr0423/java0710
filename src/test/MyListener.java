package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener{
	
	
	public void actionPerformed(ActionEvent e) {
		//area에 텍스트추가
		et.area.append("눌렀어?\n");
	}
}
