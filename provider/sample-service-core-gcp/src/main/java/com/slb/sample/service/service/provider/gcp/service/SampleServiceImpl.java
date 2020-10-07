package com.slb.sample.service.service.provider.gcp.service;

import com.slb.sample.service.model.SampleModel;
import com.slb.sample.service.service.SampleService;
import org.springframework.stereotype.Component;

@Component
public class SampleServiceImpl implements SampleService {
    @Override
    public SampleModel getSampleData() {
        SampleModel sampleModel = new SampleModel();
        sampleModel.setId("ID");
        sampleModel.setName("NAME");
        return sampleModel;
    }
}
