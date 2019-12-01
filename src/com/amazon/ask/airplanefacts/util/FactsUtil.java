package com.amazon.ask.airplanefacts.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactsUtil {

    public static Map getFactMap() {
        Map<String, String> map = new HashMap<>();
        map.put("MostGoals", "The team with the most goals was Belgium with 16.");
        map.put("GameWithMostGoals", "The game with most goals was X versu Y, with Z goals.");
        map.put("BestDefense", "The team with the best defense was X with an average of Y goals against per game.");
        map.put("MostWoodWork", "The team that hit the most posts was X with Y hits.");
        map.put("MostViolent", "The team with the most red cards was X with Y red cards.");
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
