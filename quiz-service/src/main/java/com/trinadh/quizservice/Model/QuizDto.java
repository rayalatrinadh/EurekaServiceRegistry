package com.trinadh.quizservice.Model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuizDto {

    //@RequestParam String category, @RequestParam int numQ, @RequestParam String title

    String category;
    Integer numQ;
    String title;

}
