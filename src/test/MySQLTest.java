package test;

/**
 * @author ywq
 * @date 2020/10/22 20:01
 */
import java.sql.*;

public class MySQLTest {

    static final String  DRIVER="com.mysql.jdbc.Driver";
    static final String DB="jdbc:mysql://localhost/xuqiufenxi";
    static final String USER="root";
    static final String PASSWD="root";
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {

            //加载驱动程序

            Class.forName(DRIVER);
            System.out.println("连接数据库...");
            //打开一个连接
            conn=DriverManager.getConnection(DB, USER, PASSWD);

            //执行一个查询
            stmt=conn.createStatement();
            String sql="select name,English from student where name='scofield' ";
            //获得结果集
            rs=stmt.executeQuery(sql);
            System.out.println("name"+"\t\t"+"English");
            while(rs.next())
            {
                System.out.print(rs.getString(1)+"\t\t");
                System.out.println(rs.getInt(2));
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally
        {
            if(rs!=null)
                try {
                    rs.close();
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            if(stmt!=null)
                try {
                    stmt.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            if(conn!=null)
                try {
                    conn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }
    }
}