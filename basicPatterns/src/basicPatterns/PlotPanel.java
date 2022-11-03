package basicPatterns;

import java.awt.Color;

import javax.swing.*;

@SuppressWarnings("serial")
public class PlotPanel extends JPanel implements Observer {
	int[] points;
JPanel panel;

	public PlotPanel () {
		panel = new JPanel();
		panel.setOpaque(true);
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Graph"));
		panel.setBackground(Color.black);
		panel.setSize(500,500);
		panel.setVisible(true);
		}
	public void plotPoints() {
	
	}
	@Override
	public void update(int[] points) {
		// TODO Auto-generatSed method stub
	this.points = points;
		plotPoints();
		
	}
	
	

}
