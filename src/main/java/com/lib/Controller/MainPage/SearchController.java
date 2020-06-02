package com.lib.Controller.MainPage;
/*
    Author:Yin
*/
import com.lib.Service.MainPage.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SearchController {
    private final SearchService searchService;

    @Autowired(required = false)
    public SearchController(SearchService searchService){
        this.searchService=searchService;
    }

    @RequestMapping(value = "/SearchByName",method = RequestMethod.POST)
    public ModelAndView searchResult(String input){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object>map =new HashMap<>();
        map.put("BookList","");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }

}

