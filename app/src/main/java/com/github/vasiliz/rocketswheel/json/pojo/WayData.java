package com.github.vasiliz.rocketswheel.json.pojo;

import org.json.JSONArray;

public class WayData implements IWayData {

    private  String way;

    public void setWay(String pWay) {
        way = pWay;
    }

    public void setName(String pName) {
        name = pName;
    }

    private  String name;

    private final JSONArray mJSONArray;

    public WayData(final JSONArray pJSONArray) {
        mJSONArray = pJSONArray;
    }



    @Override
    public String getWay() {
        return null;
    }

    @Override
    public String getNmae() {
        return null;
    }
}
