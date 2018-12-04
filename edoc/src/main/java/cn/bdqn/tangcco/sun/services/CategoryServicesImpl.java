package cn.bdqn.tangcco.sun.services;

import cn.bdqn.tangcco.sun.dao.CategoryDaoMapper;
import cn.bdqn.tangcco.sun.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("carServices")
public class CategoryServicesImpl implements CategoryServices {
    @Autowired
    private CategoryDaoMapper categoryDaoMapper;
    @Override
    public List<Category> queryAll() {
        return categoryDaoMapper.queryAll();
    }
}
