package com.service.impl;

import com.dao.ItemDao;
import com.pojo.Item;
import com.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class itemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> selectAllItem() {
        return itemDao.selectAllItem();
    }

    @Override
    public Item getByid(Integer id) {
        return itemDao.getByid(id);
    }

    @Override
    public int updateItem(Item item) {
        return itemDao.updateItem(item);
    }

    @Override
    public int addItem(Item item) {
        return itemDao.addItem(item);
    }

    @Override
    public int deleteItem(Integer id) {
        return itemDao.deleteItem(id);
    }
}
