package com.cwj.barrage_video_netty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.sql.Timestamp;

/**
 * @author :infinite-war
 * @date : 2022/11/3 18:58
 * @desc :
 */
public class UserBarrageOption {
    @TableId(value="id",type= IdType.INPUT)
    private int id;

    @TableId(value = "user_id")
    private int userId;

    @TableId(value="font_size")
    private int fontSize;

    @TableId(value="transparency")
    private ;

    @TableId(value="content")
    private String content;
}
