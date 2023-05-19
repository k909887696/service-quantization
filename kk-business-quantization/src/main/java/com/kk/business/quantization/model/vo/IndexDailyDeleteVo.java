package com.kk.business.quantization.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 指数日线行情删除实体
 * </p>
 *
 * @author kk
 * @since 2023-05-19
 */
@Data
@ApiModel(value = "指数日线行情删除实体", description = "指数日线行情")
public class IndexDailyDeleteVo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
    * TS指数代码
    */
    @ApiModelProperty("TS指数代码")
    private String tsCode;
    /**
    * 交易日期
    */
    @ApiModelProperty("交易日期")
    private String tradeDate;


}
