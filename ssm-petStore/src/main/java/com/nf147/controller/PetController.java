package com.nf147.controller;

import com.nf147.dao.PsPetMapper;
import com.nf147.entity.PsPet;
import org.apache.ibatis.annotations.Update;
import org.mariadb.jdbc.internal.io.input.PacketInputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ps")
public class PetController {

    PsPetMapper psPetMapper;

    @PostMapping
    @ResponseBody
    public boolean addPet(PsPet psPet){
        if (psPetMapper .insert(psPet) !=0)
            return true;
        return false;
    }

    @DeleteMapping("/{Pid}")
    @ResponseBody
    public boolean delPet(int Pid){
        if (psPetMapper.deleteByPrimaryKey(Pid)==0)
                return false;
        return true;
    }

    @PostMapping("/{Pid}")
    @ResponseBody
    public boolean updatePet(@PathVariable int Pid, PsPet P){

        if (Pid==0){
            return false;
        }
        if (psPetMapper.updateByPrimaryKey(P) ==0)
            return false;
        return true;
    }


}