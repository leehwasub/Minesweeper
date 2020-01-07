package main;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public MainPanel() {
		setLayout(null);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("메이플스토리", Font.BOLD, 25));
		g.drawString("ㄴㅇㄹㄴㄹㅇㄴㅇㄹ", 200, 200);
	}
	
	

}
