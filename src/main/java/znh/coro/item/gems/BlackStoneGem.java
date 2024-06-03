package znh.coro.item.gems;

import io.github.apace100.origins.power.OriginsPowerTypes;
import io.github.apace100.origins.screen.OriginDisplayScreen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

// MAIN BLACK STONE GEM CLASS
public class BlackStoneGem extends Item {
    public BlackStoneGem(Settings settings) {
        super(settings);
    }

//    ON USE
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.sendMessage(Text.translatable("message.black_stone_gem.message_1"));
        return super.use(world, user, hand);
    }

//    USE ON ENTITY
    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        if (entity instanceof AnimalEntity) {
            // Slow Effect for hitting an animal entity with stone.
            user.sendMessage(Text.literal("Test message."));
            AnimalEntity animalEntity = (AnimalEntity)entity;
            animalEntity.canFreeze();
            animalEntity.setMovementSpeed(-10);
            animalEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 200));
        }
        return super.useOnEntity(stack, user, entity, hand);

        // NEXT?

    }

//    APPEND TOOLTIP
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.blank"));
        tooltip.add(Text.translatable("tooltip.black_stone_gem"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
