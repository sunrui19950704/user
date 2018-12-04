package cn.bdqn.tangcco.sun.dao;

import cn.bdqn.tangcco.sun.entity.Entry;

import java.util.List;

public interface EntryDaoMapper {



    List<Entry> queryAll(Entry entry);
    int deleteEntryById(Integer eid);
   /* List<Entry> queryEntryByCid(Integer cid);*/

}
