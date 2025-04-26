package com.demoMVC;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
        int k = i + j;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("result", k);
        return mv;
    }
}