// Below code is from web link: http://blog.csdn.net/scobala/article/details/6804334
// Tom Xue: show what the stopClass will cause - getBeanInfo(Class<?> beanClass, Class<?> stopClass)
package MyTest;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * 
 * @Person类
 * 
 */
class Person {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}

/*
 * 学生类
 */
class Student extends Person {
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}

public class IntrospectorDemo {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		BeanInfo info = Introspector.getBeanInfo(Student.class, Person.class);
		PropertyDescriptor[] props = info.getPropertyDescriptors();
		for (PropertyDescriptor prop : props) {
			System.out.println(prop.getName() + "::" + prop.getPropertyType());
		}
	}

}
