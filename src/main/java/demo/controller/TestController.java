package demo.controller;

import demo.dto.ParaDTO;
import demo.dto.ResultDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@Api("swaggerDemoController相关的api")
public class TestController{
    @PostMapping("/hi")
    public ResultDTO hi(@RequestBody ParaDTO paraDTO){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setResultCode("1");
        resultDTO.setResultMsg("请求成功");
        HashMap<String,Object> data = new HashMap<>();
        data.put("hello",paraDTO.toString());
        resultDTO.setData(data);
        return resultDTO;
    }

}