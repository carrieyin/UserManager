CREATE TABLE `tb_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(32) DEFAULT NULL,
  `password` VARCHAR(32) DEFAULT NULL,
  `name` VARCHAR(32) DEFAULT NULL,
  `age` INT(10) DEFAULT NULL,
  `sex` INT(2) DEFAULT NULL,
  `birthday` DATE DEFAULT NULL,
  `created` DATETIME DEFAULT NULL,
  `updated` DATETIME DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8

insert into `tb_user` (`id`, `user_name`, `password`, `name`, `age`, `sex`, `birthday`, `created`, `updated`) values('2','zpc','123456','√¿≈Æ','22','1','1990-09-02','2019-08-27 20:34:34','2019-09-01 22:32:17');
insert into `tb_user` (`id`, `user_name`, `password`, `name`, `age`, `sex`, `birthday`, `created`, `updated`) values('4','121212','888','≈Ù≥Ã1','18','1','2013-09-29','2019-08-30 22:09:02','2019-08-30 22:09:02');
insert into `tb_user` (`id`, `user_name`, `password`, `name`, `age`, `sex`, `birthday`, `created`, `updated`) values('5',NULL,'9999','6333','18',NULL,'2013-09-29','2019-08-30 22:10:19','2019-08-30 22:10:19');
insert into `tb_user` (`id`, `user_name`, `password`, `name`, `age`, `sex`, `birthday`, `created`, `updated`) values('6','test','root','ydd','20','0','1990-09-09','2019-08-30 22:13:58','2019-08-31 12:34:34');
