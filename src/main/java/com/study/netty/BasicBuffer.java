package com.study.netty;

import java.nio.IntBuffer;

public class BasicBuffer {

	public static void main(String[] args) {
		// 举例说明 Buffer 的使用（简单说明）
		// 创建一个Buffer,大小为5，即可以存放5个int
		IntBuffer intBuffer = IntBuffer.allocate(5);
		
		//向buffer中存数据
		for (int i = 0; i< intBuffer.capacity() ; i++) {
			intBuffer.put(i*2);
		}
		
		//反转 为读
		intBuffer.flip();
		
		for (int i = 0; i < intBuffer.capacity(); i++) {
			System.out.println(intBuffer.get(i));
		}
	}

}
