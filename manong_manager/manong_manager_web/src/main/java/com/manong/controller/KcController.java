package com.manong.controller;

import com.manong.pojo.WzckYwKc;
import com.manong.service.KcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KcController {

    @Autowired
    private KcService kcService;

}
