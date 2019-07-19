package com.itactic.kaiy.ssm.dao;

import com.itactic.kaiy.ssm.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName BookMapper
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/17&15:14
 * @Version 1.0
 **/
public interface BookMapper {
    int addBook(Book book);

//    int deleteBookById(Long id);
//
//    int updateBookById(Book book);
//
//    Book getBookById(Long id);

    List<Book> getAllBook();
}
