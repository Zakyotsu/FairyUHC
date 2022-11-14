package fr.zakyotsu.fairyuhc.inventories;

import java.util.HashMap;
import java.util.List;

import fr.zakyotsu.fairyuhc.utils.Lang;
import fr.zakyotsu.fairyuhc.characters.CharacterEnum;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ClassInventory {

    public static HashMap<CharacterEnum, Integer> characterCounter = new HashMap<>();
    public static Inventory inv;

    private void initMap() {
        for(CharacterEnum type : CharacterEnum.values())
            characterCounter.put(type, 0);
    }

    public Inventory createInventory() {
        initMap();

        inv = Bukkit.createInventory(null, 54, Lang.getString(Lang.INV_CLASS_SELECTOR));

        ItemStack natsu = new ItemStack(Material.FIRE_CHARGE);
        ItemMeta natsuim = natsu.getItemMeta();
        natsuim.setDisplayName("§aNatsu");
        natsuim.setLore(List.of(String.valueOf(characterCounter.get(CharacterEnum.NATSU))));
        natsu.setItemMeta(natsuim);
        inv.setItem(1, natsu);

//        ItemStack erza = new ItemStack(Material.DIAMOND_CHESTPLATE);
//        ItemMeta erzaim = erza.getItemMeta();
//        erzaim.setDisplayName("§aErza");
//        erzaim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Erza.class))));
//        erza.setItemMeta(erzaim);
//        inv.setItem(2, erza);
//
//        ItemStack grey = new ItemStack(Material.PACKED_ICE);
//        ItemMeta greyim = grey.getItemMeta();
//        greyim.setDisplayName("§aGrey");
//        greyim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Grey.class))));
//        grey.setItemMeta(greyim);
//        inv.setItem(3, grey);
//
        ItemStack lucy = new ItemStack(Material.GOLDEN_PICKAXE);
        ItemMeta lucyim = lucy.getItemMeta();
        lucyim.setDisplayName("§aLucy");
        lucyim.setLore(List.of(String.valueOf(characterCounter.get(CharacterEnum.LUCY))));
        lucy.setItemMeta(lucyim);
        inv.setItem(4, lucy);
//
//        ItemStack happy = new ItemStack(Material.EGG);
//        ItemMeta happyim = happy.getItemMeta();
//        happyim.setDisplayName("§aHappy");
//        happyim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Happy.class))));
//        happy.setItemMeta(happyim);
//        inv.setItem(5, happy);
//
//        ItemStack wendy = new ItemStack(Material.POTION);
//        PotionMeta wendypm = (PotionMeta) wendy.getItemMeta();
//        wendypm.setMainEffect(PotionEffectType.HEAL);
//        wendypm.setDisplayName("§aWendy");
//        wendypm.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Wendy.class))));
//        wendy.setItemMeta(wendypm);
//        inv.setItem(6, wendy);
//
//        ItemStack gajeel = new ItemStack(Material.IRON_CHESTPLATE);
//        ItemMeta gajeelim = gajeel.getItemMeta();
//        gajeelim.setDisplayName("§aGajeel");
//        gajeelim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Gajeel.class))));
//        gajeel.setItemMeta(gajeelim);
//        inv.setItem(7, gajeel);
//
//        ItemStack carla = new ItemStack(Material.EYE_OF_ENDER);
//        ItemMeta carlaim = carla.getItemMeta();
//        carlaim.setDisplayName("§aCarla");
//        carlaim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Carla.class))));
//        carla.setItemMeta(carlaim);
//        inv.setItem(11, carla);
//
//        ItemStack mavis = new ItemStack(Material.TORCH);
//        ItemMeta mavisim = mavis.getItemMeta();
//        mavisim.setDisplayName("§aMavis");
//        mavisim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Mavis.class))));
//        mavis.setItemMeta(mavisim);
//        inv.setItem(12, mavis);
//
//        ItemStack luxus = new ItemStack(Material.BLAZE_ROD);
//        ItemMeta luxusim = luxus.getItemMeta();
//        luxusim.setDisplayName("§aLuxus");
//        luxusim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Luxus.class))));
//        luxus.setItemMeta(luxusim);
//        inv.setItem(14, luxus);
//
//        ItemStack jellal = new ItemStack(Material.POTION);
//        PotionMeta jellalpm = (PotionMeta) jellal.getItemMeta();
//        jellalpm.setMainEffect(PotionEffectType.REGENERATION);
//        jellalpm.setDisplayName("§aJellal");
//        jellalpm.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Jellal.class))));
//        jellal.setItemMeta(jellalpm);
//        inv.setItem(15, jellal);
//
//        ItemStack dmagicians = new ItemStack(Material.OBSIDIAN);
//        ItemMeta dmagiciansim = dmagicians.getItemMeta();
//        dmagiciansim.setDisplayName("§aDarkMagicians");
//        dmagiciansim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(DarkMagicians.class))));
//        dmagicians.setItemMeta(dmagiciansim);
//        inv.setItem(29, dmagicians);
//
//        ItemStack zero = new ItemStack(Material.GOLDEN_APPLE);
//        ItemMeta zeroim = zero.getItemMeta();
//        zeroim.setDisplayName("§aZero");
//        zeroim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Zero.class))));
//        zero.setItemMeta(zeroim);
//        inv.setItem(30, zero);
//
//        ItemStack cobra = new ItemStack(Material.BLACK_BED);
//        ItemMeta cobraim = cobra.getItemMeta();
//        cobraim.setDisplayName("§aCobra");
//        cobraim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Cobra.class))));
//        cobra.setItemMeta(cobraim);
//        inv.setItem(31, cobra);
//
//        ItemStack hades = new ItemStack(Material.ENDER_PEARL);
//        ItemMeta hadesim = hades.getItemMeta();
//        hadesim.setDisplayName("§aHades");
//        hadesim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Hades.class))));
//        hades.setItemMeta(hadesim);
//        inv.setItem(32, hades);
//
//        ItemStack mardgeer = new ItemStack(Material.POTION);
//        PotionMeta mardgeerpm = (PotionMeta) mardgeer.getItemMeta();
//        mardgeerpm.setMainEffect(PotionEffectType.INVISIBILITY);
//        mardgeerpm.setDisplayName("§aMardGeer");
//        mardgeerpm.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(MardGeer.class))));
//        mardgeer.setItemMeta(mardgeerpm);
//        inv.setItem(33, mardgeer);
//
//        ItemStack acnologia = new ItemStack(Material.GOLDEN_APPLE);
//        ItemMeta acnologiaim = acnologia.getItemMeta();
//        acnologiaim.setDisplayName("§aAcnologia");
//        acnologiaim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Acnologia.class))));
//        acnologia.setItemMeta(acnologiaim);
//        inv.setItem(48, acnologia);
//
//        ItemStack zeleph = new ItemStack(Material.BOOK);
//        ItemMeta zelephim = zeleph.getItemMeta();
//        zelephim.setDisplayName("§aZeleph");
//        zelephim.setLore(Arrays.asList("" + info.get(CharacterUtil.getInstance(Zeleph.class))));
//        zeleph.setItemMeta(zelephim);
//        inv.setItem(50, zeleph);

        return inv;
    }
}