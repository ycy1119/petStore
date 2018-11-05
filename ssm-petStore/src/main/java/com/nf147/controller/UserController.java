package com.nf147.controller;

import com.nf147.dao.PsUserMapper;
import com.nf147.entity.PsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {

    @Autowired
    PsUserMapper psUserMapper;

    @RequestMapping
    @ResponseBody
    public String selAll(Model model){
        List<PsUser> psUserList = psUserMapper.selectAll();
        if (psUserList ==null) {
            return "没有查询到信息！";
        }else {
            model.addAttribute(psUserList);
            return "查询成功!";
        }
    }

    @PostMapping("/{psUserList}")
    @ResponseBody
    public String addUser(List<PsUser> psUserList) {
        for (PsUser psUser : psUserList) {
            if (psUserMapper.insert(psUser) == 0)
                System.out.println("插入数据" + psUser + "失败");
            System.out.println("插入数据" + psUser + "成功");
        }
        return "插入数据成功";
    }

    @PutMapping("/{psUser}")
    @ResponseBody
    public String updateUser(@PathVariable PsUser psUser) {
        if (psUserMapper.updateByPrimaryKey(psUser) == 0)
            return "修改失败";
        return "修改成功";
    }

    @DeleteMapping("/{uId}")
    @ResponseBody
    public String delUser(@PathVariable int uId) {
        if (uId == 0) {
            return "用户ID找不到";
        }
        if (psUserMapper.deleteByPrimaryKey(uId) == 0)
            return "删除失败！";
        return "删除成功！";
    }
}
