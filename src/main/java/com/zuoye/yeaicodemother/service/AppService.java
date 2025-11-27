package com.zuoye.yeaicodemother.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.zuoye.yeaicodemother.model.dto.app.AppQueryRequest;
import com.zuoye.yeaicodemother.model.entity.App;
import com.zuoye.yeaicodemother.model.vo.AppVO;

import java.util.List;

/**
 *  服务层。
 *
 * @author <a href="https://github.com/bugzuoye">作业</a>
 */
public interface AppService extends IService<App> {

    /**
     * 根据id获取应用详情（用户）
     *
     * @return 应用详情
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用查询的QueryWrapper
     *
     * @param appQueryRequest 查询请求
     * @return QueryWrapper
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    /**
     * 获取应用VO列表
     *
     * @param appList 应用实体列表
     * @return 应用VO列表
     */
    List<AppVO> getAppVOList(List<App> appList);

}
