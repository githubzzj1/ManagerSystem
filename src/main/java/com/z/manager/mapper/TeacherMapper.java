package com.z.manager.mapper;
import com.z.manager.dao.IBaseDao;
import com.z.manager.entity.Teacher;

public interface TeacherMapper extends IBaseDao<Teacher> {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    Teacher getTeacherByName(String name);
}