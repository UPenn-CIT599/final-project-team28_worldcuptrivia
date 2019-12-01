package com.amazon.ask.airplanefacts.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactsUtil {

    public static Map getFactMap() {
        Map<String, String> map = new HashMap<>();
        map.put("MostGoals", "The team with the most goals was Belgium with 16.");
        map.put("GameWithMostGoals", "The games with the most goals were: Belgium versus Tunisia."
        		+ "England versus Panama. and France versus Argentina. They all had 7 goals!");
        map.put("BestDefense", "The team with the best defense was Denmark with 0.5 goals "
        		+ "conceded per game.");
        map.put("MostWoodWork", "The team with the most shots hitting woodwork was: Croatia. "
        		+ "They had 4 shots that hit woodwork!");
        map.put("MostViolent", "The teams with the most red cards were: Colombia. and Switzerland. "
        		+ "They all had 1 red card.");
        return map;
    }

    public static Map getImageMap() {
        Map<String, String> map = new HashMap<>();
        map.put("MostGoals", "https://s3.amazonaws.com/ask-samples-resources/images/airbus.jpg");
        map.put("GameWithMostGoals", "https://s3.amazonaws.com/ask-samples-resources/images/airplane-1.jpg");
        map.put("BestDefense", "https://s3.amazonaws.com/ask-samples-resources/images/airplane-2.jpg");
        map.put("MostWoodWork", "https://s3.amazonaws.com/ask-samples-resources/images/airplane-3.jpg");
        map.put("MostViolent", "https://s3.amazonaws.com/ask-samples-resources/images/airplane-4.jpg");
        return map;
    }

    public static List getKeys() {
        List<String> keys = new ArrayList<>();
        keys.add("MostGoals");
        keys.add("GameWithMostGoals");
        keys.add("BestDefene");
        keys.add("MostWoodWork");
        keys.add("MostViolent");
        return keys;
    }

}

/*
Royalty free image URLS
https://www.pexels.com/photo/airplane-on-sky-during-sunset-48786/
https://www.pexels.com/photo/airplane-aircraft-airport-transportation-system-113017/
https://www.pexels.com/photo/jet-cloud-landing-aircraft-46148/
https://www.pexels.com/photo/white-passenger-plane-flying-on-sky-during-day-time-67807/
https://www.pexels.com/photo/royalty-free-airbus-passenger-aircraft-auckland-68155/
https://www.pexels.com/photo/sky-traveling-airport-airplane-87460/
*/
