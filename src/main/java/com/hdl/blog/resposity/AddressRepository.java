package com.hdl.blog.resposity;

import com.hdl.blog.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends JpaRepository<Address, String>,JpaSpecificationExecutor<Address> {

    @Query(value = "select * from address a where a.address_code=:addressCode", nativeQuery = true)
    Address getAddressByAddressCode(@Param("addressCode") String addressCode);
}
