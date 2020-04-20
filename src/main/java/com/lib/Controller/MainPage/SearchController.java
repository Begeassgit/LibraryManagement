package com.lib.Controller.MainPage;

import com.lib.Service.MainPage.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SearchController {
    private final SearchService searchService;

    @Autowired(required = false)
    public SearchController(SearchService searchService){
        this.searchService=searchService;
    }

}

