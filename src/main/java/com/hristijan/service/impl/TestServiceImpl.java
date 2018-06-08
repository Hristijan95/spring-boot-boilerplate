package com.hristijan.service.impl;

import com.hristijan.domain.TestModel;
import com.hristijan.repo.TestRepository;
import com.hristijan.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public List<TestModel> listAllTests() {
        List<TestModel> testModels = new ArrayList<>();
        testRepository.findAll().forEach(testModels::add);
        return testModels;
    }

    @Override
    public TestModel getTestModelById(Long id) {
        return testRepository.findOne(id);
    }

    @Override
    public TestModel saveTestModel(TestModel testModel) {
        testRepository.save(testModel);
        return testModel;
    }

    @Override
    public void deleteMainModel(Long id) {
        testRepository.delete(id);
    }
}
