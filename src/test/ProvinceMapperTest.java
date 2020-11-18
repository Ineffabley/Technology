package test;

import com.mapper.ProvinceMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 public class UserMapperTest {

    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml");
        this.userMapper = context.getBean(UserMapper.class);
    }

    @Test
    public void test() {
        System.out.println(this.userMapper.queryUserById(1l));
    }

}

 */
public  class ProvinceMapperTest
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml");
        ProvinceMapper mapper=context.getBean(ProvinceMapper.class);
        System.out.println(mapper.getProvinceById(1));
    }


}
