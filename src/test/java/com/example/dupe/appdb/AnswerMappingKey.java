package com.example.dupe.appdb;

import javax.persistence.Column;
import java.io.Serializable;

public class AnswerMappingKey implements Serializable {

    @Column(name = "q_id")
    private String questionId;
    @Column(name = "ans_id")
    private String answerId;
}
