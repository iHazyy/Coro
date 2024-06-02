package znh.coro.item.material;

import io.github.apace100.origins.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import znh.coro.item.CoroItems;

import java.util.function.Supplier;

public enum BlackStoneMaterial implements ToolMaterial {
    BLACK_STONE_MATERIAL(6, 1950, 7.5f, 6.5f,
            50, () -> Ingredient.ofItems(CoroItems.BLACK_STONE_GEM));


    BlackStoneMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
//        this.getMiningLevel = miningLevel;
//        this.itemDurability = itemDurability;
//        this.miningSpeed = miningSpeed;
//        this.attackDamage = attckDamage;
//        this.enchantability = enchantability;
//        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
