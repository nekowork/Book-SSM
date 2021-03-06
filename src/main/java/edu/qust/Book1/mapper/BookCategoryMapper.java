package edu.qust.Book1.mapper;

import edu.qust.Book1.bean.BookCategory;
import edu.qust.Book1.bean.BookCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookCategoryMapper {
    int countByExample(BookCategoryExample example);

    int deleteByExample(BookCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookCategory record);

    int insertSelective(BookCategory record);

    List<BookCategory> selectByExample(BookCategoryExample example);

    BookCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookCategory record, @Param("example") BookCategoryExample example);

    int updateByExample(@Param("record") BookCategory record, @Param("example") BookCategoryExample example);

    int updateByPrimaryKeySelective(BookCategory record);

    int updateByPrimaryKey(BookCategory record);
}