package basicPatterns;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AppUI extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		DataSource ds = new DataSource();
		PlotPanel plotPanel = new PlotPanel();
		ds.setObs1(plotPanel);
		ds.setData();
		JFrame frame = new JFrame();
		frame.add(plotPanel);
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	

}
