package com.boot.web;

import com.boot.entry.FundGroup;
import com.boot.service.FundGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FundGroupController {
    @Autowired
    private FundGroupService fundGroupService;

    @RequestMapping(value = "/getFundGroup/{id}",method = RequestMethod.POST)
    @ResponseBody
    public FundGroup getFundGroup(@PathVariable("id")String id){
        return fundGroupService.getFundGroup(id);
    }
}
