package cn.bdqn.tangcco.sun.controller;

import cn.bdqn.tangcco.sun.entity.Entry;
import cn.bdqn.tangcco.sun.services.CategoryServices;
import cn.bdqn.tangcco.sun.services.EntryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("entry")
public class EntryController {
    @Autowired
    private CategoryServices categoryServices;
    @Autowired
    private EntryServices entryServices;

    @RequestMapping("queryAll")
    public String queryAll(Integer pageNo, Integer pageSize, Entry entry, Model model){

        if(null==pageNo){
            pageNo=1;
        }
        if(null==pageSize){
            pageSize=5;
        }
        model.addAttribute("cat",categoryServices.queryAll());
        model.addAttribute("pageInfo",entryServices.queryAll(pageNo,pageSize,entry));

        return "listEntry";
    }

    @RequestMapping("deleteEntryById")
    public String deleteEntryById(Integer eid,Model model){

        if(entryServices.deleteEntryById(eid)!=0){
            model.addAttribute("message","删除成功");
        }



        return "forward:/entry/queryAll";
    }




}
