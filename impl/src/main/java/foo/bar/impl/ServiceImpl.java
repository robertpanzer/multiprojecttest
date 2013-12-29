package foo.bar.impl;

public class ServiceImpl implements foo.bar.IService {

	public String sayHello(String s) {
		return "Hello "+s;
	}
}