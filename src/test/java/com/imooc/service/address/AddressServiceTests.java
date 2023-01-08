package com.imooc.service.address;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.service.ServiceResult;
import com.imooc.service.house.IAddressService;
import com.imooc.service.search.BaiduMapLocation;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by 瓦力.
 */
@SpringBootTest
public class AddressServiceTests   {
//    @Autowired
//    private IAddressService addressService;

    @Test
    public void testGetMapLocation() {
        String city = "北京";
        String address = "北京市昌平区巩华家园1号楼2单元";
//        ServiceResult<BaiduMapLocation> serviceResult = addressService.getBaiduMapLocation(city, address);

//        Assert.assertTrue(serviceResult.isSuccess());
//
//        Assert.assertTrue(serviceResult.getResult().getLongitude() > 0 );
//        Assert.assertTrue(serviceResult.getResult().getLatitude() > 0 );

    }
}
