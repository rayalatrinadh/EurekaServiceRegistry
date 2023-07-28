package com.trinadh.quizservice.Controller;

import com.trinadh.quizservice.Model.QuestionWrapper;
import com.trinadh.quizservice.Model.QuizDto;
import com.trinadh.quizservice.Model.SubmitQuestion;
import com.trinadh.quizservice.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

   /* @Autowired
    QuestionController questionController;*/

    /**
     * @apiNote : http://localhost:8080/quiz/create?category=Java&numQ=5&title=JQuiz
     *
     * @param category
     * @param numQ
     * @param title
     * @return
     */

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizdto)
    {
        try{
            return quizService.createQuiz(quizdto.getCategory(),quizdto.getNumQ(),quizdto.getTitle());
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("FailureUnableToSaveTheQuestion", HttpStatus.CONFLICT);

    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){

       return quizService.getQuizQuestions(id);

    }

    @PostMapping("submitQuiz/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<SubmitQuestion> submitQuestions){

        return quizService.submitQuiz(id,submitQuestions);

    }

}
