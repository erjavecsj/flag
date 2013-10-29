import java.awt.Color;
import java.awt.Graphics;


public class Rectangle {
	private int width;
	private int height;
	private Point point;
	private Color color;

	public Rectangle(int width, int height, Color color, Point point) {
		this.color = color;
		this.width = width;
		this.height = height;
		this.point = point; 
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public void paint(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.point.getX(), this.point.getY(), width, height);
	}
}