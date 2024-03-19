package tr.com.ih.utilities;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenusCom {

	public static JMenuBar initBar() {
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

	
}
