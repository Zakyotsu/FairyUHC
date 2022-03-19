package fr.zakyotsu.fairyuhc;

public enum Lang {
	START_TITLE_TITLE ("§6Lancement dans"),
	START_TITLE_SUBTITLE ("§c %counter §6%s !"),
	EPISODE_TITLE_TITLE ("§6Episode §cn°%ep §6!"),
	EPISODE_TITLE_SUBTITLE (""),
	DEAD_MSG ("§6%p §7est mort, il était §8%t §7!"),
	BORDER_REDUCE ("§cRéduction de la bordure de " + Variables.BORDER_SIZE_REDUCE + " blocs sur " + Variables.BORDER_REDUCE_TIME / 60 + " min."),
	BORDER_MSG ("A l'épisode " + Variables.BORDER_TRIGGER_EP + ", la bordure se réduira de " + Variables.BORDER_SIZE_REDUCE + " blocs chaque épisode"),
	START_MSG ("§cLancement du Fairy UHC !"),
	WIN_MSG ("§cremporte la partie !!"),
	GAME_NOT_STARTED ("§cLa partie n'a pas encore démarré."),
	PLAYER_NOT_FOUND ("§cLe joueur est introuvable."),
	PLAYER_JOIN ("%p a rejoint le Fairy UHC (%s/20) !"),
	PLAYER_LEAVE("%p a quitté le Fairy UHC :( (%s/20)"),
	INV_NAME ("Sélecteur classes"),
	POTIONS_FORBIDDEN ("§cPotions non autorisées."),
	COMPASS_TRACKER ("%t §6est à %d blocs !"),
	
	//Revive cmd
	NO_RES_AFTER_EP_1 ("§cPas de revive possible après l'épisode 1."),
	RES_DONE ("§cLe joueur %t à été réssuscité de force par %p !"),
	REVIVE_INV ("Sélecteur revive"),
	
	//Team cmd
	JOIN_TEAM ("Le joueur a bien rejoint l'équipe"),
	QUIT_TEAM ("Le joueur a bien quitté l'équipe"),
	
	//Cobra
	COBRA_DESC ("§6Tu es maintenant Cobra, à chaque flèche touchée, tu met Poison à ton adversaire pendant 3 sec."),
	COBRA_POISON_INFO ("§c%t est empoisonné"),
	COBRA_POISON_INFO_VICTIM ("§cLa flèche de %p est empoisonnée"),
	
	//Dark Magicians
	DARKMAGICIANS_DESC ("§6Tu es maintenant un magicien noir, tu gagnes Force I et Vision nocturne la nuit."),
	DARKMAGICIANS_NIGHT ("§cBooh, il fait nuit tu obtiens Force I et Vision nocturne !"),
	
	//Hades
	HADES_DESC ("§6Tu es maintenant Hadès, tu peux lancer l'oeil de l'end pour gagner Force I et Résistance I"),
	HADES_ITEM_NAME ("§aL'oeil du démon"),
	HADES_ITEM_INFO ("Lance le pour activer tes pouvoirs"),
	HADES_ABILITY_ENABLED ("§cTes pouvoirs ont bien été activés"),
	
	//Mard Geer
	MARDGEER_DESC ("§6Tu es maintenant Mard Geer, tu obtiens Vision Nocturne et Invisibilité la nuit."),
	MARDGEER_NIGHT ("§cIl fait nuit, tu deviens invisible et tu vois la nuit tel un chat"),
	
	//Zero
	ZERO_DESC ("§6Tu es maintenant Zéro, tu obtiens 1 coeur de vie en plus à chaque kill."),
	ZERO_KILL ("§cTu as gagné 1 coeur pour ce kill !"),
	
	
	//Carla
	CARLA_DESC ("§6Tu es maintenant Carla, tu pourras voir la classe d'un joueur chaque épisode avec /fuhc reveal et chercher Wendy avec la boussole."),
	CARLA_INV ("Sélecteur reveal"),
	CARLA_CMD ("/fuhc reveal : §aPermet de voir la classe d'un joueur"),
	CARLA_DENY ("§cTu dois être Carla pour faire ça, et tu ne peux le faire qu'une fois par épisode !"),
	CARLA_SEE_MSG ("Le joueur §6%p §7est §8%t §7!"),
	
	//Erza
	ERZA_DESC ("§6Tu es maintenant Erza, tu reçois un livre Tranchant III et un livre Protection III."),
	
	//Gajeel
	GAJEEL_DESC ("§6Tu es maintenant Gajeel, tu reçois un livre Protection II et Épines I et l'effet Résistance I."),
	
	//Grey
	GREY_DESC ("§6Tu es maintenant Grey, tu reçois un livre Frost Walker I et l'effet Résistance I."),
	
	//Happy
	HAPPY_DESC ("§6Tu es maintenant Happy, tu peux savoir le nom et le rôle de la personne qui tuera Natsu, et tu reçois une boussole pour retrouver Natsu."),
	HAPPY_ABILITY ("Natsu est mort de la main de §6%k§7, qui est §c%kr §7!"),
	
	//Jellal
	JELLAL_DESC ("§6Tu es maintenant Jellal, tu obtiens Vitesse I."),
	
	//Lucy
	LUCY_DESC ("§6Tu es maintenant Lucy, tu peux changer d'esprit avec la commande /fuhc spirit chaque épisode"),
	LUCY_LEO_ENABLED ("§cLéo t'a protégé(e) des dégâts de chute !"),
	LUCY_SAGITTARIUS_ENABLED ("§cSagittarius t'offre sa force dans tes flèches !"),
	LUCY_INV ("Sélecteur d'esprit"),
	LUCY_DENY ("§cTu dois être Lucy pour faire ça, et tu ne peux le faire qu'une fois par épisode"),
	LUCY_LEO ("§7Tu as ouvert la porte de Léo !"),
	LUCY_LEO_INFO("§cLéo te protègera des dégâts de chute"),
	LUCY_AQUARIUS ("§7Tu as ouvert la porte d'Aquarius !"),
	LUCY_AQUARIUS_INFO("§cAquarius te donnera Respiration aquatique"),
	LUCY_SAGITTARIUS ("§7Tu as ouvert la porte de Sagittarius !"),
	LUCY_SAGITTARIUS_INFO("§cSagittarius fera 1 coeur de dégâts en plus sur chaque flèche"),
	LUCY_VIRGO ("§7Tu as ouvert la porte de Virgo !"),
	LUCY_VIRGO_INFO("§cVirgo te permettra de miner plus vite grâce à Célérité IV"),
	
	//Luxus
	LUXUS_DESC ("§6Tu es maintenant Luxus, tu peux envoyer un éclair sur quelqu'un en faisant /fuhc lightning chaque épisode."),
	LIGHTNING_DONE ("§cLuxus t'a frappé avec son éclair"),
	LUXUS_CMD ("/fuhc lightning [player]"),
	LUXUS_DENIED ("§cTu dois être Luxus pour faire ça, et tu ne peux le faire qu'une fois par épisode."),

	//Mavis
	MAVIS_DESC ("§6Tu es maintenant Mavis, tu peux ressusciter une personne (1 seule fois dans la game)."),
	MAVIS_INV ("Sélecteur de Law"),
	MAVIS_DENY ("§cTu dois être Mavis pour faire ça, et tu ne peux le faire qu'une fois par game !"),
	MAVIS_NO_PLAYERS_TO_RES ("§cPas de joueurs à réanimer."),
	MAVIS_RES ("Psst, le joueur §6%p §7a été réssuscité par §8Mavis §7:O"),
	
	//Natsu
	NATSU_DESC ("§6Tu es maintenant Natsu, tu reçois un livre Aura de feu I et un effet Résistance au feu ainsi qu'une boussole afin de retrouver Happy."),
	NATSU_STRENGTH ("§cHappy est mort, Natsu devient enragé, attention !!"),
	
	//Wendy
	WENDY_DESC ("§6Tu es maintenant Wendy, tu reçois l'effet Régénération I, et tu peux rechercher Carla avec la boussole."),
	
	//Acnologia
	ACNOLOGIA_DESC ("§6Tu es maintenant Acnologia, tu as deux barres de coeurs."),
	
	
	//Zeleph
	ZELEPH_DESC ("§6Tu es maintenant Zeleph, tu peux améliorer une épée en la craftant."),
	ZELEPH_DONE ("§cEpée améliorée avec ton pouvoir !"),
	ZELEPH_ENCHANT ("Executioner"),
	ZELEPH_SWORD_POISONED ("§cL'épée de Zeleph est empoisonnée !"),
	
	//Help cmd
	HELP_START ("/fuhc start: §aLance la game"),
	HELP_STOP ("/fuhc stop: §aStoppe la game"),
	HELP_LIST ("/fuhc list: §aPermet de voir les joueurs morts ou les joueurs encore en vie"),
	HELP_SEE ("/fuhc reveal: §aPermet à Carla de voir le rôle d'un joueur"),
	HELP_LAW ("/fuhc law: §aPermet à Mavis de réssusciter quelqu'un"),
	HELP_THUNDER ("/fuhc lightning: §aPermet à Luxus d'envoyer un éclair sur un joueur"),
	HELP_SPIRIT ("/fuhc spirit: §aPermet à Lucy de changer d'esprit"),
	HELP_SETCLASS ("/fuhc class: §aPermet de configurer les classes disponibles"),
	
	//Cmd related
	NOT_ALLOWED ("§cTu dois être un joueur et avoir des droits opérateurs pour effectuer cette commande."),
	CLASSES_NOT_EQUALS ("§cLe nombre de classes sélectionnées ne correspond pas au nombre de joueurs connectés."),
	PLAYER_STOPPED_GAME ("§cLe joueur %p a stoppé la partie."),
	PLAYERS_ALIVE_NB ("Il y a %s joueurs en vie :"),
	PLAYERS_DEAD_NB ("Il y a %s joueurs morts :"),
	PLAYERS_EVIL_NB ("Il y a %s joueurs méchants :"),
	
	//Events related
	BLOCK_PLACE_DENIED ("§cNe pose pas de blocs vilain petit couscous !"),
	BLOCK_BREAK_DENIED ("§cNe casse pas de blocs vilain petit couscous !"),
	PVP_DENIED ("§cNe frappe pas ce gentil minecraftien, méchant va !"),
	
	SC_PLAYERS_ALIVE ("§7%p joueurs en vie");
	
	public static String HEADER = "§7[§aFairyUHC§7] ";
	
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