package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
    StdDraw.setPenColor(255,0,0);
	StdDraw.filledCircle(.5, 0.5, 0.2);
	StdDraw.setPenColor(0,0,0);
	StdDraw.filledCircle(.75, 0.5, 0.05);
	StdDraw.filledCircle(.5, 0.75, 0.05);
	StdDraw.filledCircle(.25, 0.5, 0.05);	
	StdDraw.filledCircle(.5, 0.25, 0.05);
	StdDraw.filledCircle(Math.sqrt(2)/2-0.0312, Math.sqrt(2)/2-0.0312, 0.05);
	StdDraw.filledCircle(0, 0, 0);
	StdDraw.filledCircle(Math.sqrt(2)/4-0.03, Math.sqrt(2)/4-0.03, 0.05);
	StdDraw.filledCircle(1-(Math.sqrt(2)/4)+0.03, Math.sqrt(2)/4-0.03, 0.05);
	StdDraw.filledCircle(Math.sqrt(2)/4-0.03, 1-(Math.sqrt(2)/4)+0.03, 0.05);
	StdDraw.circle(.5, 0.5, 0.25);
	StdDraw.setPenColor(0,0,0);
	StdDraw.circle(.5, 0.5, 0.3);
}
}