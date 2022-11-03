-- video_meta
INSERT INTO `video_meta`(`id`,`user_id`,`video_collection_id`,`upload_time`,`duration`,`max_quality`,`video_path`,`cover_path`,`level`,`pass_state`,`suffix`) VALUES (1,10202,1,TIMESTAMP('2022-11-03 19:27:57'),TIMESTAMP('2022-11-03 19:27:59'),1,'/video/aifuahuofea','/cover/auifhauoefaf',5,true,'.mp4');


-- video_data
INSERT INTO `video_data`(`id`,`video_id`,`comment_count`,`barrage_count`,`like_count`,`dislike_count`,`collect_count`,`forward_count`,`browse_count`) VALUES(1,112,0,2,0,0,0,0,5);


-- barrage_meta
INSERT INTO `barrage_meta`(`id`,`video_id`,`sender_id`,`create_time`,content) VALUES (1,1,123456,TIMESTAMP('2022-11-03 19:28:58'),'阿巴阿巴阿巴阿巴阿巴阿巴');
INSERT INTO `barrage_meta`(`id`,`video_id`,`sender_id`,`create_time`,content) VALUES (2,1,1564532,TIMESTAMP('2022-11-03 19:30:00'),'666');

-- barrage_data
INSERT INTO `barrage_data`(`id`,`like_count`,`report_count`) VALUES (1,0,0);
INSERT INTO `barrage_data`(`id`,`like_count`,`report_count`) VALUES (2,0,0);
