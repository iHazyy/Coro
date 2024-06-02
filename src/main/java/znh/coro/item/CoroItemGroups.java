package znh.coro.item;

import io.github.apace100.origins.registry.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import znh.coro.Coro;


public class CoroItemGroups {

    public static final ItemGroup CORO = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Coro.modId, "coro"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.coro"))
                    .icon(() -> new ItemStack(CoroItems.BLACK_STONE_GEM)).entries(((displayContext, entries) -> {
                        // Items in here
                    entries.add(CoroItems.BLACK_STONE_GEM);

                    })).build());

    public static void RegisterCoro(){
        Coro.LOGGER.info("Registering Coro Item Groups.");
    }

}
