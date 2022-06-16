package com.ryit.mapper;

import com.ryit.entity.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description:
 *
 * @author soncihun
 * @date 2022/5/9 16:51
 */
@Mapper
public interface ScoreMapper {

    List<Score> findAll();

    Score find(int id);

    Integer add(Score score);

    void update(Score score);

    void delete(int id);


}
