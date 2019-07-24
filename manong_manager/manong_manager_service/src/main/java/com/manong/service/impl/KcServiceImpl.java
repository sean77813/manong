package com.manong.service.impl;

import com.manong.mapper.WzckYwKcMapper;
import com.manong.pojo.WzckYwKc;
import com.manong.service.KcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KcServiceImpl implements KcService {

    @Autowired
    private WzckYwKcMapper kcMapper;

    @Override
    public WzckYwKc getKc(String id) {
        WzckYwKc obj =  kcMapper.selectByPrimaryKey(id);
        if(obj!=null){
            return obj;
        }
        return null;
    }
}
