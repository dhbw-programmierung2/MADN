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
public class Board_sixPlayers {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board_sixPlayers window = new Board_sixPlayers();
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
	public Board_sixPlayers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Mensch ärgere dich nicht");

		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Spielfeld_fÜr_sechs.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
	//	lblNewLabel.setBounds(r);
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
