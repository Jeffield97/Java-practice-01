package com.example.Prototype;

import java.util.HashMap;

public class PriceListCache {
    private static HashMap<String, PriceList> priceListMap = new HashMap<>();

    public static PriceList getPriceList(String type) {
        PriceList cachePriceList = priceListMap.get(type);
        return (PriceList) cachePriceList.clone();

    }

    public static void loadCache() {
        Normal normal = new Normal();
        priceListMap.put("normal", normal);
    }

}
