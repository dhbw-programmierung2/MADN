package board_package;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;


/**
 * 
 * @author jonas
 *
 */
public class Board_fourPlayers {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board_fourPlayers window = new Board_fourPlayers();
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
	public Board_fourPlayers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Mensch Ärgere dich nicht");
		
		JLabel  lblNewLabel = new JLabel("Mensch Ärgere dich nicht");
		Image img = new ImageIcon(this.getClass().getResource("/Spielfeld_für_vier.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
	//	lblNewLabel.setBounds(r);
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
