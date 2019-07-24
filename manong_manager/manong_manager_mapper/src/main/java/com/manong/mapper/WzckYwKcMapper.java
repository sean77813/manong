package com.manong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.manong.pojo.WzckYwKc;


public interface WzckYwKcMapper {
    int deleteByPrimaryKey(String id);

    int insert(WzckYwKc record);

    int insertSelective(WzckYwKc record);

    WzckYwKc selectByPrimaryKey(String id);
    
    WzckYwKc selectByWzdm(@Param("wzdm") String wzdm);

    int updateByPrimaryKey(WzckYwKc record);

    int existsByWzdm(@Param("wzdm") String wzdm);
    
    List<WzckYwKc> selectkcListByZc(@Param("kcDwdm") String kcDwdm,
                                    @Param("kcWzytdm") String kcWzytdm);
}