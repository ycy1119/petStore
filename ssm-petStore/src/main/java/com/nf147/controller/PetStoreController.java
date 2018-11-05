package com.nf147.controller;

import com.nf147.dao.PsPetMapper;
import com.nf147.entity.PsPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetStoreController {

    @Autowired
    private PsPetMapper psPetMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String selAllPet(Model model) {
        List<PsPet> petList = psPetMapper.selectAll();
        model.addAttribute("petList", petList);
        System.out.println(petList);
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addPetStroe(PsPet psPet) {
        System.out.println("ok");
        System.out.println(psPet.toString());
        if (psPetMapper.insert(psPet) == 0) {
            System.out.println();
        }
        return new ModelAndView("index.jsp");

    }

    @RequestMapping("/del")
    @ResponseBody
    public String delPid(HttpServletRequest request, HttpServletResponse response) {
       String delItems = request.getParameter("delItems");
       List<Integer> delList = new ArrayList<Integer>();
       String[] strs = delItems.split(",");
       for (String str : strs){
           int num = Integer.parseInt(str);
           delList.add(num);
           psPetMapper.deleteByPrimaryKey(num);
       }
        System.out.println("ddd");
        return "redirect: /pet";
    }
}
