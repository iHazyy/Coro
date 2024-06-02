package znh.coro;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
		LOGGER.info("░█████╗░░█████╗░██████╗░░█████╗░\n" +
				"██╔══██╗██╔══██╗██╔══██╗██╔══██╗\n" +
				"██║░░╚═╝██║░░██║██████╔╝██║░░██║\n" +
				"██║░░██╗██║░░██║██╔══██╗██║░░██║\n" +
				"╚█████╔╝╚█████╔╝██║░░██║╚█████╔╝\n" +
				"░╚════╝░░╚════╝░╚═╝░░╚═╝░╚════╝░");
		LOGGER.info("A Oʀɪɢɪɴs Mᴏᴅ Aᴅᴅᴏɴ - has initialized.");
	}
}