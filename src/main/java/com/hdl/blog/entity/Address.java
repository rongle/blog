package com.hdl.blog.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * (Address)表实体类
 *
 * @author hdl
 * @since 2018-08-23 15:03:17
 */
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(
            generator = "uuid"
    )
    @GenericGenerator(
            name = "uuid",
            strategy = "uuid"
    )
    @Column(name = "address_id")
    private String addressId;

    @Column(name = "address_pid")
    private String addressPid;

    @Column(name = "address_code")
    private String addressCode;

    @Column(name = "address_name")
    private String addressName;


    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressPid() {
        return addressPid;
    }

    public void setAddressPid(String addressPid) {
        this.addressPid = addressPid;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

}