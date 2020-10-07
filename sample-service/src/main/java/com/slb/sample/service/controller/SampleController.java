package com.slb.sample.service.controller;

import javax.servlet.http.HttpServletRequest;

import com.slb.sample.service.model.SampleModel;
import com.slb.sample.service.service.SampleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@RequestMapping("sample-management/v1")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping(value = "/sampleController", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "sample controller", response = List.class, tags = "sample-management-service", nickname = "sampleController")
    public SampleModel searchData(
            @RequestHeader(value = "appkey") String appkey,
            @RequestHeader(value = "Slb-Data-Partition-Id") String slbDataPartitionId,
            @ApiIgnore @RequestHeader(value = "Authorization", required = true) String authorization,
            HttpServletRequest httpServletRequest) {

        return sampleService.getSampleData();
    }

}
