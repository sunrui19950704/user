package cat;

import cn.bdqn.tangcco.sun.entity.Category;
import cn.bdqn.tangcco.sun.services.CategoryServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestCat {

    @Autowired
    private CategoryServices categoryServices;

    @Test
    public void testQueryAll(){

        for (Category category : categoryServices.queryAll()) {
            System.out.println(category);
        }

    }
}
