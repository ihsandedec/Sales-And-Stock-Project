package tr.com.ih.test;

import javax.swing.SwingUtilities;

import tr.com.ih.fe.MainWindowFE;

public class Run {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MainWindowFE();
				
			}
		});

	}

}
