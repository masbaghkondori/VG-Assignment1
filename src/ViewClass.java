
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

public class ViewClass {
	File f = new File("");
	PlayerMethods pMethods=new PlayerMethods();
//	private JFileChooser fc=new JFileChooser();
	private MP3Player player = new MP3Player(new File(""));
	private JFrame frmMyMusicPlayer;
	private JTextField textField;
	
	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayerGui window = new MusicPlayerGui();
					window.frmMyMusicPlayer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the application.
	 */
	public ViewClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
/*		List list = new List();
//		MP3Player player = new MP3Player();*/
//		player.addToPlayList(new File("C:\\Users\\mohbes\\Desktop\\playlist\\Rihanna - Only Girl (In The World).mp3"));
//	    player.addToPlayList(new File("C:\\Users\\mohbes\\Desktop\\playlist\\Phil Collins - Another Day In Paradise.mp3"));
//		player.addToPlayList(new File("C:\\Users\\mohbes\\Downloads\\Developers.mp3"));
		frmMyMusicPlayer = new JFrame();
		frmMyMusicPlayer.getContentPane().setBackground(new Color(34, 139, 34));
		frmMyMusicPlayer.setFont(new Font("Angsana New", Font.BOLD, 14));
		frmMyMusicPlayer.setTitle("My Music Player");
		frmMyMusicPlayer.setBounds(100, 100, 451, 194);
		frmMyMusicPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyMusicPlayer.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Open");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*player.stop();
				int returnVal=fc.showOpenDialog(btnNewButton);
				if (returnVal==JFileChooser.APPROVE_OPTION){
					File f=fc.getSelectedFile();
					System.out.println(f.getAbsolutePath());
					player = new MP3Player(f);
					String name=f.getName();
					textField.setText(name);
					player.play();*/
				pMethods.open();
			}
	
			}
		);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(22, 85, 76, 25);
		frmMyMusicPlayer.getContentPane().add(btnNewButton);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
/*				list.getMp3Player.play();
*/
				
				pMethods.play();
				
			}
		});
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlay.setBounds(123, 85, 76, 25);
		frmMyMusicPlayer.getContentPane().add(btnPlay);
		
		JButton btnPause = new JButton("Pause");
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.pause();

			}
		});
		btnPause.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPause.setBounds(225, 85, 82, 25);
		frmMyMusicPlayer.getContentPane().add(btnPause);
		
		JButton btnStop = new JButton("Stop");
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
