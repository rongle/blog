package com.hdl.blog.service.impl;

import com.hdl.blog.entity.Menu;
import com.hdl.blog.resposity.MenuRepository;
import com.hdl.blog.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    @Override
    public void addMenu(Menu menu) {
        menuRepository.save(menu);
    }

    @Override
    public void deleteMenu(String id) {
        menuRepository.deleteById(id);
    }

    @Override
    public void updateMenu(Menu menu) {
        menuRepository.saveAndFlush(menu);
    }
}
