package znh.coro;

import io.github.apace100.origins.Origins;
import io.github.apace100.origins.power.OriginsPowerTypes;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import znh.coro.item.CoroItemGroups;
import znh.coro.item.CoroItems;

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
public class Coro implements ModInitializer {

	// MOD ID
	public static final String modId = "coro";
	// LOGGER
    public static final Logger LOGGER = LoggerFactory.getLogger(modId);

	// ON START MESSAGE
	@Override
	public void onInitialize() {
		LOGGER.info("\n\n" +
				"░█████╗░░█████╗░██████╗░░█████╗░\n" +
				"██╔══██╗██╔══██╗██╔══██╗██╔══██╗\n" +
				"██║░░╚═╝██║░░██║██████╔╝██║░░██║\n" +
				"██║░░██╗██║░░██║██╔══██╗██║░░██║\n" +
				"╚█████╔╝╚█████╔╝██║░░██║╚█████╔╝\n" +
				"░╚════╝░░╚════╝░╚═╝░░╚═╝░╚════╝░" + "\n" +
				"A Oʀɪɢɪɴs Mᴏᴅ Aᴅᴅᴏɴ - has initialized." + "\n");


		CoroItems.RegisterCoro();
		CoroItemGroups.RegisterCoro();
	}
}