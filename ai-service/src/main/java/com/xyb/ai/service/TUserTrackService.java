package com.xyb.ai.service;


import com.xyb.ai.model.ai.TUserTrack;

public interface TUserTrackService {

    /**
     * 添加用户轨迹
     *
     * @param record 用户轨迹字段
     * @param city   市
     * @param area   区
     * @return
     */


    boolean insertSelective(TUserTrack record, String city, String area);

    /**
     * 更新用户轨迹
     *
     * @param record
     * @return
     */
    TUserTrack updateSelective(TUserTrack record);

    /**
     * 删除用户轨迹
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);


}
