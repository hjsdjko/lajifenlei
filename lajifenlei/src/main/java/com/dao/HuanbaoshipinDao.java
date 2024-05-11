package com.dao;

import com.entity.HuanbaoshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanbaoshipinView;

/**
 * 环保视频 Dao 接口
 *
 * @author 
 */
public interface HuanbaoshipinDao extends BaseMapper<HuanbaoshipinEntity> {

   List<HuanbaoshipinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
