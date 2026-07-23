package com.ahmetarslan.trendseo.rest;

import com.ahmetarslan.trendseo.dto.GenerateTitleRequest;
import com.ahmetarslan.trendseo.dto.GenerateTitleResponse;
import com.ahmetarslan.trendseo.services.TitleGenerationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/listings/generate-title")
    public GenerateTitleResponse generateTitle(@RequestBody GenerateTitleRequest request) {
        String title = myTitleGenerationService.generateTitle();
        return new GenerateTitleResponse(title);
    }

}
