package com.example.demo.controller;

import com.example.demo.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @RequestMapping("/citys")
    public List<City> all(){
        List citys=new ArrayList();
        City a=new City();
        a.setId(1L);
        a.setAddress("湖北省");
        a.setName("武汉市");
        City b=new City();
        b.setId(2L);
        b.setAddress("湖南省");
        b.setName("长沙市");
        City c=new City();
        c.setId(3L);
        c.setAddress("江西省");
        c.setName("南昌市");
        citys.add(a);
        citys.add(b);
        citys.add(c);
        return citys;
    }
}
