package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.MouseController;
import model.Circle;
import model.Point;

public class MyDisplay extends JPanel{
	Point point = new Point();
	Circle circle = new Circle(point, 20);

	// EX1- 4-- Redefined paint method with the drawLine method that draws a line using x1, y1, x2, y2 coordinates.
	// EX1- 5-- The paintComponent method is called automatically when the window screen appears and become visible on the
	// screen.
	// EX1- 6-- There are a lot of differences between the java.awt and the swing but the main difference is that
	// the MVC pattern is not supported by AWT but the MVC pattern is supported by Swing
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(50, 50, 250, 250);
		
		// EX2 2-- Draw the circle using instance of point to get the coordinates
		g.fillOval(point.getX(), point.getY(), 100, 100);
		
	}


	public static void main(String[] args) {
		// EX1- 3-- We create an instance of JFrame that creates a window on the screen with a title.
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		
		// EX1- 3-- We create a dimension that sizes the window with a 500 width and a 500 height.
		frame.setSize(new Dimension(500,500));

		// EX1- 3-- We set the setVisible(true) so the frame (window screen) will appear and be visible on the screen.
		frame.setVisible(true);

		// EX1 3-- It will close the window whenever we click on the close icon of the frame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// EX1 3-- We create an instance the class MyDisplay and adding the instance to the frame.
		MyDisplay d = new MyDisplay();
		frame.add(d);
		
		
		
		MouseController cont = new MouseController();
		frame.addMouseMotionListener(cont);


	}

}
