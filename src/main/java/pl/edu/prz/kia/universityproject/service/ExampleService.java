package pl.edu.prz.kia.universityproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.prz.kia.universityproject.model.Example;
import pl.edu.prz.kia.universityproject.repository.ExampleRepository;

import java.util.List;

@Service
public class ExampleService {

    private ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public List<Example> getAll() {
        return exampleRepository.findAll();
    }
}
