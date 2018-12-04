package cn.bdqn.tangcco.sun.services;

import cn.bdqn.tangcco.sun.entity.Entry;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EntryServices {


    PageInfo<Entry> queryAll(Integer pageNo,Integer pageSize,Entry entry);

    int deleteEntryById(Integer eid);
    /*List<Entry> queryEntryByCid(Integer cid);*/

}
