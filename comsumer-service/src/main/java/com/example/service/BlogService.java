package com.example.service;

import com.example.bean.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 访问blog的feign的客户端服务
 */
@FeignClient(name = "producer-service", fallback = BlogServiceFallBack.class)
//name属性必须是服务的名称,也就是spring.application.name的值
public interface BlogService {

	//feign支持用springmvc的requestmapping注解来
	@RequestMapping("/blog/{title}")
	Blog fingByTitle(@PathVariable("title") String title);

	@RequestMapping("/blog/findList")
	List<Blog> findLis();
}
