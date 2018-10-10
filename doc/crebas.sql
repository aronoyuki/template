/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/10/9 20:37:42                           */
/*==============================================================*/


/*==============================================================*/
/* Table: PERMISSION                                            */
/*==============================================================*/
create table PERMISSION
(
   UUID                 VARCHAR(32) not null comment '����',
   CODE                 VARCHAR(50) comment '����',
   NAME                 VARCHAR(50) comment '����',
   RESOURCE             VARCHAR(256) comment '��Դ',
   "DESCRIBE"           VARCHAR(256) comment '����',
   CREATE_TIME          DATE comment '����ʱ��',
   UPDATE_TIME          DATE comment '����ʱ��',
   DELETE_TME           DATE comment 'ɾ��ʱ��',
   CREATOR_ID           VARCHAR(32) comment '������ID',
   UPDATER_ID           VARCHAR(32) comment '������ID',
   DELETER_ID           VARCHAR(32) comment 'ɾ����ID',
   DELETED              tinyint comment '�Ƿ�ɾ��',
   VERSION              numeric comment '�汾��'
);

alter table PERMISSION
   add primary key (UUID);

/*==============================================================*/
/* Table: ROLE                                                  */
/*==============================================================*/
create table ROLE
(
   UUID                 VARCHAR(32) not null comment '����',
   CODE                 VARCHAR(50) comment '����',
   NAME                 VARCHAR(50) comment '����',
   "DESCRIBE"           VARCHAR(256) comment '����',
   CREATE_TIME          DATE comment '����ʱ��',
   UPDATE_TIME          DATE comment '����ʱ��',
   DELETE_TME           DATE comment 'ɾ��ʱ��',
   CREATOR_ID           VARCHAR(32) comment '������ID',
   UPDATER_ID           VARCHAR(32) comment '������ID',
   DELETER_ID           VARCHAR(32) comment 'ɾ����ID',
   DELETED              tinyint comment '�Ƿ�ɾ��',
   VERSION              numeric comment '�汾��'
);

alter table ROLE
   add primary key (UUID);

/*==============================================================*/
/* Table: ROLE_PERMISSION_REF                                   */
/*==============================================================*/
create table ROLE_PERMISSION_REF
(
   UUID                 VARCHAR(32) not null comment '����',
   ROLE_UUID            VARCHAR(32) comment '��ɫ����',
   PERMISSION_UUID      VARCHAR(32) comment 'Ȩ������',
   "DESCRIBE"           VARCHAR(256) comment '����',
   CREATE_TIME          DATE comment '����ʱ��',
   UPDATE_TIME          DATE comment '����ʱ��',
   DELETE_TME           DATE comment 'ɾ��ʱ��',
   CREATOR_ID           VARCHAR(32) comment '������ID',
   UPDATER_ID           VARCHAR(32) comment '������ID',
   DELETER_ID           VARCHAR(32) comment 'ɾ����ID',
   DELETED              tinyint comment '�Ƿ�ɾ��',
   VERSION              numeric comment '�汾��'
);

alter table ROLE_PERMISSION_REF
   add primary key (UUID);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   UUID                 VARCHAR(32) not null comment '����',
   CODE                 VARCHAR(50) comment '����',
   NAME                 VARCHAR(50) comment '����',
   PASSWORD             VARCHAR(256) comment '����',
   SALT                 VARCHAR(50) comment '��',
   "DESCRIBE"           char(10) comment '����',
   CREATE_TIME          DATE comment '����ʱ��',
   UPDATE_TIME          DATE comment '����ʱ��',
   DELETE_TME           DATE comment 'ɾ��ʱ��',
   CREATOR_ID           VARCHAR(32) comment '������ID',
   UPDATER_ID           VARCHAR(32) comment '������ID',
   DELETER_ID           VARCHAR(32) comment 'ɾ����ID',
   DELETED              tinyint comment '�Ƿ�ɾ��',
   VERSION              numeric comment '�汾��'
);

alter table USER
   add primary key (UUID);

/*==============================================================*/
/* Table: USER_ROLE_REF                                         */
/*==============================================================*/
create table USER_ROLE_REF
(
   UUID                 VARCHAR(32) not null comment '����',
   USER_UUID            VARCHAR(32) comment '�û�����',
   ROLE_UUID            VARCHAR(32) comment '��ɫ����',
   "DESCRIBE"           VARCHAR(256) comment '����',
   CREATE_TIME          DATE comment '����ʱ��',
   UPDATE_TIME          DATE comment '����ʱ��',
   DELETE_TME           DATE comment 'ɾ��ʱ��',
   CREATOR_ID           VARCHAR(32) comment '������ID',
   UPDATER_ID           VARCHAR(32) comment '������ID',
   DELETER_ID           VARCHAR(32) comment 'ɾ����ID',
   DELETED              tinyint comment '�Ƿ�ɾ��',
   VERSION              numeric comment '�汾��'
);

alter table USER_ROLE_REF
   add primary key (UUID);

alter table ROLE_PERMISSION_REF add constraint FK_P_PR_R foreign key (PERMISSION_UUID)
      references PERMISSION (UUID) on delete restrict on update restrict;

alter table ROLE_PERMISSION_REF add constraint FK_R_RP_R foreign key (ROLE_UUID)
      references ROLE (UUID) on delete restrict on update restrict;

alter table USER_ROLE_REF add constraint FK_R_UR_R foreign key (ROLE_UUID)
      references ROLE (UUID) on delete restrict on update restrict;

alter table USER_ROLE_REF add constraint FK_U_UR_R foreign key (USER_UUID)
      references USER (UUID) on delete restrict on update restrict;

