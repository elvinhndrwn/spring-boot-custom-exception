package com.example.customexceptionhandle.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponseDto implements Serializable {
    private static final long serialVersionUID = -3571068312901978570L;

    private String errorCode;
    private String errorMessage;
    private String httpStatus;
    private Integer httpStatusCode;
}
