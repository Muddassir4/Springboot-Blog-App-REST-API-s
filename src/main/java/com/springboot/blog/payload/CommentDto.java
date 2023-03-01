package com.springboot.blog.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class CommentDto {

	private long id;
	
	@NotEmpty(message = "name should not be null or empty")
	private String name;
	
	@Email
	@NotEmpty(message = "Email should not be null or empty")
	private String email;
	
	@NotEmpty
	@Size(min = 10,message = "comment body must be minimum 10 characters")
	private String body;
}
