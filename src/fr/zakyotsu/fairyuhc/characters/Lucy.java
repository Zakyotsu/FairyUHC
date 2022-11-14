package fr.zakyotsu.fairyuhc.characters;

public class Lucy extends DefaultCharacter {
    private static Lucy instance;


    public Lucy() {
        super(LUCY_NAME, CharacterEnum.LUCY);
        instance = this;
    }

    public static Lucy getInstance() {
        return instance == null ? (instance = new Lucy()) : instance;
    }

    //Lang
    public static final String LUCY_NAME = "Lucy";
    public static final String LUCY_DESC = "§6Tu es maintenant Lucy, tu peux changer d'esprit avec la commande /fuhc spirit chaque épisode";
    public static final String LUCY_LEO_ENABLED = "§cLéo t'a protégé(e) des dégâts de chute !";
    public static final String LUCY_SAGITTARIUS_ENABLED = "§cSagittarius t'offre sa force dans tes flèches !";
    public static final String LUCY_INV = "Sélecteur d'esprit";
    public static final String LUCY_DENY = "§cTu dois être Lucy pour faire ça, et tu ne peux le faire qu'une fois par épisode";
    public static final String LUCY_LEO = "§7Tu as ouvert la porte de Léo !";
    public static final String LUCY_LEO_INFO = "§cLéo te protègera des dégâts de chute";
    public static final String LUCY_AQUARIUS = "§7Tu as ouvert la porte d'Aquarius !";
    public static final String LUCY_AQUARIUS_INFO = "§cAquarius te donnera Respiration aquatique";
    public static final String LUCY_SAGITTARIUS = "§7Tu as ouvert la porte de Sagittarius !";
    public static final String LUCY_SAGITTARIUS_INFO = "§cSagittarius fera 1 coeur de dégâts en plus sur chaque flèche";
    public static final String LUCY_VIRGO = "§7Tu as ouvert la porte de Virgo !";
    public static final String LUCY_VIRGO_INFO = "§cVirgo te permettra de miner plus vite grâce à Célérité IV";
}
