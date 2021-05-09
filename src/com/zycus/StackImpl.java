package com.zycus;

import java.util.Arrays;

interface IStack<T> {
	public void push(Object value);

	public T pop();
}

public class StackImpl implements IStack {
	protected int tos = -1;
	protected int size = 0;
	protected int capacity;
	protected Object stackArray[];

	StackImpl(Object stackArray[]) {
		this.stackArray = stackArray;
	}

	public static void main(String arg[]) {
		Object val[]= new Object[5];
		StackImpl stackImpl = new StackImpl(val);
		stackImpl.push(10);
		stackImpl.push(20);
		stackImpl.push(20);
		stackImpl.pop();
	}

	@Override
	public void push(Object value) {
		if (this.size >= stackArray.length) {
			int newSize = size + (size >> 1);
			stackArray = Arrays.copyOf(stackArray, newSize);
		}
		stackArray[size++] = value;

	}

	@Override
	public Object pop() {
		if (size <= 0) {
			return null;
		}
		Object value = stackArray[--size];

		stackArray[size] = null;
		int reducedSize = size;
		if (size >= capacity && size < (reducedSize + (reducedSize << 1))) {
			System.arraycopy(stackArray, 0, stackArray, 0, size);
		}
		return value;

	}
}