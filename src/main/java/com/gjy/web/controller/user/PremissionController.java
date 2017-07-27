package com.gjy.web.controller.user;

import com.gjy.common.ResultEntity;
import com.gjy.service.user.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:PremissionController
 *
 * @author ty
 * @description
 * @create 2017/7/18 20:46
 **/
@Controller
@RequestMapping(value = "/premission")
public class PremissionController {

    @Autowired
    private PermissionService premissionService;


    @GetMapping(value = "/list")
    public Object getListPage(){

        return null;
    }

    @PostMapping(value = "/add")
    public ResultEntity addPremission(){

        ResultEntity re = new ResultEntity();

        return re;
    }

    @PostMapping(value = "/edit")
    public ResultEntity editPremission(){

        ResultEntity re = new ResultEntity();

        return re;
    }
}
