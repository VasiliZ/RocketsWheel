package com.github.vasiliz.rocketswheel.json.parser;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class JsonObjectParser implements IWayParseList {

    private final String mJson;

    public JsonObjectParser(String pJson) {
        mJson = pJson;
    }

    @Override
    public IWayList parse() throws JSONException {
        final JSONArray jsonArray = new JSONArray(mJson);
        final List<IWay> iWays = new ArrayList<>();

        for (int i = 0; i<jsonArray.length(); i++){
            iWays.add(new WayJson(jsonArray.getJSONObject(i)));
        }
        return new WayJsonList(iWays);
    }
}
