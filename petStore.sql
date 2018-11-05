use mysql;

create database petStore;

use petStore;

-- 标签表
create table ps_tag(
	t_id int auto_increment primary key,
	name varchar(30)
);
insert into ps_tag values 
(1,'波斯猫'),
(2,'哈巴狗')

select * from ps_tag;


-- 类别表
create table ps_category(
	c_id int auto_increment primary key,
	name varchar(20)
);
insert into ps_category values
(1,'狗类'),
(2,'猫类')

select * from ps_category;

-- 宠物表
create table  ps_pet(
	
	p_id int auto_increment primary key,
	c_id int ,
	name varchar(20),
	photoUrls varchar(20),
	t_id int ,
	status varchar(10) ,
	foreign key(c_id) references ps_category(c_id),
	foreign key(t_id) references ps_tag(t_id)
);

insert into ps_pet(p_id,c_id,name,t_id,status) values
(1001,1,'小嘟',2,'在售'),
(1002,2,'小花',1,'在售')

select * from ps_pet;

-- 订单表
create table ps_order(
	o_id int auto_increment primary key,
	p_id int ,
	quantity int ,
	shipDate datetime,
	status varchar(10),
	complete varchar(10),
	foreign key(p_id) references ps_pet(p_id)
);

-- 用户表
create table ps_user(
	u_id int auto_increment primary key,
	u_name varchar(20),
	firstName varchar(30),
	lastName varchar(30),
	email varchar(30),
	password varchar(30),
	u_status int 
);

create table ps_apiresponse(
	code int,
	type varchar(20),
	message varchar(300)
);

