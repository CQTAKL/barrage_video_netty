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
 * @date : 2022/11/3 19:04
 * @desc : 用户视频一对一关系
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_video_state")
public class UserVideoState implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id",type= IdType.INPUT)
    private int id;

    @TableId(value = "user_id")
    private int userId;

    @TableId(value="video_id")
    private int videoId;

    // 是否转发过
    @TableId(value="forward_state")
    private boolean forwardState;

    // 是否收藏过
    @TableId(value="like_state")
    private boolean likeState;
}
