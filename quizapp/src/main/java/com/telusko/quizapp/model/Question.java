package com.telusko.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="Ques")
@Table(name = "questions")
public class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;
    private String difficultylevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String question_title;
    private String right_answer;

}
