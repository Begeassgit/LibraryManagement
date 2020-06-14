package com.lib.Controller.MainFunciton;
/*
    Author:Yin
*/
import com.lib.Service.MainFunction.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SearchController {
    private final SearchService searchService;

    @Autowired(required = false)
    public SearchController(SearchService searchService){
        this.searchService=searchService;
    }

    @RequestMapping(value = "/Search",method = RequestMethod.POST)
    public ModelAndView searchResult(String input,int type){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object>map =new HashMap<>();
        switch (type){
            case 1:{
                map.put("BookList",searchService.searchByName(input));
            } break;
            case 2:{
                map.put("BookList",searchService.searchByAuthor(input));
            } break;
            default:{
                map.put("BookList",null);
            }
        }
        modelAndView.setViewName("BookResult");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }

}

