package com.hdl.blog.service.impl;

import com.hdl.blog.entity.Address;
import com.hdl.blog.resposity.AddressRepository;
import com.hdl.blog.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Address)表服务实现类
 *
 * @author hdl
 * @since 2018-08-23 15:03:17
 */

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public Address getAddressByCode(String addressCode) {
        return addressRepository.getAddressByAddressCode(addressCode);
    }
}