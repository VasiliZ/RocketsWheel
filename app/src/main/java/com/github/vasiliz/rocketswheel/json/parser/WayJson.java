package com.github.vasiliz.rocketswheel.json.parser;

import org.json.JSONObject;

public class WayJson implements IWay {

    private static final String WAY = "way";
    private static final String NAME = "name";

    private final JSONObject mJSONObject;

    public WayJson(JSONObject pJSONObject) {
        mJSONObject = pJSONObject;
    }

    @Override
    public String getWay() {
        return mJSONObject.optString(WAY);
    }

    @Override
    public String getName() {
        return mJSONObject.optString(NAME);
    }
}
