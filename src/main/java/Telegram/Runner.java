package Telegram;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Runner {
	
	public static void main(String[] args) {
	    
        TelegramBotsApi botApi;
		try {
			botApi = new TelegramBotsApi(DefaultBotSession.class);
			botApi.registerBot(new TelegramBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
    }

}
