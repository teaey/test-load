create database if not exists `test_load`;

use test_load;

DROP TABLE IF EXISTS `player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `account` varchar(64) NOT NULL,
  `logical_server_id` int(11) NOT NULL DEFAULT '1',
  `nickname` varchar(64) NOT NULL DEFAULT '',
  `avatar_id` int(11) NOT NULL DEFAULT '1',
  `level` int(11) NOT NULL DEFAULT '1',
  `exp` int(11) NOT NULL DEFAULT '0',
  `vip_level` int(11) NOT NULL DEFAULT '0',
  `unlocked_bag` int(11) NOT NULL DEFAULT '24',
  `unlocked_bag_bought` int(11) NOT NULL DEFAULT '0',
  `unlocked_guaji_bag` int(11) NOT NULL DEFAULT '12' COMMENT '已解锁挂机背包格数',
  `unlocked_guaji_bag_bought` int(11) NOT NULL DEFAULT '0',
  `game_level_id_` int(11) NOT NULL DEFAULT '1',
  `power_upper` int(11) NOT NULL DEFAULT '50',
  `energy_upper` int(11) NOT NULL DEFAULT '5',
  `power` int(11) NOT NULL DEFAULT '0' COMMENT '体力值',
  `energy` int(11) NOT NULL DEFAULT '0' COMMENT '精力值',
  `soul` int(11) NOT NULL DEFAULT '0' COMMENT '魂力',
  `coin` int(11) NOT NULL DEFAULT '0',
  `yuanbao` int(11) NOT NULL DEFAULT '0',
  `yuanbao_recharged` int(11) NOT NULL DEFAULT '0',
  `yuanbao_consumed` int(11) NOT NULL DEFAULT '0',
  `buff_atk_start` datetime DEFAULT NULL COMMENT '攻击加成状态开始时间',
  `buff_atk_duration_sec` int(11) DEFAULT '0' COMMENT '攻击加成状态持续时间',
  `buff_atk_rate` float DEFAULT NULL COMMENT '攻击上升百分比',
  `buff_def_start` datetime DEFAULT NULL COMMENT '防御加成状态开始时间',
  `buff_def_duration_sec` int(11) DEFAULT '0',
  `buff_def_rate` float DEFAULT NULL,
  `buff_exp_start` datetime DEFAULT NULL,
  `buff_exp_duration_sec` int(11) DEFAULT '0',
  `buff_exp_rate` float DEFAULT NULL,
  `buff_hp_start` datetime DEFAULT NULL,
  `buff_hp_duration_sec` int(11) DEFAULT '0',
  `buff_hp_rate` float DEFAULT NULL,
  `fighting` int(11) NOT NULL DEFAULT '0',
  `arena_ranking` int(11) NOT NULL DEFAULT '0',
  `status` int(11) NOT NULL DEFAULT '1',
  `created` datetime DEFAULT NULL,
  `is_first_steal` tinyint(1) NOT NULL DEFAULT '1',
  `last_bonus_npc_id_` int(11) DEFAULT NULL,
  `ver` int(11) NOT NULL DEFAULT '0',
  `total_points` int(11) NOT NULL DEFAULT '0',
  `current_credits` int(11) NOT NULL DEFAULT '0',
  `daily_fighting_cnt` int(11) NOT NULL DEFAULT '0',
  `daily_stealing_times` int(11) NOT NULL DEFAULT '0' COMMENT '化缘陌生人次数',
  `daily_yuanbao_from_monster` int(11) NOT NULL DEFAULT '0',
  `daily_used_pantao_times` int(11) NOT NULL DEFAULT '0',
  `daily_used_renshenguo_times` int(11) NOT NULL DEFAULT '0',
  `src_channel` varchar(255) NOT NULL DEFAULT '''''',
  `last_login_bonus_time` datetime DEFAULT NULL COMMENT '实际是上次领奖时间，待修改为last_login_bonus_time',
  `is_first_rob_fabao_frag` tinyint(1) NOT NULL DEFAULT '1',
  `has_generated_fabao_from_frag` int(11) NOT NULL DEFAULT '0',
  `guaji_num` int(11) NOT NULL DEFAULT '0',
  `daily_guaji_times` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_nickname` (`nickname`,`logical_server_id`),
  UNIQUE KEY `idx_player` (`logical_server_id`,`account`)
) ENGINE=InnoDB AUTO_INCREMENT=500001 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_all_in_one`
--

DROP TABLE IF EXISTS `player_all_in_one`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_all_in_one` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `daily_guaji_times` int(11) NOT NULL DEFAULT '0',
  `guaji_num` int(11) NOT NULL DEFAULT '0',
  `has_generated_fabao_from_frag` int(11) NOT NULL DEFAULT '0',
  `is_first_rob_fabao_frag` tinyint(1) NOT NULL DEFAULT '1',
  `last_login_bonus_time` datetime DEFAULT NULL COMMENT '实际是上次领奖时间，待修改为last_login_bonus_time',
  `src_channel` varchar(255) NOT NULL DEFAULT '''''',
  `daily_used_renshenguo_times` int(11) NOT NULL DEFAULT '0',
  `daily_used_pantao_times` int(11) NOT NULL DEFAULT '0',
  `daily_yuanbao_from_monster` int(11) NOT NULL DEFAULT '0',
  `daily_stealing_times` int(11) NOT NULL DEFAULT '0' COMMENT '化缘陌生人次数',
  `daily_fighting_cnt` int(11) NOT NULL DEFAULT '0',
  `current_credits` int(11) NOT NULL DEFAULT '0',
  `total_points` int(11) NOT NULL DEFAULT '0',
  `ver` int(11) NOT NULL DEFAULT '0',
  `last_bonus_npc_id_` int(11) DEFAULT NULL,
  `is_first_steal` tinyint(1) NOT NULL DEFAULT '1',
  `created` datetime DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `arena_ranking` int(11) NOT NULL DEFAULT '0',
  `fighting` int(11) NOT NULL DEFAULT '0',
  `buff_hp_rate` float DEFAULT NULL,
  `buff_hp_duration_sec` int(11) DEFAULT '0',
  `buff_hp_start` datetime DEFAULT NULL,
  `buff_exp_rate` float DEFAULT NULL,
  `buff_exp_duration_sec` int(11) DEFAULT '0',
  `buff_exp_start` datetime DEFAULT NULL,
  `buff_def_rate` float DEFAULT NULL,
  `buff_def_duration_sec` int(11) DEFAULT '0',
  `buff_def_start` datetime DEFAULT NULL COMMENT '防御加成状态开始时间',
  `buff_atk_rate` float DEFAULT NULL COMMENT '攻击上升百分比',
  `buff_atk_duration_sec` int(11) DEFAULT '0' COMMENT '攻击加成状态持续时间',
  `buff_atk_start` datetime DEFAULT NULL COMMENT '攻击加成状态开始时间',
  `yuanbao_consumed` int(11) NOT NULL DEFAULT '0',
  `yuanbao_recharged` int(11) NOT NULL DEFAULT '0',
  `yuanbao` int(11) NOT NULL DEFAULT '0',
  `coin` int(11) NOT NULL DEFAULT '0',
  `soul` int(11) NOT NULL DEFAULT '0' COMMENT '魂力',
  `energy` int(11) NOT NULL DEFAULT '0' COMMENT '精力值',
  `power` int(11) NOT NULL DEFAULT '0' COMMENT '体力值',
  `energy_upper` int(11) NOT NULL DEFAULT '5',
  `power_upper` int(11) NOT NULL DEFAULT '50',
  `game_level_id_` int(11) NOT NULL DEFAULT '1',
  `unlocked_guaji_bag_bought` int(11) NOT NULL DEFAULT '0',
  `unlocked_guaji_bag` int(11) NOT NULL DEFAULT '12' COMMENT '已解锁挂机背包格数',
  `unlocked_bag_bought` int(11) NOT NULL DEFAULT '0',
  `unlocked_bag` int(11) NOT NULL DEFAULT '24',
  `vip_level` int(11) NOT NULL DEFAULT '0',
  `exp` int(11) NOT NULL DEFAULT '0',
  `level` int(11) NOT NULL DEFAULT '1',
  `avatar_id` int(11) NOT NULL DEFAULT '1',
  `nickname` varchar(64) NOT NULL DEFAULT '',
  `logical_server_id` int(11) NOT NULL DEFAULT '1',
  `account` varchar(64) NOT NULL,
  `bag_blob` blob,
  `wuxing_raffle_info_blob` blob,
  `task_level_battle_again_blob` blob,
  `wuxing_card_blob` blob,
  `friend_blob` blob,
  `msg_blob` blob,
  `recharge_blob` blob,
  `event_sys_blob` blob,
  `guaji_blob` blob,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=500000 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_bag`
--

DROP TABLE IF EXISTS `player_bag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_bag` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `player_id_` int(10) unsigned NOT NULL DEFAULT '0',
  `bag_type` int(11) NOT NULL DEFAULT '0',
  `cell_id` int(11) unsigned NOT NULL DEFAULT '0',
  `item_type` int(11) NOT NULL DEFAULT '0',
  `item_id_` int(11) unsigned NOT NULL DEFAULT '0',
  `item_amt` int(11) NOT NULL DEFAULT '0',
  `equip_enh_level` int(11) DEFAULT NULL,
  `equip_grade` int(11) DEFAULT NULL,
  `equip_coin_selling` int(11) NOT NULL DEFAULT '0',
  `bag_sort_num` int(11) NOT NULL DEFAULT '102400',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_id` (`id`),
  KEY `idx_pid_bag` (`player_id_`)
) ENGINE=InnoDB AUTO_INCREMENT=10000001 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_event_sys`
--

DROP TABLE IF EXISTS `player_event_sys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_event_sys` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(11) NOT NULL,
  `player_id_` int(11) NOT NULL,
  `other_player_id_` int(11) DEFAULT NULL,
  `other_player_name` varchar(63) DEFAULT NULL,
  `event_content` varchar(127) NOT NULL,
  `event_time` datetime NOT NULL,
  `ref_process_id_` int(11) NOT NULL DEFAULT '0',
  `is_processed` tinyint(1) NOT NULL DEFAULT '0',
  `is_read` tinyint(1) NOT NULL DEFAULT '0',
  `item_type` int(11) DEFAULT NULL,
  `item_id_` int(11) DEFAULT NULL,
  `item_amt` int(11) DEFAULT NULL,
  `guaji_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_id` (`id`),
  KEY `player_id_idx` (`player_id_`)
) ENGINE=InnoDB AUTO_INCREMENT=5000001 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_friend`
--

DROP TABLE IF EXISTS `player_friend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_friend` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `player_id_` int(10) unsigned NOT NULL DEFAULT '0',
  `friend_id_` int(11) unsigned NOT NULL DEFAULT '0' COMMENT 'NPC也存储到player',
  `establish_time` datetime NOT NULL,
  `is_allow_guaji_stolen` tinyint(1) NOT NULL DEFAULT '0' COMMENT '在本次挂机中，是否允许被friend_id_偷',
  `logical_server_id` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_id` (`id`),
  KEY `player_id_idx` (`player_id_`)
) ENGINE=InnoDB AUTO_INCREMENT=5000001 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_guaji`
--

DROP TABLE IF EXISTS `player_guaji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_guaji` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `player_id_` int(11) unsigned NOT NULL DEFAULT '0',
  `logical_server_id` int(11) NOT NULL DEFAULT '1',
  `guaji_start_time` datetime DEFAULT NULL COMMENT '挂机开始时间',
  `guaji_timeout_time` datetime DEFAULT NULL,
  `guaji_zone_id_` int(11) DEFAULT '0' COMMENT '挂机地点',
  `guaji_duration_sec` int(11) DEFAULT '0' COMMENT '挂机时长',
  `guaji_last_view_time` datetime DEFAULT NULL,
  `guaji_monster_cnt` int(11) DEFAULT '0',
  `guaji_coin_got` int(11) DEFAULT '0',
  `guaji_exp_got` int(11) DEFAULT '0',
  `guaji_drop_cnt` int(11) DEFAULT '0',
  `guaji_yuanbao_got` int(11) DEFAULT '0',
  `guaji_status` int(11) NOT NULL DEFAULT '4',
  `guaji_stolen_times` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_id` (`id`),
  KEY `player_id_idx` (`player_id_`)
) ENGINE=InnoDB AUTO_INCREMENT=500001 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_msg`
--

DROP TABLE IF EXISTS `player_msg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_msg` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `player_id_` int(10) unsigned NOT NULL DEFAULT '0',
  `from_type` int(11) unsigned NOT NULL DEFAULT '0',
  `content` varchar(1023) NOT NULL DEFAULT '',
  `msg_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_id` (`id`),
  KEY `player_id_idx` (`player_id_`)
) ENGINE=InnoDB AUTO_INCREMENT=500001 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_recharge`
--

DROP TABLE IF EXISTS `player_recharge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_recharge` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `player_id_` int(11) NOT NULL,
  `total_amount` int(11) NOT NULL,
  `last_op_time` datetime NOT NULL,
  `ver` int(11) NOT NULL DEFAULT '0',
  `add_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_id` (`id`) USING BTREE,
  KEY `player_id__UNIQUE` (`player_id_`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=500001 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_task_level_battle_again`
--

DROP TABLE IF EXISTS `player_task_level_battle_again`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_task_level_battle_again` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `player_id_` int(10) unsigned NOT NULL,
  `task_level_id_` int(11) NOT NULL,
  `level_type` int(11) NOT NULL,
  `remaining_fight_cnt` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_id` (`id`),
  KEY `idx_pid_lvl_btlagn` (`player_id_`)
) ENGINE=InnoDB AUTO_INCREMENT=34999931 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_wuxing_card`
--

DROP TABLE IF EXISTS `player_wuxing_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_wuxing_card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `player_id_` int(11) NOT NULL,
  `tpl_id` int(11) NOT NULL,
  `cur_exp` int(11) NOT NULL DEFAULT '0',
  `upgrade_exp` int(11) NOT NULL DEFAULT '0',
  `level` int(11) NOT NULL DEFAULT '1',
  `card_grade` int(11) NOT NULL,
  `wuxing_type` int(11) NOT NULL,
  `buf_type` int(11) NOT NULL,
  `buf_value` float NOT NULL,
  `grow_rate` float NOT NULL,
  `star_add_rate` float NOT NULL DEFAULT '0',
  `star_level` int(11) NOT NULL DEFAULT '0',
  `equipped_wuxing_type` int(11) DEFAULT NULL,
  `is_equipped` tinyint(1) NOT NULL,
  `is_ex` tinyint(1) NOT NULL,
  `base_exp` int(11) NOT NULL,
  `used_exp` int(11) NOT NULL,
  `create_dt` datetime DEFAULT NULL,
  `last_update_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `idx_pid_card` (`player_id_`)
) ENGINE=InnoDB AUTO_INCREMENT=29999999 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `player_wuxing_raffle_info`
--

DROP TABLE IF EXISTS `player_wuxing_raffle_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_wuxing_raffle_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `player_id_` int(11) DEFAULT NULL,
  `raffle_type` int(11) DEFAULT NULL,
  `remain_time_span` int(11) DEFAULT NULL,
  `daily_remain_free_times` int(11) DEFAULT NULL,
  `is_first_yb` tinyint(1) DEFAULT NULL,
  `req_yb_amt` int(11) DEFAULT NULL,
  `card_cnt_yb` int(11) DEFAULT NULL,
  `accumulate_times` int(11) DEFAULT NULL,
  `total_compensate_times` int(11) DEFAULT NULL,
  `round_start_dt` datetime DEFAULT NULL,
  `create_dt` datetime DEFAULT NULL,
  `last_update_dt` datetime DEFAULT NULL,
  `logical_server_id` int(11) DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `idx_pid_raffle` (`player_id_`)
) ENGINE=InnoDB AUTO_INCREMENT=500000 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-08-05 12:55:26
