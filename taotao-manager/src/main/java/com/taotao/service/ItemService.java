package com.taotao.service;

import com.taotao.entity.TbItem;

/**
 * 商品管理
 * Created by Aries on 2018/6/29.
 */
public interface ItemService {
    TbItem getItemById(Long itemId);
}
