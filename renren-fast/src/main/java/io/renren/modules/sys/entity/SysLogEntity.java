/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;


/**
 * 系统日志
 *
 * @author Mark sunlightcs@gmail.com
 */

@TableName("sys_log")
public class SysLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@TableId
	private Long id;
	//用户名
	private String username;
	//用户操作
	private String operation;
	//请求方法
	private String method;
	//请求参数
	private String params;
	//执行时长(毫秒)
	private Long time;
	//IP地址
	private String ip;
	//创建时间
	private Date createDate;

	public SysLogEntity() {
	}

	public SysLogEntity(Long id, String username, String operation, String method, String params, Long time, String ip, Date createDate) {
		this.id = id;
		this.username = username;
		this.operation = operation;
		this.method = method;
		this.params = params;
		this.time = time;
		this.ip = ip;
		this.createDate = createDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getOperation() {
		return operation;
	}

	public String getMethod() {
		return method;
	}

	public String getParams() {
		return params;
	}

	public Long getTime() {
		return time;
	}

	public String getIp() {
		return ip;
	}

	public Date getCreateDate() {
		return createDate;
	}

	@Override
	public String toString() {
		return "SysLogEntity{" +
				"id=" + id +
				", username='" + username + '\'' +
				", operation='" + operation + '\'' +
				", method='" + method + '\'' +
				", params='" + params + '\'' +
				", time=" + time +
				", ip='" + ip + '\'' +
				", createDate=" + createDate +
				'}';
	}
}
