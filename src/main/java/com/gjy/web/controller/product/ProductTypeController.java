package com.gjy.web.controller.product;

import com.baomidou.mybatisplus.plugins.Page;
import com.gjy.common.ResultEntity;
import com.gjy.model.product.ProductType;
import com.gjy.service.product.ProductTypeService;
import com.gjy.web.filter.PageContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 商品分类控制层
 * Created by gaojiajia on 2017/8/26.
 */
@RequestMapping(value = "/product/type")
@Controller
@Log4j2
public class ProductTypeController {
    
    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping
    public String getList(){

        return "product/type/productTypeList";
    }

    @GetMapping(value = "/list")
    @ResponseBody
    public Object getListPage(Model model){

        Page page = new Page(PageContext.getOffSet(), PageContext.getPageSize());
        return productTypeService.findListPage(page, model.asMap());
    }

    @GetMapping(value = "/toadd")
    public String toAdd(){

        return "product/type/productTypeAdd";
    }

    @PostMapping(value = "/add")
    @ResponseBody
    public ResultEntity add(@Valid ProductType type){

        ResultEntity re = new ResultEntity();
        boolean result = this.productTypeService.insertAndGetId(type);
        if (result){
            re.setSuccess(true);
        }
        return re;
    }

    @GetMapping(value = "/{typeId:\\d+}/del")
    @ResponseBody
    public ResultEntity del(@PathVariable("typeId") Integer typeId){

        ResultEntity re = new ResultEntity();

        return re;
    }
}