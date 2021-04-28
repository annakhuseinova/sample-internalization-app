package com.annakhuseinova.springlocalizationapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dto, чьи значения зависят от предоставленной локали
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocalizedDto {

    private String cashbackName;
}
