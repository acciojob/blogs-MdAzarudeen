package com.driver.services;

import com.driver.models.Blog;
//import com.driver.models.Image;
//import com.driver.models.User;
import com.driver.repositories.BlogRepository;
import com.driver.repositories.ImageRepository;
import com.driver.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository1;

    @Autowired
    UserRepository userRepository1;

    public List<Blog> showBlogs()
    {
        return blogRepository1.getAllBlogRecords();
    }
    public Blog createAndReturnBlog(Integer userId, String title, String content) {
        Blog b = new Blog();
        b.setTitle(title);
        b.setContent(content);
        b.setPubDate(new Date());
        User user = userRepository1.findById(userId).orElse(null);
        b.setUser(user);
        blogRepository1.save(b);
        return b;
    }

    public Blog findBlogById(int blogId){
        return blogRepository1.findById(blogId).orElse(null);
    }

    public void addImage(Integer blogId, String description, String  dimensions){

    }
    public void deleteBlog(int blogId){
        //delete blog and corresponding images

    }
}
