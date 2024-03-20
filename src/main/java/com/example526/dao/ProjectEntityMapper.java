package com.example526.dao;

import com.example526.dao.entity.ProjectEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
@Mapper
public interface ProjectEntityMapper {
    /*
    显示项目
     */
    List<ProjectEntity> queryProjectList(ProjectEntity projectEntity);

     /*
   创建项目的基本信息
      */
     int insert(ProjectEntity projectEntity);

     /*
     修改项目
      */
    int updateByPrimaryKeySelective(ProjectEntity projectEntity);

    /*
   根据id删除项目
    */
    int deleteProjectById(ProjectEntity projectEntity);
    /*
    查询项目
     */
    List<ProjectEntity> selectProjectInfo(ProjectEntity projectEntity);
}
