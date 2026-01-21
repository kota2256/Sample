package com.example.form;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {

	@NotBlank(groups=ValidGroup1.class)	//nullも空文字も空白もNG、String専用
	@Email(groups=ValidGroup2.class)
	private String userId;
	
	@NotBlank(groups=ValidGroup1.class)
	@Length(min=4, max=100, groups=ValidGroup2.class)
	@Pattern(regexp="^[a-zA-Z0-9]+$", groups=ValidGroup2.class)		//^：文字列の先頭、[a-zA-Z0-9]：許可する文字、+：1文字以上（*：0文字以上）、$：文字列の末尾
	private String password;		//@Pattern(regexp = "^[0-9]{4}$")：数字のみ4桁
	@NotBlank(groups=ValidGroup1.class)
	private String userName;
	
	@NotNull(groups=ValidGroup1.class)
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birthday;
	@NotNull	(groups=ValidGroup1.class)	//空文字や空白はOK
	@Min(value=20, groups=ValidGroup2.class)
	@Max(value=100, groups=ValidGroup2.class)
	private Integer age;
	@NotNull(groups=ValidGroup1.class)
	private Integer gender;
	
}
