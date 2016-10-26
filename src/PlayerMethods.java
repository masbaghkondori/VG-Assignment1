import java.io.File;

import jaco.mp3.player.MP3Player;

public class PlayerMethods implements PlayerInterface {
//	ViewClass vClass=new ViewClass();
//	File f = new File("");
//	private JFileChooser fc=new JFileChooser();
	private MP3Player player = new MP3Player(new File(""));
	/*private JFrame frmMyMusicPlayer;
	private JTextField textField;*/
	
	/*private PlayerMethods(ViewClass vClass, File f, PlayerMethods pMethods, JFileChooser fc, MP3Player player,
			JFrame frmMyMusicPlayer, JTextField textField) {
		super();
		this.vClass = vClass;
		this.f = f;
		this.fc = fc;
		this.player = player;
		this.frmMyMusicPlayer = frmMyMusicPlayer;
		this.textField = textField;
	}*/

/*public PlayerMethods() {
		// TODO Auto-generated constructor stub
	}

public MP3Player getPlayer() {
	return player;
}

public void setPlayer(MP3Player player) {
	this.player = player;
}

public  MP3Player getMP3Player(){
	return player;
}

public  void setMP3Player(MP3Player player){
	this.player=player;
}*/

	public MP3Player getPlayer() {
		return player;
	}

	public void setPlayer(MP3Player player) {
		this.player = player;
	}
	
	@Override
	public void open() {
		
			player.play();
			return;
	}

	

	@Override
	public void play() {
		// TODO Auto-generated method stub
		player.play();
		return;	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		player.pause();
		return;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		player.stop();
		return;
	}
	

}
