package com.ahmetarslan.trendseo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MockTitleGenerationService implements TitleGenerationService{
    @Override
    public String generateTitle() {
        return "[MOCK] Premium Quality Product Title";
    }
}
