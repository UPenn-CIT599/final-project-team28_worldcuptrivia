// Adapted from: https://github.com/alexa/skill-sample-java-fact

package worldcuptrivia;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class AlexaHandlerHelp implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.HelpIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "I can tell you about the world cup. Try saying tell me a World Cup fact";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("World Cup trivia", speechText)
                .withReprompt(speechText)
                .build();
    }

}
