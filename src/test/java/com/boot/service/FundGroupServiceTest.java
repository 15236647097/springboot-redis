package com.boot.service;

import com.boot.Application;
import com.boot.entry.FundGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FundGroupServiceTest {
    @Autowired
    private FundGroupService fundGroupService;
    @Test
    public void getFundGroup() throws Exception {
        FundGroup fundGroup = fundGroupService.getFundGroup("1");
        System.out.println(fundGroup);
    }

    @Test
    public void testBigDecimal(){
        new BigDecimal(0.02);
        new BigDecimal("0.02");
    }

    @Test
    public void testsub(){
        String a = "123";
        System.out.println(a.substring(0,256));
    }

}
