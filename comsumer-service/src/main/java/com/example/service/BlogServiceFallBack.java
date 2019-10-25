package com.example.service;

import com.example.bean.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是blogservice的熔断降级处理类，用于处理blogservice由于访问服务失败导致的阻塞的降级方案
 */

@Service//feign的熔断器类需要交个IOC容器管理因此需要添加注解
public class BlogServiceFallBack implements BlogService {
	@Override
	public Blog fingByTitle(String title) {
		return new Blog("服务器挂了", "");
	}

	@Override
	public List<Blog> findLis() {
		return new ArrayList<>();
	}
}
