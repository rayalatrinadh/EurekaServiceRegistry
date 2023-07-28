package com.trinadh.quizservice.DAO;



//import com.trinadh.quizapp.Model.Quiz;
import com.trinadh.quizservice.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDAO extends JpaRepository<Quiz,Integer> {


}
