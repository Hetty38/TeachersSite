package com.site.TeachersSite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
/*Контроллер -это модуль программы, который слушает запросы от польз-лей и возвр. к.-то данные*/
public class GreeatingsController {

        @GetMapping("/greeting")/*делает он это по вот этому пути*/
        public String greeting
                (@RequestParam(name="name", required=false, defaultValue="World")
                         String name, Map<String,Object> model) {
            model.put("name", name);
            return "greeting";/*возвр файл шаблона*/
        }
    @GetMapping
    public String main(Map<String,Object> model )
    {
        model.put("myau","MurMur");
        return "main";
    }
    }

