/*
 * adapted from the Alexa Skill Sample by Amazon
 * https://github.com/alexa/skill-sample-java-fact/
 */

package com.amazon.ask.airplanefacts.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactsUtil {

	/**
	 * This method generates and returns a HashMap for facts
	 * @return a HashMap of facts which is used as answers in Alexa
	 */
    public static Map getFactMap() {
        Map<String, String> map = new HashMap<>();
        map.put("MostGoals", "The team with the most goals was Belgium with 16.");
        map.put("GameWithMostGoals", "The games with the most goals were: Belgium versus Tunisia. "
        		+ "England versus Panama. and France versus Argentina. They all had 7 goals!");
        map.put("BestDefense", "The team with the best defense was Denmark with 0.5 goals "
        		+ "conceded per game.");
        map.put("MostWoodWork", "The team with the most shots hitting woodwork was: Croatia. "
        		+ "They had 4 shots that hit woodwork!");
        map.put("MostViolent", "The teams with the most red cards were: Colombia. and Switzerland. "
        		+ "They all had 1 red card.");
        return map;
    }

    /**
     * This method creates and returns URL for pictures for Alexa devices
     * with a display
     * @return a HashMap with an image URL to illustrate each fact
     */
    public static Map getImageMap() {
        Map<String, String> map = new HashMap<>();
        map.put("MostGoals", "https://cit591-public.s3.amazonaws.com/belgium.jpg");
        map.put("GameWithMostGoals", "https://cit591-public.s3.amazonaws.com/england.jpg");
        map.put("BestDefense", "https://cit591-public.s3.amazonaws.com/denmark.jpg");
        map.put("MostWoodWork", "https://cit591-public.s3.amazonaws.com/croatia.jpg");
        map.put("MostViolent", "https://cit591-public.s3.amazonaws.com/switzerland.jpg");
        return map;
    }

    /**
     * This method generates a List of keys corresponding to the possible answers
     * @return a List of keys
     */
    public static List getKeys() {
        List<String> keys = new ArrayList<>();
        keys.add("MostGoals");
        keys.add("GameWithMostGoals");
        keys.add("BestDefense");
        keys.add("MostWoodWork");
        keys.add("MostViolent");
        return keys;
    }

}

