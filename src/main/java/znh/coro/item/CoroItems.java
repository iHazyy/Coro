package znh.coro.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import znh.coro.Coro;
import znh.coro.item.gems.BlackStoneGem;
import znh.coro.item.material.BlackStoneMaterial;
import znh.coro.item.swords.BlackStoneSword;

/*

░█████╗░░█████╗░██████╗░░█████╗░
██╔══██╗██╔══██╗██╔══██╗██╔══██╗
██║░░╚═╝██║░░██║██████╔╝██║░░██║
██║░░██╗██║░░██║██╔══██╗██║░░██║
╚█████╔╝╚█████╔╝██║░░██║╚█████╔╝
░╚════╝░░╚════╝░╚═╝░░╚═╝░╚════╝░
A Oʀɪɢɪɴs Mᴏᴅ Aᴅᴅᴏɴ

Curators:
	-ZNH.Hazy

 */
public class CoroItems {

    // Black Stone Gem
    public static final Item BLACK_STONE_GEM = registerItem("black_stone_gem",
            new BlackStoneGem(new FabricItemSettings()));


    // Black Stone Sword
    public static final Item BLACK_STONE_SWORD = registerItem("black_stone_sword",
            new BlackStoneSword(BlackStoneMaterial.BLACK_STONE_MATERIAL, -1, 3f,
                    new FabricItemSettings().maxCount(1)));



//    ADD MATERIAL TO INGREDIENTS TAB
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLACK_STONE_GEM);
    }



//    Easy Method that can be called to register items more efficiently.
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Coro.modId, name), item);
    }

//    Method to call in the Main Mod Class for Registering Mod Items.
    public static void RegisterCoro() {
        Coro.LOGGER.info("-- REGISTERED CORO ITEMS --");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(CoroItems::addItemsToIngredientTabItemGroup);
    }

}
