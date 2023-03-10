package com.springboot.blog.payload;

import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PostDto {
	
	private long id;
	
	@NotEmpty
	@Size(min = 2, message = "Post title should have atleast 2 characters")
	private String title;
	
	@NotEmpty
	@Size(min = 10, message = "Post description should have atleast 10 characters")
	private String description;
	
	@NotEmpty
	private String content;
	private Set<CommentDto> comments;
}
