package com.cwj.barrage_video_netty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author :infinite-war
 * @date : 2022/11/3 19:09
 * @desc : 视频附加数据实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("video_data")
public class VideoData implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id",type= IdType.INPUT)
    private int id;

    @TableId(value="video_id")
    private int videoId;

    @TableId(value="comment_count")
    private int commentCount;


    @TableId(value="barrage_count")
    private int barrageCount;

    @TableId(value="like_count")
    private int likeCount;

    @TableId(value="dislike_count")
    private int disLikeCount;

    @TableId(value="collect_count")
    private int collectCount;

    @TableId(value="forward_count")
    private int forwardCount;

    @TableId(value="browse_count")
    private int browseCount;
}
