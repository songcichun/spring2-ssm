package com.ryit.service;

import com.ryit.entity.Score;
import com.ryit.mapper.ScoreMapper;

import java.util.List;

/**
 * Description:
 *
 * @author soncihun
 * @date 2022/5/9 21:41
 */

public interface ScoreService {

    List<com.ryit.entity.Score> findAll();

    Score find(int id);

    Integer add(Score score);

    void update(Score score);

    void delete(int id);

}
