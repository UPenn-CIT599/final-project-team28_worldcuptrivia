package com.amazon.ask.airplanefacts.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class HelpIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.HelpIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "I can tell you about the 2018 world cup. Try saying tell me a world cup fact";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("World Cup Trivia", speechText)
                .withReprompt(speechText)
                .build();
    }

}
