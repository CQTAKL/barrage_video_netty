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
 * @date : 2022/11/3 18:51
 * @desc : 弹幕附加数据实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("barrage_data")
public class BarrageData implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value="id",type= IdType.INPUT)
    private int id;

    @TableId(value = "like_count")
    private int likeCount;

    // 举报数
    @TableId(value="report_count")
    private int reportCount;
}
