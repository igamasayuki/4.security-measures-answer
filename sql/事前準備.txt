--テーブルがあった場合は事前に削除
DROP TABLE members;

-- メンバー情報テーブル
create table members(
 id serial primary key,
 name text not null,
 mail_address text not null unique,
 password text not null,
 is_admin boolean not null default false -- true:管理者
);

insert into members(name,mail_address,password,is_admin)
values('伊賀将之','iga@gmail.com','123',false)
,('山田太郎','yama@gmail.com','123',false)
,('鈴木一朗','sato@gmail.com','123',false)
,('伊藤次郎','ito@gmail.com','123',false)
,('管理者太郎','admin@gmail.com','123',true);
