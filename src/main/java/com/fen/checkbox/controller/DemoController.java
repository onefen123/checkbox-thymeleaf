package com.fen.checkbox.controller;

import com.fen.checkbox.entity.Demo;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {
    @RequestMapping("/add")
    public String add(Model model){
        return "add";
    }


    @RequestMapping("/add_post")
    public String edit_post(HttpServletRequest request, Model model){
        List<String> aihao=new ArrayList<>();

        String[] ah=request.getParameterValues("aihao");
        String abc="";
        for (int i=0;i<ah.length;i++){
            abc=abc.concat(ah[i])+"\n";
        }

        System.out.println(abc);
//        aihao.add(request.getParameter("aihao"));
//        aihao.add(request.getParameter("aihao"));
//        aihao.add(request.getParameter("aihao"));
//        aihao.add(request.getParameter("aihao"));





        return "add";
    }
}
