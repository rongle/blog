package com.hdl.blog.controller;

import com.hdl.blog.entity.Address;
import com.hdl.blog.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("addAddress")
    @ResponseBody
    public Address addAddress(Address address){
        addressService.addAddress(address);

        return addressService.getAddressByCode(address.getAddressCode());
    }

    @GetMapping("getAddress")
    public Address getAddress(String code){
        return addressService.getAddressByCode(code);
    }
}
