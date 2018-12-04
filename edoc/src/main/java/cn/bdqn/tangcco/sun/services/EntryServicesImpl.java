package cn.bdqn.tangcco.sun.services;

import cn.bdqn.tangcco.sun.dao.EntryDaoMapper;
import cn.bdqn.tangcco.sun.entity.Entry;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("entryServices")
public class EntryServicesImpl implements EntryServices {
    @Autowired
    private EntryDaoMapper entryDaoMapper;
    @Override
    public PageInfo<Entry> queryAll(Integer pageNo, Integer pageSize,Entry entry) {

        PageHelper.startPage(pageNo,pageSize);
        PageInfo<Entry> pageInfo=new PageInfo<>(entryDaoMapper.queryAll(entry));

        return pageInfo;
    }

    @Override
    public int deleteEntryById(Integer eid) {
        return entryDaoMapper.deleteEntryById(eid);
    }

  /*  @Override
    public List<Entry> queryEntryByCid(Integer cid) {
        return entryDaoMapper.queryEntryByCid(cid);
    }*/
}
