/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/10/13 22:54:40                          */
/*==============================================================*/


/*==============================================================*/
/* Table: PERMISSION                                            */
/*==============================================================*/
create table PERMISSION
(
   UUID                 VARCHAR(32) not null comment '主键',
   CODE                 VARCHAR(50) comment '编码',
   NAME                 VARCHAR(50) comment '名字',
   RESOURCE             VARCHAR(256) comment '资源',
   `DESCRIBE`           VARCHAR(256) comment '描述',
   CREATE_TIME          DATE comment '创建时间',
   UPDATE_TIME          DATE comment '更新时间',
   DELETE_TME           DATE comment '删除时间',
   CREATOR_ID           VARCHAR(32) comment '创建者ID',
   UPDATER_ID           VARCHAR(32) comment '更新者ID',
   DELETER_ID           VARCHAR(32) comment '删除者ID',
   DELETED              tinyint comment '是否删除',
   VERSION              numeric comment '版本号',
   primary key (UUID)
);

/*==============================================================*/
/* Table: ROLE                                                  */
/*==============================================================*/
create table ROLE
(
   UUID                 VARCHAR(32) not null comment '主键',
   CODE                 VARCHAR(50) comment '编码',
   NAME                 VARCHAR(50) comment '名字',
   `DESCRIBE`           VARCHAR(256) comment '描述',
   CREATE_TIME          DATE comment '创建时间',
   UPDATE_TIME          DATE comment '更新时间',
   DELETE_TME           DATE comment '删除时间',
   CREATOR_ID           VARCHAR(32) comment '创建者ID',
   UPDATER_ID           VARCHAR(32) comment '更新者ID',
   DELETER_ID           VARCHAR(32) comment '删除者ID',
   DELETED              tinyint comment '是否删除',
   VERSION              numeric comment '版本号',
   primary key (UUID)
);

/*==============================================================*/
/* Table: ROLE_PERMISSION_REF                                   */
/*==============================================================*/
create table ROLE_PERMISSION_REF
(
   UUID                 VARCHAR(32) not null comment '主键',
   ROLE_UUID            VARCHAR(32) comment '角色主键',
   PERMISSION_UUID      VARCHAR(32) comment '权限主键',
   `DESCRIBE`           VARCHAR(256) comment '描述',
   CREATE_TIME          DATE comment '创建时间',
   UPDATE_TIME          DATE comment '更新时间',
   DELETE_TME           DATE comment '删除时间',
   CREATOR_ID           VARCHAR(32) comment '创建者ID',
   UPDATER_ID           VARCHAR(32) comment '更新者ID',
   DELETER_ID           VARCHAR(32) comment '删除者ID',
   DELETED              tinyint comment '是否删除',
   VERSION              numeric comment '版本号',
   primary key (UUID)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   UUID                 VARCHAR(32) not null comment '主键',
   CODE                 VARCHAR(50) comment '编码',
   NAME                 VARCHAR(50) comment '名字',
   PASSWORD             VARCHAR(256) comment '密码',
   SALT                 VARCHAR(50) comment '盐',
   `DESCRIBE`           char(10) comment '描述',
   CREATE_TIME          DATE comment '创建时间',
   UPDATE_TIME          DATE comment '更新时间',
   DELETE_TME           DATE comment '删除时间',
   CREATOR_ID           VARCHAR(32) comment '创建者ID',
   UPDATER_ID           VARCHAR(32) comment '更新者ID',
   DELETER_ID           VARCHAR(32) comment '删除者ID',
   DELETED              tinyint comment '是否删除',
   VERSION              numeric comment '版本号',
   primary key (UUID)
);

/*==============================================================*/
/* Table: USER_ROLE_REF                                         */
/*==============================================================*/
create table USER_ROLE_REF
(
   UUID                 VARCHAR(32) not null comment '主键',
   USER_UUID            VARCHAR(32) comment '用户主键',
   ROLE_UUID            VARCHAR(32) comment '角色主键',
   `DESCRIBE`           VARCHAR(256) comment '描述',
   CREATE_TIME          DATE comment '创建时间',
   UPDATE_TIME          DATE comment '更新时间',
   DELETE_TME           DATE comment '删除时间',
   CREATOR_ID           VARCHAR(32) comment '创建者ID',
   UPDATER_ID           VARCHAR(32) comment '更新者ID',
   DELETER_ID           VARCHAR(32) comment '删除者ID',
   DELETED              tinyint comment '是否删除',
   VERSION              numeric comment '版本号',
   primary key (UUID)
);

alter table ROLE_PERMISSION_REF add constraint FK_P_PR_R foreign key (PERMISSION_UUID)
      references PERMISSION (UUID) on delete restrict on update restrict;

alter table ROLE_PERMISSION_REF add constraint FK_R_RP_R foreign key (ROLE_UUID)
      references ROLE (UUID) on delete restrict on update restrict;

alter table USER_ROLE_REF add constraint FK_R_UR_R foreign key (ROLE_UUID)
      references ROLE (UUID) on delete restrict on update restrict;

alter table USER_ROLE_REF add constraint FK_U_UR_R foreign key (USER_UUID)
      references USER (UUID) on delete restrict on update restrict;

