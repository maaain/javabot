package com.pengrad;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

public class TestTelegramBot extends BotHandler {

    private static final String TOKEN = "1744485725:AAGSyPz9wu9kg9EgWEL0abqImol0_2sJyr8";
    private final TelegramBot bot = new TelegramBot(TOKEN);

    @Override
    void onWebhookUpdate(Update update) {
        Long chatId = update.message().chat().id();
        bot.execute(new SendMessage(chatId, "Hello from bot"));
    }

    @Override
    String getToken() {
        return TOKEN;
    }

    @Override
    TelegramBot getBot() {
        return bot;
    }
}
