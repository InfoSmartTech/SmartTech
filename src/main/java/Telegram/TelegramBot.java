package Telegram;

import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
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
	    		 sendmessage.setText("Welcome to 'SMART TECH' Channel ");
	    		 
	    		 InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
	    	     List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList1 = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
	    	     List<InlineKeyboardButton> inlineKeyboardButtonList10 = new ArrayList<>();
	    	     InlineKeyboardButton inlineKeyboardButton1 =  new InlineKeyboardButton();
	    	     InlineKeyboardButton inlineKeyboardButton2 =  new InlineKeyboardButton();
	    	     InlineKeyboardButton inlineKeyboardButton3 =  new InlineKeyboardButton();
	    	     InlineKeyboardButton inlineKeyboardButton4 =  new InlineKeyboardButton();
	    	     InlineKeyboardButton inlineKeyboardButton5 =  new InlineKeyboardButton();
	    	     InlineKeyboardButton inlineKeyboardButton6 =  new InlineKeyboardButton();
	    	     InlineKeyboardButton inlineKeyboardButton7 =  new InlineKeyboardButton();
	    	     InlineKeyboardButton inlineKeyboardButton8 =  new InlineKeyboardButton();
	    	     InlineKeyboardButton inlineKeyboardButton9 =  new InlineKeyboardButton();
	    	     InlineKeyboardButton inlineKeyboardButton10 =  new InlineKeyboardButton();
	    	     inlineKeyboardButton1.setText("1) " + "UYDA O'TIRIB PUL ISHLASH");
	    	     inlineKeyboardButton2.setText("2) " + "5-MINUTDA MOBILE APP YARATISH");
	    	     inlineKeyboardButton3.setText("3) " + "5-MINUTDA WEBSITE YARATISH");
	    	     inlineKeyboardButton4.setText("4) " + "DIPLOMSIZ SHARTNOMA TUZISH");
	    	     inlineKeyboardButton5.setText("5) " + "TELEGRAM BOT YARATISH");
	    	     inlineKeyboardButton6.setText("6) " + "DASTURLASH WEB-SERVICES");
	    	     inlineKeyboardButton7.setText("7) " + "DASTURLASH BACK-END");
	    	     inlineKeyboardButton8.setText("8) " + "BUSINESS UCHUN QR-CODE YARATISH");
	    	     inlineKeyboardButton9.setText("9) " + "JOB INTERVIEW DAN O'TISH SIRLARI");
	    	     inlineKeyboardButton10.setText("10) " + "AQSH UCHUN VISA");
	    	     inlineKeyboardButton1.setCallbackData("UYDA O'TIRIB PUL ISHLASH");
	    	     inlineKeyboardButton2.setCallbackData("5-MINUTDA MOBILE APP YARATISH");
	    	     inlineKeyboardButton3.setCallbackData("5-MINUTDA WEBSITE YARATISH");
	    	     inlineKeyboardButton4.setCallbackData("DIPLOMSIZ SHARTNOMA TUZISH");
	    	     inlineKeyboardButton5.setCallbackData("TELEGRAM BOT YARATISH");
	    	     inlineKeyboardButton6.setCallbackData("DASTURLASH WEB-SERVICES");
	    	     inlineKeyboardButton7.setCallbackData("DASTURLASH BACK-END");
	    	     inlineKeyboardButton8.setCallbackData("BUSINESS UCHUN QR-CODE YARATISHD");
	    	     inlineKeyboardButton9.setCallbackData("JOB INTERVIEW DAN O'TISH SIRLARI");
	    	     inlineKeyboardButton10.setCallbackData("AQSH UCHUN VISA");
	    	     inlineKeyboardButton1.setUrl("http://bit.ly/SMART-TECH-1");
	    	     inlineKeyboardButton2.setUrl("http://bit.ly/SMART-TECH-2");
	    	     inlineKeyboardButton3.setUrl("http://bit.ly/SMART-TECH-3");
	    	     inlineKeyboardButton4.setUrl("http://bit.ly/SMART-TECH-4");
	    	     inlineKeyboardButton5.setUrl("http://bit.ly/SMART-TECH-5");
	    	     inlineKeyboardButton6.setUrl("http://bit.ly/SMART-TECH-6");
	    	     inlineKeyboardButton7.setUrl("http://bit.ly/SMART-TECH-7");
	    	     inlineKeyboardButton8.setUrl("http://bit.ly/SMART-TECH-8");
	    	     inlineKeyboardButton9.setUrl("http://bit.ly/SMART-TECH-9");
	    	     inlineKeyboardButton10.setUrl("http://bit.ly/SMART-TECH-10");
	    	     inlineKeyboardButtonList1.add(inlineKeyboardButton1);
	    	     inlineKeyboardButtonList2.add(inlineKeyboardButton2);
	    	     inlineKeyboardButtonList3.add(inlineKeyboardButton3);
	    	     inlineKeyboardButtonList4.add(inlineKeyboardButton4);
	    	     inlineKeyboardButtonList5.add(inlineKeyboardButton5);
	    	     inlineKeyboardButtonList6.add(inlineKeyboardButton6);
	    	     inlineKeyboardButtonList7.add(inlineKeyboardButton7);
	    	     inlineKeyboardButtonList8.add(inlineKeyboardButton8);
	    	     inlineKeyboardButtonList9.add(inlineKeyboardButton9);
	    	     inlineKeyboardButtonList10.add(inlineKeyboardButton10);
	    	     inlineButtons.add(inlineKeyboardButtonList1);
	    	     inlineButtons.add(inlineKeyboardButtonList2);
	    	     inlineButtons.add(inlineKeyboardButtonList3);
	    	     inlineButtons.add(inlineKeyboardButtonList4);
	    	     inlineButtons.add(inlineKeyboardButtonList5);
	    	     inlineButtons.add(inlineKeyboardButtonList6);
	    	     inlineButtons.add(inlineKeyboardButtonList7);
	    	     inlineButtons.add(inlineKeyboardButtonList8);
	    	     inlineButtons.add(inlineKeyboardButtonList9);
	    	     inlineButtons.add(inlineKeyboardButtonList10);
	    	     inlineKeyboardMarkup.setKeyboard(inlineButtons);
	    	     sendmessage.setReplyMarkup(inlineKeyboardMarkup);
	    		 
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
		return "";
	}

	@Override
	public String getBotToken() {
		return "";
	}

}