package com.ryit.controller;



import com.ryit.entity.CommonResult;
import com.ryit.entity.Score;
import com.ryit.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Description:
 *
 * @author soncihun
 * @date 2022/5/9 22:09
 */
@Controller
@RequestMapping(value = "/Score")
@Slf4j
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PostMapping(value = "/add")
    @ResponseBody
    public CommonResult add(Score score){
        int result = service.add(score);
        log.info("*******插入的结果",result);
        if(result > 0){
            return new CommonResult<Integer>(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败");
        }
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public CommonResult find(@PathVariable("id") int id){
        Score result = service.find(id);
        log.info("****插入结果",result);
        if(result != null){
           return new CommonResult<Score>(200,"查询成功",result);
        }else {
            return new CommonResult(444,"查询失败");
        }
    }

    @GetMapping("/findAll")
    @ResponseBody
    public CommonResult findAll(){
        List<Score> result = service.findAll();
        log.info("****插入查询结果",result);
        return new CommonResult(200,"查询成功",result);
    }

    @PostMapping("/update")
    public void update(Score score){
        service.update(score);
    }

    @PostMapping("/delete")
    public void delete(int id){
        service.delete(id);
    }



}
