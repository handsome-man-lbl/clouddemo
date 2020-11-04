package com.lbl;

import java.time.LocalDate;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lbl
 * @since 2020-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Stu implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private LocalDate birth;

    private Integer cid;

    private String pic1;

    private String pic2;


}
