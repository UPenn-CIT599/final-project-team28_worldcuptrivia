/*
 * adapted from the Alexa Skill Sample by Amazon
 * https://github.com/alexa/skill-sample-java-fact/
 */

package com.amazon.ask.airplanefacts;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.airplanefacts.handlers.*;

public class AirplaneFactsStreamHandler extends SkillStreamHandler {

	/**
	 * This method compiles the various Alexa request types (launch, help, exit, etc.)
	 * and bind our Skill ID for implementation
	 * @return
	 */
    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new FactIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallBackIntentHandler())
                // Add your skill id below and uncomment to enable skill ID verification
                .withSkillId("amzn1.ask.skill.6f264775-f5f9-4c66-8b0f-ccd1682733f8")
                .build();
    }

    public AirplaneFactsStreamHandler() {
        super(getSkill());
    }

}
