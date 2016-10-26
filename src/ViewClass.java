
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import jaco.mp3.player.MP3Player;
import javax.swing.ImageIcon;

public class ViewClass {
	File f = new File("");
	private PlayerMethods pMethods=new PlayerMethods();
	private JFileChooser fc=new JFileChooser();
	private MP3Player player = new MP3Player(new File(""));
	private JFrame frmMyMusicPlayer;
	private JTextField textField;
	public ViewClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyMusicPlayer = new JFrame();
		frmMyMusicPlayer.getContentPane().setBackground(new Color(34, 139, 34));
		frmMyMusicPlayer.setFont(new Font("Angsana New", Font.BOLD, 14));
		frmMyMusicPlayer.setTitle("My Music Player");
		frmMyMusicPlayer.setBounds(100, 100, 451, 194);
		frmMyMusicPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyMusicPlayer.getContentPane().setLayout(null);
		
//		JButton btnNewButton = new JButton("Open");
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\mohbes\\workspace\\VG-Assignment1\\Icon\\openp.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				player.stop();

				int returnVal=fc.showOpenDialog(btnNewButton);
				if (returnVal==JFileChooser.APPROVE_OPTION){
					File f=fc.getSelectedFile();
					player = new MP3Player(f);
					pMethods.stop();

					pMethods.setPlayer(player);
					
					String name=f.getName();
					textField.setText(name);

					pMethods.play();
			}
	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(12, 85, 76, 25);
		frmMyMusicPlayer.getContentPane().add(btnNewButton);
		
//		JButton btnPlay = new JButton("Play");
		JButton btnPlay = new JButton("");
		btnPlay.setIcon(new ImageIcon("C:\\Users\\mohbes\\workspace\\VG-Assignment1\\Icon\\playp.jpg"));
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
/*				list.getMp3Player.play();
*/
				pMethods.setPlayer(player);

				pMethods.play();
				
			}
		});
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlay.setBounds(123, 85, 76, 25);
		frmMyMusicPlayer.getContentPane().add(btnPlay);
		
//		JButton btnPause = new JButton("Pause");
		JButton btnPause = new JButton("");

		btnPause.setIcon(new ImageIcon("C:\\Users\\mohbes\\workspace\\VG-Assignment1\\Icon\\pausep.jpg"));

		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pMethods.pause();

			}
		});
		btnPause.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPause.setBounds(225, 85, 82, 25);
		frmMyMusicPlayer.getContentPane().add(btnPause);
		
		JButton btnStop = new JButton("");
		btnStop.setIcon(new ImageIcon("C:\\Users\\mohbes\\workspace\\VG-Assignment1\\Icon\\stopp.jpg"));

		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pMethods.stop();

				
			}
		});
		btnStop.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStop.setBounds(331, 85, 76, 25);
		frmMyMusicPlayer.getContentPane().add(btnStop);
		
		JLabel lblNewLabel = new JLabel("Music:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(32, 13, 66, 16);
		frmMyMusicPlayer.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(96, 12, 325, 22);
		frmMyMusicPlayer.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		frmMyMusicPlayer.setVisible(true);
	}
}
