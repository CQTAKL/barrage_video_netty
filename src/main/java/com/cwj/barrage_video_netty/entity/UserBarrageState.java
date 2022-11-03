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
 * @date : 2022/11/3 19:01
 * @desc : 用户弹幕一对一关系实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_barrage_state")
public class UserBarrageState implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id",type= IdType.INPUT)
    private int id;

    // 点赞用户id
    @TableId(value = "user_id")
    private int userId;

    // 弹幕所属的视频id
    @TableId(value="video_id")
    private int videoId;

    @TableId(value="barrage_id")
    private int barrageId;

    // 是否点过赞
    @TableId(value="like_state")
    private boolean likeState;
}
