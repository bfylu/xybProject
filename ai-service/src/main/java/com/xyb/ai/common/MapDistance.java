package com.xyb.ai.common;

import java.util.HashMap;
import java.util.Map;

public class MapDistance {
    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }


    /**
     *  根据两个位置的经纬度，来计算两地的距离
     *  参数为String类型
     * @param lat1Str
     * @param lng1Str
     * @param lat2Str
     * @param lng2Str
     * @return  单位为M
     */
    public static String getDistance(String lat1Str, String lng1Str, String lat2Str, String lng2Str) {
        Double lat1 = Double.parseDouble(lat1Str);
        Double lng1 = Double.parseDouble(lng1Str);
        Double lat2 = Double.parseDouble(lat2Str);
        Double lng2 = Double.parseDouble(lng2Str);

        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double difference = radLat1 - radLat2;
        double mdifference = rad(lng1) - rad(lng2);
        double distance = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(difference / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(mdifference / 2), 2)));
        distance = distance * EARTH_RADIUS;
       // distance = Math.round(distance * 10000) / 10000;
        distance =distance * 1000;
        String distanceStr = distance+"";
        distanceStr = distanceStr.
                substring(0, distanceStr.indexOf("."));

        return distanceStr;
    }

    /**
     * 获取当前用户一定距离以内的经纬度值
     * @param latStr
     * @param lngStr
     * @param raidus 半径 单位 M
     * @return
     */
    public static Map getAround(String latStr, String lngStr, String raidus) {
        Map map = new HashMap();

        Double latitude = Double.parseDouble(latStr);// 传值给纬度
        Double longitude = Double.parseDouble(lngStr);// 传值给经度

        Double degree = (24901 * 1609) / 360.0; // 获取每度
        double raidusMile = Double.parseDouble(raidus);

        Double mpdLng = Double.parseDouble((degree * Math.cos(latitude * (Math.PI / 180))+"").replace("-", ""));
        Double dpmLng = 1 / mpdLng;
        Double radiusLng = dpmLng * raidusMile;
        //获取最小经度
        Double minLng = longitude - radiusLng;
        // 获取最大经度
        Double maxLng = longitude + radiusLng;

        Double dpmLat = 1 / degree;
        Double radiusLat = dpmLat * raidusMile;
        // 获取最小纬度
        Double minLat = latitude - radiusLat;
        // 获取最大纬度
        Double maxLat = latitude + radiusLat;

        map.put("minLat", minLat+"");
        map.put("maxLat", maxLat+"");
        map.put("minLng", minLng+"");
        map.put("maxLng", maxLng+"");

        return map;
    }

    public static void main(String[] args) {
        //测试经纬度：117.11811  36.68484
        //测试经纬度2：117.00999000000002  36.66123
        System.out.println(getDistance("22.6","114","30.495503391970406","120.49261708577215"));

        System.out.println(getAround("22.6", "114", "1500"));
        //117.01028712333508(Double), 117.22593287666493(Double),
        //36.44829619896034(Double), 36.92138380103966(Double)

    }
}
