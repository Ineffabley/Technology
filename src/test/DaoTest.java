package test;

import com.bean.DemandBean;
import com.dao.AdminDao;
import com.dao.CityDao;
import com.dao.DemandDao;
import org.junit.Test;

import java.util.List;

/**
 * @author ywq
 * @date 2020/10/18 22:15
 */
public class DaoTest {
    @Test
    public void testAdminDao() throws Exception {
        AdminDao dao=new AdminDao();
        System.out.println(dao.findJGMC("123456"));
    }

    @Test
    public void testCityDao() throws Exception {
        CityDao dao=new CityDao();
        System.out.println(dao.getCityList("130000"));

       System.out.println(dao.getCityById(5).getName());
    }

    @Test
    public void testxdshPolicy() throws Exception {
        DemandDao mapper=new DemandDao();
      List<DemandBean> bean =mapper.xdshPolicy("1","GLBM","办公室",null,null,null,null,null,null);
        System.out.println(bean.size()+"条数据---------------------");
        }
     @Test
    public void testDelete() throws Exception {
         DemandDao mapper=new DemandDao();
         if(mapper.deleteDemand(7))
         {
             System.out.println("删除成功");
         }
         else
             System.out.println("删除失败");
     }

}
