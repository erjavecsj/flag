import java.awt.Color;
import java.awt.Graphics;


public class AmericanFlag {
	
	private int height;
	private int width;
	private double scale;
	private Rectangle redRec;
	private Rectangle union;
	private Rectangle[] stripes;

	public AmericanFlag(int width, int height, double scale) {
		this.stripes = new Rectangle[6];
		int yOffset = (int) (height / 13.0);
		this.width = width * (int)scale;
		this.height = height * (int)scale;
		this.union = new Rectangle((int)(((double)this.height) * 0.76), (int)yOffset * 7, Color.BLUE, new Point(0, 0));
		this.redRec = new Rectangle(this.width, (this.height - 10), Color.RED, new Point(0, 0));
		for (int i = 0; i<stripes.length; i++) {
			stripes[i] = new Rectangle(this.width, this.height/13, Color.WHITE, new Point(0, yOffset));
			yOffset = yOffset + (((int)this.height/13) * 2);
		}
	}

	



	public void draw(Graphics g) {
		redRec.paint(g);
		for (int i = 0; i <stripes.length; i++) {
			stripes[i].paint(g);
		}

		union.paint(g);
	}

}