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
 * @date : 2022/11/3 19:06
 * @desc : 视频集合实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("video_collection")
public class VideoCollection implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id",type= IdType.INPUT)
    private int id;

    @TableId(value = "user_id")
    private int userId;

    // 封面路径
    @TableId(value="cover_path")
    private String coverPath;
}
