package com.briup.service.impl;
import com.briup.bean.Category;
import com.briup.mapper.BookMapper;
import com.briup.mapper.CategoryMapper;
import com.briup.service.ICategoryService;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;
/**
 * @author zqq
 * @date 2022/9/23
 */
public class CategoryServiceImp implements ICategoryService {
    private static SqlSessionFactory sqlSessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    @Override
    public List<Category> findAllCategorys() {
        //不需要业务逻辑判断
        CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);
        List<Category> categoryList = mapper.findAllCategorys();
        return categoryList;
    }
}
