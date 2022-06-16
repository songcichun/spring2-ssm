package com.ryit.service.impl;

import com.ryit.entity.Score;
import com.ryit.mapper.ScoreMapper;
import com.ryit.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author soncihun
 * @date 2022/5/9 21:44
 */

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper mapper;

    @Override
    public List<Score> findAll() {
        return mapper.findAll();

    }

    @Override
    public Score find(int id) {
        return mapper.find(id);
    }

    @Override
    public Integer add(Score score) {
       return mapper.add(score);
    }

    @Override
    public void update(Score score) {
        if (find(score.getId())!= null)
        mapper.update(score);
    }

    @Override
    public void delete(int id) {
        if(find(id) != null)
            mapper.delete(id);
    }
}
