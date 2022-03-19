package fr.zakyotsu.fairyuhc;

public enum Lang {
	START_TITLE_TITLE ("�6Lancement dans"),
	START_TITLE_SUBTITLE ("�c %counter �6%s !"),
	EPISODE_TITLE_TITLE ("�6Episode �cn�%ep �6!"),
	EPISODE_TITLE_SUBTITLE (""),
	DEAD_MSG ("�6%p �7est mort, il �tait �8%t �7!"),
	BORDER_REDUCE ("�cR�duction de la bordure de " + Variables.BORDER_SIZE_REDUCE + " blocs sur " + Variables.BORDER_REDUCE_TIME / 60 + " min."),
	BORDER_MSG ("A l'�pisode " + Variables.BORDER_TRIGGER_EP + ", la bordure se r�duira de " + Variables.BORDER_SIZE_REDUCE + " blocs chaque �pisode"),
	START_MSG ("�cLancement du Fairy UHC !"),
	WIN_MSG ("�cremporte la partie !!"),
	GAME_NOT_STARTED ("�cLa partie n'a pas encore d�marr�."),
	PLAYER_NOT_FOUND ("�cLe joueur est introuvable."),
	PLAYER_JOIN ("%p a rejoint le Fairy UHC (%s/20) !"),
	PLAYER_LEAVE("%p a quitt� le Fairy UHC :( (%s/20)"),
	INV_NAME ("S�lecteur classes"),
	POTIONS_FORBIDDEN ("�cPotions non autoris�es."),
	COMPASS_TRACKER ("%t �6est � %d blocs !"),
	
	//Revive cmd
	NO_RES_AFTER_EP_1 ("�cPas de revive possible apr�s l'�pisode 1."),
	RES_DONE ("�cLe joueur %t � �t� r�ssuscit� de force par %p !"),
	REVIVE_INV ("S�lecteur revive"),
	
	//Team cmd
	JOIN_TEAM ("Le joueur a bien rejoint l'�quipe"),
	QUIT_TEAM ("Le joueur a bien quitt� l'�quipe"),
	
	//Cobra
	COBRA_DESC ("�6Tu es maintenant Cobra, � chaque fl�che touch�e, tu met Poison � ton adversaire pendant 3 sec."),
	COBRA_POISON_INFO ("�c%t est empoisonn�"),
	COBRA_POISON_INFO_VICTIM ("�cLa fl�che de %p est empoisonn�e"),
	
	//Dark Magicians
	DARKMAGICIANS_DESC ("�6Tu es maintenant un magicien noir, tu gagnes Force I et Vision nocturne la nuit."),
	DARKMAGICIANS_NIGHT ("�cBooh, il fait nuit tu obtiens Force I et Vision nocturne !"),
	
	//Hades
	HADES_DESC ("�6Tu es maintenant Had�s, tu peux lancer l'oeil de l'end pour gagner Force I et R�sistance I"),
	HADES_ITEM_NAME ("�aL'oeil du d�mon"),
	HADES_ITEM_INFO ("Lance le pour activer tes pouvoirs"),
	HADES_ABILITY_ENABLED ("�cTes pouvoirs ont bien �t� activ�s"),
	
	//Mard Geer
	MARDGEER_DESC ("�6Tu es maintenant Mard Geer, tu obtiens Vision Nocturne et Invisibilit� la nuit."),
	MARDGEER_NIGHT ("�cIl fait nuit, tu deviens invisible et tu vois la nuit tel un chat"),
	
	//Zero
	ZERO_DESC ("�6Tu es maintenant Z�ro, tu obtiens 1 coeur de vie en plus � chaque kill."),
	ZERO_KILL ("�cTu as gagn� 1 coeur pour ce kill !"),
	
	
	//Carla
	CARLA_DESC ("�6Tu es maintenant Carla, tu pourras voir la classe d'un joueur chaque �pisode avec /fuhc reveal et chercher Wendy avec la boussole."),
	CARLA_INV ("S�lecteur reveal"),
	CARLA_CMD ("/fuhc reveal : �aPermet de voir la classe d'un joueur"),
	CARLA_DENY ("�cTu dois �tre Carla pour faire �a, et tu ne peux le faire qu'une fois par �pisode !"),
	CARLA_SEE_MSG ("Le joueur �6%p �7est �8%t �7!"),
	
	//Erza
	ERZA_DESC ("�6Tu es maintenant Erza, tu re�ois un livre Tranchant III et un livre Protection III."),
	
	//Gajeel
	GAJEEL_DESC ("�6Tu es maintenant Gajeel, tu re�ois un livre Protection II et �pines I et l'effet R�sistance I."),
	
	//Grey
	GREY_DESC ("�6Tu es maintenant Grey, tu re�ois un livre Frost Walker I et l'effet R�sistance I."),
	
	//Happy
	HAPPY_DESC ("�6Tu es maintenant Happy, tu peux savoir le nom et le r�le de la personne qui tuera Natsu, et tu re�ois une boussole pour retrouver Natsu."),
	HAPPY_ABILITY ("Natsu est mort de la main de �6%k�7, qui est �c%kr �7!"),
	
	//Jellal
	JELLAL_DESC ("�6Tu es maintenant Jellal, tu obtiens Vitesse I."),
	
	//Lucy
	LUCY_DESC ("�6Tu es maintenant Lucy, tu peux changer d'esprit avec la commande /fuhc spirit chaque �pisode"),
	LUCY_LEO_ENABLED ("�cL�o t'a prot�g�(e) des d�g�ts de chute !"),
	LUCY_SAGITTARIUS_ENABLED ("�cSagittarius t'offre sa force dans tes fl�ches !"),
	LUCY_INV ("S�lecteur d'esprit"),
	LUCY_DENY ("�cTu dois �tre Lucy pour faire �a, et tu ne peux le faire qu'une fois par �pisode"),
	LUCY_LEO ("�7Tu as ouvert la porte de L�o !"),
	LUCY_LEO_INFO("�cL�o te prot�gera des d�g�ts de chute"),
	LUCY_AQUARIUS ("�7Tu as ouvert la porte d'Aquarius !"),
	LUCY_AQUARIUS_INFO("�cAquarius te donnera Respiration aquatique"),
	LUCY_SAGITTARIUS ("�7Tu as ouvert la porte de Sagittarius !"),
	LUCY_SAGITTARIUS_INFO("�cSagittarius fera 1 coeur de d�g�ts en plus sur chaque fl�che"),
	LUCY_VIRGO ("�7Tu as ouvert la porte de Virgo !"),
	LUCY_VIRGO_INFO("�cVirgo te permettra de miner plus vite gr�ce � C�l�rit� IV"),
	
	//Luxus
	LUXUS_DESC ("�6Tu es maintenant Luxus, tu peux envoyer un �clair sur quelqu'un en faisant /fuhc lightning chaque �pisode."),
	LIGHTNING_DONE ("�cLuxus t'a frapp� avec son �clair"),
	LUXUS_CMD ("/fuhc lightning [player]"),
	LUXUS_DENIED ("�cTu dois �tre Luxus pour faire �a, et tu ne peux le faire qu'une fois par �pisode."),

	//Mavis
	MAVIS_DESC ("�6Tu es maintenant Mavis, tu peux ressusciter une personne (1 seule fois dans la game)."),
	MAVIS_INV ("S�lecteur de Law"),
	MAVIS_DENY ("�cTu dois �tre Mavis pour faire �a, et tu ne peux le faire qu'une fois par game !"),
	MAVIS_NO_PLAYERS_TO_RES ("�cPas de joueurs � r�animer."),
	MAVIS_RES ("Psst, le joueur �6%p �7a �t� r�ssuscit� par �8Mavis �7:O"),
	
	//Natsu
	NATSU_DESC ("�6Tu es maintenant Natsu, tu re�ois un livre Aura de feu I et un effet R�sistance au feu ainsi qu'une boussole afin de retrouver Happy."),
	NATSU_STRENGTH ("�cHappy est mort, Natsu devient enrag�, attention !!"),
	
	//Wendy
	WENDY_DESC ("�6Tu es maintenant Wendy, tu re�ois l'effet R�g�n�ration I, et tu peux rechercher Carla avec la boussole."),
	
	//Acnologia
	ACNOLOGIA_DESC ("�6Tu es maintenant Acnologia, tu as deux barres de coeurs."),
	
	
	//Zeleph
	ZELEPH_DESC ("�6Tu es maintenant Zeleph, tu peux am�liorer une �p�e en la craftant."),
	ZELEPH_DONE ("�cEp�e am�lior�e avec ton pouvoir !"),
	ZELEPH_ENCHANT ("Executioner"),
	ZELEPH_SWORD_POISONED ("�cL'�p�e de Zeleph est empoisonn�e !"),
	
	//Help cmd
	HELP_START ("/fuhc start: �aLance la game"),
	HELP_STOP ("/fuhc stop: �aStoppe la game"),
	HELP_LIST ("/fuhc list: �aPermet de voir les joueurs morts ou les joueurs encore en vie"),
	HELP_SEE ("/fuhc reveal: �aPermet � Carla de voir le r�le d'un joueur"),
	HELP_LAW ("/fuhc law: �aPermet � Mavis de r�ssusciter quelqu'un"),
	HELP_THUNDER ("/fuhc lightning: �aPermet � Luxus d'envoyer un �clair sur un joueur"),
	HELP_SPIRIT ("/fuhc spirit: �aPermet � Lucy de changer d'esprit"),
	HELP_SETCLASS ("/fuhc class: �aPermet de configurer les classes disponibles"),
	
	//Cmd related
	NOT_ALLOWED ("�cTu dois �tre un joueur et avoir des droits op�rateurs pour effectuer cette commande."),
	CLASSES_NOT_EQUALS ("�cLe nombre de classes s�lectionn�es ne correspond pas au nombre de joueurs connect�s."),
	PLAYER_STOPPED_GAME ("�cLe joueur %p a stopp� la partie."),
	PLAYERS_ALIVE_NB ("Il y a %s joueurs en vie :"),
	PLAYERS_DEAD_NB ("Il y a %s joueurs morts :"),
	PLAYERS_EVIL_NB ("Il y a %s joueurs m�chants :"),
	
	//Events related
	BLOCK_PLACE_DENIED ("�cNe pose pas de blocs vilain petit couscous !"),
	BLOCK_BREAK_DENIED ("�cNe casse pas de blocs vilain petit couscous !"),
	PVP_DENIED ("�cNe frappe pas ce gentil minecraftien, m�chant va !"),
	
	SC_PLAYERS_ALIVE ("�7%p joueurs en vie");
	
	public static String HEADER = "�7[�aFairyUHC�7] ";
	
	private String s = "";
	private Lang(String s) {
		this.s = s;
	}
	
	public static String getString(Lang l) {
		return l.getString();
	}
	private String getString() {
		return HEADER + s;
	}

	public static String getSimpleString(Lang l) {
		return l.getSimpleString();
	}
	private String getSimpleString() {
		return s;
	}
}