import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import jaco.mp3.player.MP3Player;

public class PlayerMethods implements PlayerInterface {
/*	MusicPlayerGui musicPlayerGui=new MusicPlayerGui();
*/
	ViewClass vClass=new ViewClass();
	File f = new File("");
	private JFileChooser fc=new JFileChooser();
	private MP3Player player = new MP3Player(new File(""));
	private JFrame frmMyMusicPlayer;
	private JTextField textField;
	private PlayerMethods(ViewClass vClass, File f, PlayerMethods pMethods, JFileChooser fc, MP3Player player,
			JFrame frmMyMusicPlayer, JTextField textField) {
		super();
		this.vClass = vClass;
		this.f = f;
		this.fc = fc;
		this.player = player;
		this.frmMyMusicPlayer = frmMyMusicPlayer;
		this.textField = textField;
	}

public  getMp3Player(){
	return this.player;
}


	@Override
	public void open() {
		player.stop();
		int returnVal=fc.showOpenDialog(vClass.btnNewButton);
		if (returnVal==JFileChooser.APPROVE_OPTION){
			File f=fc.getSelectedFile();
			System.out.println(f.getAbsolutePath());
			player = new MP3Player(f);
			String name=f.getName();
			textField.setText(name);
			player.play();		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		player.play();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	

}
