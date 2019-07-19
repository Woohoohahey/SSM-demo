package com.itactic.kaiy.ssm.model.book;

import com.itactic.kaiy.ssm.dao.BookMapper;
import com.itactic.kaiy.ssm.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName Iservice
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/17&15:33
 * @Version 1.0
 **/
@Service("bookService")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class IService {

    private final BookMapper bookMapper;

    public List<Book> getAllBook(){
        return bookMapper.getAllBook();
    }

    public void addBook(Book book){
        bookMapper.addBook(book);
    }
}
