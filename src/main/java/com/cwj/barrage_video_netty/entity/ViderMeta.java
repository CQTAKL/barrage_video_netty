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
 * @date : 2022/11/3 19:12
 * @desc : 视频元数据实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("video_meta")
public class ViderMeta implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id",type= IdType.INPUT)
    private int id;

    @TableId(value = "user_id")
    private int userId;

    @TableId(value="video_collection_id")
    private int videoCollectionId;

    @TableId(value="upload_time")
    private Timestamp uploadTime;

    // 视频时长
    @TableId(value="duration")
    private Timestamp duration;

    @TableId(value="max_quality")
    private int maxQuality;

    @TableId(value="video_path")
    private String videoPath;

    @TableId(value="coverPath")
    private String coverPath;

    @TableId(value="level")
    private int level;

    @TableId(value="pass_state")
    private boolean passState;

    // 视频格式
    @TableId(value="suffix")
    private String suffix;
}
