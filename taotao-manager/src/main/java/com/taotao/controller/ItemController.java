package com.taotao.controller;

import com.taotao.entity.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Aries on 2018/6/29.
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemServiceImpl;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemServiceImpl.getItemById(itemId);
        return tbItem;
    }
}
