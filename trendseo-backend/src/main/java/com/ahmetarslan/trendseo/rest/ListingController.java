package com.ahmetarslan.trendseo.rest;

import com.ahmetarslan.trendseo.services.TitleGenerationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListingController {
    private final TitleGenerationService myTitleGenerationService;

    public ListingController(TitleGenerationService titleGenerationService){
        myTitleGenerationService=titleGenerationService;
    }

    @GetMapping("/preview-title")
    public String generateTitle(){
        return myTitleGenerationService.generateTitle();
    }
}
