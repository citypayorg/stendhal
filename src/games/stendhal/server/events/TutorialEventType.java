package games.stendhal.server.events;

/**
 * Event types used in the tutorial
 *
 * @author hendrik
 */
public enum TutorialEventType {
	
	FIRST_LOGIN   ("Hi, welcome to Stendhal. You can move arround using the arrow keys."),
	FIRST_MOVE    ("Please walk south (down) to go out of this building into the city."),
	VISIT_SEMOS_CITY ("You should talk to Monogeneses by saying \"hi\". He has a white beard and is south west (down left) of here."),
	FIRST_ATTACKED ("Did you notice that creature walking towards you with the yellow square? It is attacking you."),
	FIRST_CREATURE_SEEN ("You can attack that creature by right clicking on it and choosing \"Attack\""),
	FIRST_KILL ("Double click on the Corpse and drag the items over your bag with the mouse and drop them there.");

	private String message = null;

	/**
	 * create a new TutorialEventType
	 * @param message human readable message
	 */
	private TutorialEventType(String message) {
		this.message = message;
	}

	/**
	 * get the descriptive message
	 * @return message
	 */
	String getMessage() {
		return message;
	}
}
