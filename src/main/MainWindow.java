package main;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuBar;
	private JMenu menu;

	public MainWindow() {
		setTitle("지뢰 찾기");
		setSize(1280, 720);
		menuBar = new JMenuBar();
		menu = new JMenu("메뉴");
		menuBar.add(menu);
		menu.add("초급");
		menu.add("중급");
		menu.add("고급");
		setJMenuBar(menuBar);
		getContentPane().add(new MainPanel());
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
	}

}
