package com.itactic.kaiy.ssm.model.book;

import com.itactic.kaiy.ssm.entity.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/17&15:34
 * @Version 1.0
 **/
@Api(tags = "book相关接口")
@RestController("bookController")
@RequestMapping("v2/book")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class V2Controller {

    private final IService bookService;

    @RequiresRoles("管理员")
    @RequiresPermissions("获取所有书籍")
    @GetMapping
    @ApiOperation("新增书籍相关接口")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }


    @PostMapping
    public void addBook(@RequestBody Book book){
         bookService.addBook(book);
    }
}
