package com.cwj.barrage_video_netty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author :infinite-war
 * @date : 2022/11/3 19:07
 * @desc : 视频评论实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("video_comment")
public class VideoComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id",type= IdType.INPUT)
    private int id;

    @TableId(value = "user_id")
    private int userId;

    @TableId(value="video_id")
    private int videoId;

    @TableId(value="content")
    private String content;

    @TableId(value="create_time")
    private Timestamp createTime;
}
