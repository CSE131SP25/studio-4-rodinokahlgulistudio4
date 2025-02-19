package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int redness = in.nextInt();
		int greenness = in.nextInt();
		int blueness = in.nextInt();
		boolean filled = in.nextBoolean();
		
		
		
		Color userColor = new Color(redness, greenness, blueness);
		StdDraw.setPenColor(userColor);
		
		if (shape == "rectangle") {
			double x = in.nextInt();
			double y = in.nextInt();
			double halfWidth = in.nextInt();
			double halfHeight = in.nextInt();
			
			if (filled == false) {
				StdDraw.shape();
			}
			else if (filled == true) {
				StdDraw.("fillled" + shape)();
			}
		}
		else if (shape == "ellipse") {
			double x = in.nextInt();
			double y = in.nextInt();
			double semiMajorAxis = in.nextInt();
			double semiMinorAxis = in.nextInt();
		}
		else if (shape == "triangle") {
			double x1 = in.nextInt();
			double y1 = in.nextInt();
			double x2 = in.nextInt();
			double y2 = in.nextInt();
			double x3 = in.nextInt();
			double y3 = in.nextInt();
		}
		
		
		
	}
}
