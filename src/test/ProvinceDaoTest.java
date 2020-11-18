package test;

import com.dao.ProvinceDao;

/**
 * @author ywq
 * @date 2020/10/18 22:07
 */
public class ProvinceDaoTest {
    public static void main(String[] args) throws Exception {
        ProvinceDao Dao = new ProvinceDao();

        System.out.println( Dao.getProvinceById(1));

    }

}
