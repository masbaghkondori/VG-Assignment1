package com.AssignmentVG1.methods;

import java.io.File;
import com.AssignmentVG1.interfaces.PlayerInterface;
import jaco.mp3.player.MP3Player;

/***
 * 
 * @author Masoomeh Baghban'
 * 
 * @version 1.0
 * 
 *          class PlayerMethods is a class which implements methods in
 *          'PlayerInterface'.
 *          
 * 
 */

public class PlayerMethods implements PlayerInterface {

	private MP3Player player = new MP3Player(new File(""));

	/***
	 * setter and getter to assign a value to player which is an attribute in type of MP3Player.
	 * 
	 * @param player
	 */
	public void setPlayer(MP3Player player) {
		this.player = player;
	}

	public MP3Player getPlayer() {
		return player;
	}

	/***
	 * A method to open a browser to select MP3 music and then play it.
	 */
	@Override
	public void open() {
		player.play();
		return;
	}

	/***
	 * 'Play method' plays a MP3 music which already selected.
	 */
	@Override
	public void play() {
		player.play();
		return;
	}

	/***
	 * 'Pause method' pauses the MP3 music which is playing, if we use button
	 * 'play', the music will continue from the 'pause point' of the music.
	 */
	@Override
	public void pause() {
		player.pause();
		return;
	}

	/***
	 * 'stop method' stops the MP3 music which is playing, if we use button 'play',
	 * the last music will start again from the beginning.
	 */
	@Override
	public void stop() {
		player.stop();
		return;
	}
}
