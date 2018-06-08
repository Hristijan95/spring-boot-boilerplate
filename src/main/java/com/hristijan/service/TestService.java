package com.hristijan.service;

import com.hristijan.domain.TestModel;

import java.util.List;

public interface TestService {

    List<TestModel> listAllTests();

    TestModel getTestModelById(Long id);

    TestModel saveTestModel(TestModel testModel);

    void deleteMainModel(Long id);

}
