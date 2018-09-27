package com.hdl.blog.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ( Menu)表实体类
 *
 * @author hdl
 * @since 2018-09-19 21:35:45
 */
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(
            generator = "uuid"
    )
    @GenericGenerator(
            name = "uuid",
            strategy = "uuid"
    )
    private String id;
    
    private String name;
    
    private String pid;
    
    private String icon;
    
    private String href;
    
    private boolean spread;
    
    private String idCreated;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Object getSpread() {
        return spread;
    }

    public void setSpread(boolean spread) {
        this.spread = spread;
    }

    public String getIdCreated() {
        return idCreated;
    }

    public void setIdCreated(String idCreated) {
        this.idCreated = idCreated;
    }

}