package com.example.duolingo.controller.payload.response;

import java.util.List;
import lombok.NonNull;

public record GetQuestionsResponse(@NonNull  List<GetQuestionResponse> questions) {

}
