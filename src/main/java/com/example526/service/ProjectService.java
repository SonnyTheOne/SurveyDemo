package com.example526.service;


import com.example526.common.utils.UUIDUtil;
import com.example526.dao.ProjectEntityMapper;
import com.example526.dao.entity.ProjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectEntityMapper projectEntityMapper;
    /*
    查询项目列表
     */
    public List<ProjectEntity> queryProjectList(ProjectEntity projectEntity){
        List<ProjectEntity> result = projectEntityMapper.queryProjectList(projectEntity);
        return result;
    }
    /*
    新增
     */
    public int addProjectInfo(ProjectEntity projectEntity){
        projectEntity.setId(UUIDUtil.getOneUUID());
        int projectResult = projectEntityMapper.insert(projectEntity);
        if (projectResult != 0){
            return 3;//数字3代表项目存在
        }else {
            return projectResult;
        }
    }
    /*
    修改用户信息
     */
    public int modifyProjectInfo(ProjectEntity projectEntity){
        int projectResult = projectEntityMapper.updateByPrimaryKeySelective(projectEntity);
        return projectResult;
    }
    /*
    删除项目
     */
    public int deleteProjectById(ProjectEntity projectEntity){
        int projectrResult = projectEntityMapper.deleteProjectById(projectEntity);
        return projectrResult;
    }
    /*
    查询项目
    */
    public List<ProjectEntity> selectProjectInfo(ProjectEntity projectEntity){
        List<ProjectEntity> result = projectEntityMapper.selectProjectInfo(projectEntity);
        return result;
    }
}
