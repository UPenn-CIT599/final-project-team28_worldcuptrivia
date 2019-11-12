// sources: https://github.com/alexa/skill-sample-java-fact

package worldcuptrivia;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class AlexaHandlerFallback implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.FallbackIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Sorry, I don't know that. Would you like some world cup trivia?";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("World Cup trivia", speechText)
                .withReprompt(speechText)
                .build();
    }

}
