package znh.coro.datagen;

import io.github.apace100.origins.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import znh.coro.item.CoroItems;


public class CoroModelProvider extends FabricModelProvider {
    public CoroModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(CoroItems.BLACK_STONE_GEM, Models.GENERATED);
        itemModelGenerator.register(CoroItems.BLACK_STONE_SWORD, Models.HANDHELD);

    }
}
