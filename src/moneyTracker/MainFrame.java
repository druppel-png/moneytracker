package moneyTracker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBounds(10, 427, 89, 23);
		frame.getContentPane().add(btnImport);
		
		JButton btnExport = new JButton("Export");
		btnExport.setBounds(109, 427, 89, 23);
		frame.getContentPane().add(btnExport);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(208, 427, 89, 23);
		frame.getContentPane().add(btnSave);
	}
}
