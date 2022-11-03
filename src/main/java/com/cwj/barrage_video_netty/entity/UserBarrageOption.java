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
 * @date : 2022/11/3 18:58
 * @desc : 用户弹幕设置信息实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_barrage_option")
public class UserBarrageOption implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id",type= IdType.INPUT)
    private int id;

    @TableId(value = "user_id")
    private int userId;

    @TableId(value="font_size")
    private int fontSize;

    // 透明度
    @TableId(value="transparency")
    private int transparency;

    // 显示区域
    @TableId(value="region")
    private int region ;

    @TableId(value="speed")
    private int speed;
}
