package pl.edu.prz.kia.universityproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.prz.kia.universityproject.model.Question;
import pl.edu.prz.kia.universityproject.repository.QuestionRepository;

import java.util.List;

@Service
public class QuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public Long count() {
        return questionRepository.count();
    }
    
    public Question getOne(Long id) { return questionRepository.getOne(id); }

    public void updateQuestion(Question question) {
        this.getOne(question.getId()).setQuestion(question.getQuestion());
        questionRepository.save(this.getOne(question.getId()));
    }
}
