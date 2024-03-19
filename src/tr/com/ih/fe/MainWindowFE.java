package tr.com.ih.fe;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
		setJMenuBar(bar);
		
		setTitle("Sales And Stock Program");
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public JPanel initPanle() {
		JPanel panel = new JPanel();
		
		return panel;
	}

	@Override
	public JMenuBar initBar() {
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		bar.add(fileMenu);
		
		JMenuItem exitItem = new JMenuItem("Exit");
		fileMenu.add(exitItem);
		
		
		
		JMenu productMenu = new JMenu("Products");
		bar.add(productMenu);
		JMenuItem productAddItem = new JMenuItem("Add Product");
		productMenu.add(productAddItem);
		JMenuItem categoryAddItem = new JMenuItem("Add Category");
		productMenu.add(categoryAddItem);
		productMenu.addSeparator();
		JMenuItem productEditItem = new JMenuItem("Edit Product");
		productMenu.add(productEditItem);
		JMenuItem categoryEditItem = new JMenuItem("Edit Category");
		productMenu.add(categoryEditItem);
		
		return bar;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
