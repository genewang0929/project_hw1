package ntou.cs.java;

import java.util.ArrayList;

public class KeelungSightsCrawler {
    public com.example.demo.Sight[] getItems(String zone) {
        ArrayList<com.example.demo.Sight> sightArray = new ArrayList<com.example.demo.Sight>();

        // Get zone and all the urls related to the zone
        SightHandler handler = new SightHandler();
        String region = handler.getZone(zone);
        ArrayList<String> URLs = handler.getURLs();

        for (String url : URLs)
            sightArray.add(setSight(url, region));

        // Convert the ArrayList to Sight[]
        com.example.demo.Sight[] sights = new com.example.demo.Sight[sightArray.size()];
        sights = sightArray.toArray(sights);
        return sights;
    }

    // Set the data of Sight
    public com.example.demo.Sight setSight(String url, String region) {
        com.example.demo.Sight sight = new com.example.demo.Sight(url);
        sight.setSightName();
        sight.setZone(region);
        sight.setCategory();
        sight.setPhotoURL();
        sight.setDescription();
        sight.setAddress();

        return sight;
    }
}
