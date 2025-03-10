/*
 * adapted from the Alexa Skill Sample by Amazon
 * https://github.com/alexa/skill-sample-java-fact/
 */

package com.amazon.ask.airplanefacts.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.requestType;

/*
 * This class is the fall back in case the user does not respond for instance
 */
public class SessionEndedRequestHandler implements RequestHandler {

    private static final Logger log = LoggerFactory.getLogger(SessionEndedRequestHandler.class);

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(SessionEndedRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        RequestEnvelope envelope = input.getRequestEnvelope();
        log.info("onSessionEnded requestId={}, sessionId={}", envelope.getRequest().getRequestId(),
                envelope.getSession().getSessionId());
        // any cleanup logic goes here
        return input.getResponseBuilder().build();
    }

}
