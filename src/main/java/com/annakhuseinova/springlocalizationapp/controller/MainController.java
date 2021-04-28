package com.annakhuseinova.springlocalizationapp.controller;

import com.annakhuseinova.springlocalizationapp.dto.LocalizedDto;
import com.annakhuseinova.springlocalizationapp.service.LocalizationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

import static com.annakhuseinova.springlocalizationapp.util.Headers.ACCEPT_LANGUAGE;

@RestController
@Slf4j
@RequiredArgsConstructor
public class MainController {

    private final LocalizationService localizationService;

    @GetMapping("/localized")
    public ResponseEntity<LocalizedDto> getLocalizedDto(@RequestHeader(value = ACCEPT_LANGUAGE, required = false) Locale locale){
        return ResponseEntity.status(HttpStatus.OK).body(localizationService.getLocalizedDto(locale));
    }
}
