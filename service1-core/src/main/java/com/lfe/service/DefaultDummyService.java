package com.lfe.service;

import com.lfe.data.domain.Domain;
import org.springframework.stereotype.Service;

@Service("dummyService")
public class DefaultDummyService implements DummyService {

    @Override
    public Domain getDummyDataFromService1() {
        return new Domain("Hello there !!","DummyService from Service 1");
    }
}
