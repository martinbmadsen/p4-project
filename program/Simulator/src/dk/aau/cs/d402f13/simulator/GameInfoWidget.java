package dk.aau.cs.d402f13.simulator;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


import dk.aau.cs.d402f13.helpers.ActionHelper;
import dk.aau.cs.d402f13.helpers.ResourceHelper;
import dk.aau.cs.d402f13.utilities.errors.SimulatorError;
import dk.aau.cs.d402f13.utilities.errors.StandardError;
import dk.aau.cs.d402f13.utilities.gameapi.Action;
import dk.aau.cs.d402f13.utilities.gameapi.Game;
import dk.aau.cs.d402f13.widgets.Label;
import dk.aau.cs.d402f13.widgets.ScaleContainer;
import dk.aau.cs.d402f13.widgets.ScrollContainer;

public class GameInfoWidget extends ScaleContainer {
	private Simulator game;
	private ScrollContainer historyList;
	
	private Label title;
	private Label player;
	
	GameInfoWidget( Simulator game ) throws StandardError{
		super( true );
		//We want to use the image dimensions as the size, however,
		//as an Image in Slick can't be loaded before an OpenGl context
		//have been set up, the size is hard-coded here.
		//We could override the getMin/Max() methods, but that is ugly as well.
		setFixed( 386, 536 );
		
		setPadding( 50, 50, 50, 25 );
		
		this.game = game;
		
		//Add the objects, while keeping references to them
		addObject( title = new Label( "gtw", 26, game.getGame().getTitle() ) );
		addObject( player = new Label( "gtw", 16, "Player" ) );
		addObject( historyList = new ScrollContainer() );
	}
	
	@Override
	public void handleDraw( Graphics g ) throws StandardError, SimulatorError{
		Game game = this.game.getGame();
		//Draw side bar
		Image side = ResourceHelper.getImage( "img/book.png" );
		g.drawImage( side, 0, 0 );
		
		title.setString( game.getTitle() );
		player.setString( "Player: " + game.getCurrentPlayer().getName() );

		//Display Action history
		List<String> historyLines = new ArrayList<String>();
		for( Action a : game.getHistory() )
			historyLines.add( ActionHelper.humanReadable( game, a ) );
		historyList.setLines( historyLines );
	}
}
