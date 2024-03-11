package tr.com.ih.fe;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import tr.com.ih.interfaces.FeInterface;

public class MainWindowFE extends JFrame implements FeInterface{

	public MainWindowFE() {
		initPencere();
		
	}
	
	
	@Override
	public void initPencere() {
		JTabbedPane tabs = initTabs();
		JMenuBar bar = initBar();
		
		//add(tabs);
		//setJMenuBar(bar);
		
		setTitle("Sales And Stock Program");
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public JPanel initPanle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JMenuBar initBar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
