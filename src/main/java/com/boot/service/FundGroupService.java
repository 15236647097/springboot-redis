package com.boot.service;

import com.boot.entry.FundGroup;
import com.boot.mapper.FundGroupMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FundGroupService {

    @Autowired
    private FundGroupMapper fundGroupMapper;

    public FundGroup getFundGroup(String id){
        log.info("id={}",id);
        return fundGroupMapper.getFundGroup(id);
    }
}
