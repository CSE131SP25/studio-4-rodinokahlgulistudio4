package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.5, 0.25, .2, 1);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.05, 1);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(.5, .5, .2);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.2, 0.15, 1, 0.05);
		StdDraw.filledRectangle(0.2, 0.85, 1, 0.05);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.85, 0.25, 0.05, 1);
		StdDraw.filledRectangle(0.15, 0.25, 0.05, 1);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.05);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.5, 0.5, 0.025);
		
		StdDraw.setPenRadius(0.05);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
	}
}