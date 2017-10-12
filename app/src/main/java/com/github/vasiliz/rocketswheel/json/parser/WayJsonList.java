package com.github.vasiliz.rocketswheel.json.parser;

import java.util.List;

public class WayJsonList implements IWayList {

    private final List<IWay> mIWays;

    public WayJsonList(final List<IWay> pIWays) {
        mIWays = pIWays;
    }

    @Override
    public List<IWay> getWayList() {
        return mIWays;
    }
}
