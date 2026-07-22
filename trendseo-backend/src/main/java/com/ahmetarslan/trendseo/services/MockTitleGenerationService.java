package com.ahmetarslan.trendseo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@Primary
public class MockTitleGenerationService implements TitleGenerationService{
    private final RestClient restClient;

    public MockTitleGenerationService(RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public String generateTitle() {
        return "[MOCK] Premium Quality Product Title";
    }
}
