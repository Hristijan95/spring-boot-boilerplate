package com.hristijan.repo;

import com.hristijan.domain.TestModel;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestModel, Long> {
}
