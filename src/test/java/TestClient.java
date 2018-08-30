import dao.RoleMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MyBatisUtil;

public class TestClient {
    @Test
    public void test1(){
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            RoleMapper mapper = (RoleMapper) MyBatisUtil.getMapper(RoleMapper.class);
            
        }
    }
}
