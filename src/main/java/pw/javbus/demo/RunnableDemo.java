package pw.javbus.demo;

/**
 * 实现多线程方式2，实现Runable接口
 * 相较继承Thread接口的实现方式，本实现方式可以避免扩展的局限性，也便于资源共享
 * 实现步骤:
 * 	1. 创建真实角色
 *  2. 创建代理角色(Thread类  以真实角色引用为构造参数)
 *  3. 代理角色.start()启动线程
 * @author Lee
 *
 */
public class RunnableDemo implements Runnable{

	private int sum = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(sum > 0){
			System.out.println(Thread.currentThread().getName() + "抢到第" + sum-- +"张票");
		}
	}

}
