package com.cmb.ApiEncyclopedia.controller;

import com.cmb.ApiEncyclopedia.bean.ApiDTO;
import com.cmb.ApiEncyclopedia.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by SENSETIME\yuanzhen on 19-5-31 上午10:54
 */

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ApiService apiService;

    @RequestMapping("/query")
    public ApiDTO testQuery() {
        return apiService.selectApiByName("get");
    }

    @RequestMapping("/insert")
    public List<ApiDTO> testInsert() {
        apiService.insertService();
        return apiService.selectAllUser();
    }

    @RequestMapping("/delete")
    public String testDelete() {
        apiService.deleteService(3);
        return "OK";
    }

}
