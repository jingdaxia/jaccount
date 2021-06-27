package com.jcy.account.controller;


import com.jcy.account.entity.MonthRecord;
import com.jcy.account.service.IMonthRecordService;
import com.jcy.common.controller.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jcy
 * @since 2021-06-25
 */
@RestController
@RequestMapping("/record")
public class MonthRecordController {
    @Autowired
    private IMonthRecordService monthRecordService;

    @GetMapping("/monthRecord")
    public CommonResult monthRecord() {
        List<MonthRecord> list = monthRecordService.list();
        return new CommonResult().success(list);
    }
}
