package com.hdl.blog.service;


import com.hdl.blog.entity.Address;

/**
 * (Address)表服务接口
 *
 * @author hdl
 * @since 2018-08-23 15:03:17
 */
public interface AddressService {
    void addAddress(Address address);

    Address getAddressByCode(String code);
}