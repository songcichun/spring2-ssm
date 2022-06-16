package com.ryit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author soncihun
 * @date 2022/5/9 16:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {

    private int id;

    private int stu_id;

    private String c_name;

    private int grade;


}
