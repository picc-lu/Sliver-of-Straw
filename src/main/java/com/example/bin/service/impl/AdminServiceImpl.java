package com.example.bin.service.impl;

import com.example.bin.entity.Admin;
import com.example.bin.mapper.AdminMapper;
import com.example.bin.service.AdminService;
import com.example.base.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lu
 * @since 2018-05-25
 */
@Service
public class AdminServiceImpl extends BaseServiceImpl<AdminMapper, Admin> implements AdminService {

}
