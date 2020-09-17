DROP TABLE IF EXISTS `order_details`;
CREATE TABLE `order_details` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `consumer_id` bigint(20) NOT NULL,
    `commodity_id` bigint(20) DEFAULT 1,
    `quantity` int(11) DEFAULT 1,
    `timestamp` varchar(20) DEFAULT NULL,
    `status` varchar(20) DEFAULT NULL COMMENT 'status',
    `callback_url` varchar(30) DEFAULT NULL,
    `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    UNIQUE KEY `index_consumer_id` (`consumer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=100000 DEFAULT CHARSET=utf8;