package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ErrorResponseDTO {

    private HttpStatus status;
    private Integer code;
    private String message;

    List<ErrorDTO> errors;

    public ErrorResponseDTO() {
    }

    public ErrorResponseDTO(HttpStatus status, String message, List<ErrorDTO> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ErrorResponseDTO(HttpStatus status, String message, ErrorDTO error) {
        this(status, message, Arrays.asList(error));
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDTO> errors) {
        this.errors = errors;
    }

    public Integer getCode() {
        return Optional.ofNullable(status).map(s -> s.value()).orElse(null);
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ErrorResponseDTO{" + "status=" + status + ", code=" + code + ", message=" + message + ", errors=" + errors + '}';
    }

}