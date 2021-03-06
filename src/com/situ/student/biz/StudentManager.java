package com.situ.student.biz;

import java.util.ArrayList;
import java.util.List;

import com.situ.student.dao.StudentDao;
import com.situ.student.entity.Student;

public class StudentManager {
	List<Student> list = new ArrayList<Student>();
	StudentDao studentDao = new StudentDao();
	
	/**
	 * 传入新增的学生对象，调用DAO层insert方法存入数据库中
	 * @param student
	 * @return
	 */
	public boolean add(Student student) {
		int result = studentDao.insert(student);
		return (result > 0) ? true : false;
	}
	
	/**
	 * 传入修改后的一个学生对象，调用DAO层update方法，修改数据库中的数据
	 * @param student
	 * @return
	 */
	public boolean modify(Student student) {
		int result = studentDao.update(student);
		return (result > 0) ? true : false;
	}
	
//	/**
//	 * 删除一个学生的信息：传入一个需要删除的学生的id，调用DAO层delete方法，根据id删除对应的学生数据
//	 * @param id :一个需要删除的学生的id
//	 * @return 删除成功返回：true，删除失败返回：false
//	 */
//	public boolean delete(int id) {
//		int result = studentDao.delete(id);
//		return (result > 0) ? true : false;
//	}
	
	/**
	 * 删除一个或者多个学生的信息：传入所有需要删除的学生的数组，调用DAO层重载的delete方法，根据数组中对应学生的id删除学生数据
	 * @param idArr
	 * @return 删除成功返回：true，删除失败返回：false
	 */
	public boolean delete(int[] idArr) {
		int result = studentDao.delete(idArr);
		return (result > 0) ? true : false;
	}
	
	/**
	 * 查询所有班级的学生信息：调用此方法，返回数据库中全部学生的信息
	 * @return
	 */
	public List<Student> findAllList() {
		return studentDao.findAllList();
	}

	/**
	 * 查询被选中的班级的所有学生信息：调用此方法，返回数据库中全部学生的信息
	 * @return
	 */
	public List<Student> findAll(String className) {
		return studentDao.findAll(className);
	}
	
	/**
	 * 从数据库中查询对应学生id的信息：传入需要修改的学生的id，返回数据库中对应学生的信息
	 * @param id
	 * @return
	 */
	public Student findById(int id) {
		return studentDao.findById(id);
	}
	
	/**
	 * 查询所有符合条件的学生的信息：传入需要查询的一个student对象，调用DAO层的按条件查找学生的方法，并返回查询结果
	 * @param student
	 * @return
	 */
	public List<Student> findByConditionStudent(Student student) {
		return studentDao.findByConditionStudent(student);
	}
}
