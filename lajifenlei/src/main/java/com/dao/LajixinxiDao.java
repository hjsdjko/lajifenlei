package com.dao;

import com.entity.LajixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LajixinxiView;

/**
 * 垃圾信息 Dao 接口
 *
 * @author 
 */
public interface LajixinxiDao extends BaseMapper<LajixinxiEntity> {

   List<LajixinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
