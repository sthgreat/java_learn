package com.service;

import com.dao.ItemDao;
import com.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ItemService {
    List<Item> selectAllItem();
    Item getByid(Integer id);
    int updateItem(Item item);
    int addItem(Item item);
    int deleteItem(Integer id);
}
