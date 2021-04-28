package com.annakhuseinova.springlocalizationapp.service;

import com.annakhuseinova.springlocalizationapp.dto.LocalizedDto;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class LocalizationService {

    private final MessageSource messageSource;

    public LocalizedDto getLocalizedDto(Locale locale){
        LocalizedDto localizedDto = new LocalizedDto();
        localizedDto.setCashbackName(messageSource.getMessage("CASHBACK_name", null, locale));
        return localizedDto;
    }
}
