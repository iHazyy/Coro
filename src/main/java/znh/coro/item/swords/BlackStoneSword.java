package znh.coro.item.swords;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import znh.coro.item.material.BlackStoneMaterial;

import java.util.List;

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

// Black Stone Sword Class
public class BlackStoneSword extends SwordItem implements Vanishable {

    // Super
    // Passing in Black Stone Material
    public BlackStoneSword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(BlackStoneMaterial.BLACK_STONE_MATERIAL, -1, 3f, settings);
    }

    // Sword Tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.blank"));
        tooltip.add(Text.translatable("tooltip.black_stone_sword"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    // USE ON ENTITY
    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        return super.useOnEntity(stack, user, entity, hand);
    }


    // USE ON BLOCK
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return super.useOnBlock(context);
    }
}
