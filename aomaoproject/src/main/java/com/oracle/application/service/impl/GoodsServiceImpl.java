package com.oracle.application.service.impl;

import com.oracle.application.entity.Goods;
import com.oracle.application.mapper.GoodsMapper;
import com.oracle.application.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangchaoyang
 * @since 2024-10-16
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
