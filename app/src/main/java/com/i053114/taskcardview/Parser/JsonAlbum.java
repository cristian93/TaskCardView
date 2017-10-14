package com.i053114.taskcardview.Parser;

import com.i053114.taskcardview.Models.ImageDates;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 5/10/2017.
 */

public class JsonAlbum {

    public static List<ImageDates> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<ImageDates> countryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);
            ImageDates  imageDates= new ImageDates();
            imageDates.setTitle(item.getString("title"));
            imageDates.setUrl(item.getString("url"));
            countryList.add(imageDates);

        }
        return countryList;
    }

}
