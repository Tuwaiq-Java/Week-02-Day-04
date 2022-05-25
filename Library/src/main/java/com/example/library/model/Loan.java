package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor @Data
public class Loan {
    @NotEmpty(message = "id is required")
    private String id;
    @NotEmpty(message = "id is required")
    private String userid;
    @NotEmpty(message = "id is required")
    private String bookid;
}
