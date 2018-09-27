package com.hdl.blog.service;

import com.hdl.blog.entity.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> findAll();

    void addMenu(Menu menu);

    void deleteMenu(String id);

    void updateMenu(Menu menu);

}
