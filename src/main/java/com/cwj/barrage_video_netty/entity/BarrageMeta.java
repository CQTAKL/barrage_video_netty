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
 * @date : 2022/11/3 18:50
 * @desc : 弹幕元数据实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("barrage_meta")
public class BarrageMeta implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id",type= IdType.INPUT)
    private int id;

    @TableId(value = "video_id")
    private int videoId;

    @TableId(value="sender_id")
    private int senderId;

    @TableId(value="creaete_time")
    private Timestamp createTime;

    @TableId(value="content")
    private String content;
}
