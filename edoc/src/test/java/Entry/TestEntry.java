package Entry;

import cn.bdqn.tangcco.sun.entity.Entry;
import cn.bdqn.tangcco.sun.services.EntryServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestEntry {

    @Autowired
    private EntryServices entryServices;


    @Test
    public void testQueryAll(){

        Entry entry1=new Entry();
        entry1.setCid(null);
        for (Entry entry : entryServices.queryAll(1, 5, entry1).getList()) {
            System.out.println(entry);
        }


    }
    @Test
    public void testDeleteEntry(){


        System.out.println(entryServices.deleteEntryById(9));

    }
  /*  @Test
    public void testEntryByCid(){

        for (Entry entry : entryServices.queryEntryByCid(2)) {
            System.out.println(entry);
        }

    }*/



}
