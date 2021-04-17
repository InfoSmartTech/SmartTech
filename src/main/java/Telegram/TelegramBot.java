package Telegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot{

	@Override
	public void onUpdateReceived(Update update) {
		
		if(update.hasMessage()) {
			
	     Message message = update.getMessage();
	     
	     if(message.hasText()) {
	    	 
	    	 String text = message.getText();
	    	 
	    	 if(text.equals("/start")) {
	    		 
	    		 SendMessage sendmessage = new SendMessage();
	    		 sendmessage.setChatId(message.getChatId().toString());
	    		 sendmessage.setText("Welcome to SMART TECH Channel ");
	    		 try {
					execute(sendmessage);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
	    		 
	    	   }
	    	 
                if(text.equals("Online pul topish")) {
	    		 
	    		 SendMessage sendmessage = new SendMessage();
	    		 sendmessage.setChatId(message.getChatId().toString());
	    		 sendmessage.setText("https://youtu.be/VGDkcT5xtVk");
	    		 try {
					execute(sendmessage);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
	    		 
	    	   }
	    	 
	        }
	     
		}	
	}

	@Override
	public String getBotUsername() {
		return "SmatTechBotirBot";
	}

	@Override
	public String getBotToken() {
		return "1676300457:AAELaOZGjaMk7YUM2-Di6neNrvFoO8jBtls";
	}

}
