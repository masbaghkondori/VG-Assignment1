package com.AssignmentVG1.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.AssignmentVG1.methods.PlayerMethods;

import jaco.mp3.player.MP3Player;

/**
 * 
 * Class ViewClass for creating the GUI
 * 
 * 
 * @author Masoomeh Baghban
 * @version 1.0
 **/

public class ViewClass implements ActionListener{
	private File f = new File("");
	private PlayerMethods pMethods = new PlayerMethods();
	private JFileChooser fc = new JFileChooser();
	
	private MP3Player player = new MP3Player(new File(""));
	private JFrame frmMyMusicPlayer;
	private JTextField textField;
	private JButton btnOpen = new JButton("");
	private JButton btnPlay = new JButton("");
	private JButton btnPause = new JButton("");
	private JButton btnStop = new JButton("");
	JLabel lblNewLabel = new JLabel("Music:");
	/**
	 * Constructor of the ViewClass that invokes the method 'initialize()';

	 * 
	 * @param none
	 * @return none
	 */
	
	public ViewClass() {
		initialize();
		addComponentToForm();
		addActionListerners();

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

		/***
		 * creating buttons and assigning image to them
		 */
//		JButton btnOpen = new JButton();
		btnOpen.setIcon(new ImageIcon("C:\\Users\\mohbes\\workspace\\VG-Assignment1\\Icon\\openp.jpg"));
		btnOpen.setBounds(12, 85, 76, 25);
		
//		JButton btnPlay = new JButton();
		btnPlay.setIcon(new ImageIcon("C:\\Users\\mohbes\\workspace\\VG-Assignment1\\Icon\\playp.jpg"));	
		btnPlay.setBounds(123, 85, 76, 25);

//		JButton btnPause = new JButton();
		btnPause.setIcon(new ImageIcon("C:\\Users\\mohbes\\workspace\\VG-Assignment1\\Icon\\pausep.jpg"));
		btnPause.setBounds(225, 85, 82, 25);
		
//		JButton btnStop = new JButton();
		btnStop.setIcon(new ImageIcon("C:\\Users\\mohbes\\workspace\\VG-Assignment1\\Icon\\stopp.jpg"));
		btnStop.setBounds(331, 85, 76, 25);
		/***
		 * This part creates a label
		 */
		//JLabel lblNewLabel = new JLabel("Music:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(32, 13, 66, 16);
		/***
		 * This part creates a TextField to show the music name
		 */
		textField = new JTextField();
		textField.setBounds(96, 12, 325, 22);
		frmMyMusicPlayer.getContentPane().add(textField);
		textField.setColumns(10);
		
		
	}
		/***
		 *  adding buttons, the label and textField to Frame
		 */

		public void addComponentToForm(){
			frmMyMusicPlayer.getContentPane().add(btnOpen);
			frmMyMusicPlayer.getContentPane().add(btnPlay);
			frmMyMusicPlayer.getContentPane().add(btnPause);
			frmMyMusicPlayer.getContentPane().add(btnStop);
			frmMyMusicPlayer.getContentPane().add(lblNewLabel);
			frmMyMusicPlayer.setVisible(true);
		}
		
		/**
		 * Method for adding the action listeners
		 * 
		 * @param none
		 * @return none
		 */
		public void addActionListerners(){			
			btnOpen.addActionListener(this) ;
			btnPlay.addActionListener(this);
			btnPause.addActionListener(this);
			btnStop.addActionListener(this);
		}
		
		/**
		 * Implementation of the action performed for handling the actions on the
		 * Mp3Player
		 * 
		 * @param e
		 * @return none
		 */
		public void actionPerformed(ActionEvent e) {
			
		/***
		 * in case you click on open and click on a music name
		 */

			if (e.getSource() == btnOpen) {
					int returnVal = fc.showOpenDialog(btnOpen);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						File f = fc.getSelectedFile();
						player = new MP3Player(f);
						pMethods.stop();
						btnStop.setBackground(Color.cyan);

						pMethods.setPlayer(player);
						String name = f.getName();
						textField.setText(name);
						pMethods.play();
						btnPlay.setBackground(Color.cyan);
					}
			}	
			/***
			 * in case you click on play, it will play the last music
			 *  which has been selected or paused/stopped
			 */	
			if (e.getSource() == btnPlay) {
				pMethods.setPlayer(player);
				pMethods.play();
/*				btnPlay.setBackground(Color.green);
*/			}

			/***
			 * in case you click on pause, it will pause the  music
			 *  which is playing
			 */	
			if (e.getSource() == btnPause ) {
				pMethods.pause();
				btnPlay.setBackground(Color.cyan);
				//btnPlay.setBackground();

			}
			/***
			 * in case you click on stop, it will stop the  music
			 *  which is playing
			 */	
			if (e.getSource() == btnStop ) {
				pMethods.stop();
				btnPlay.setBackground(Color.BLACK);
			}
			
		}
	
	}

