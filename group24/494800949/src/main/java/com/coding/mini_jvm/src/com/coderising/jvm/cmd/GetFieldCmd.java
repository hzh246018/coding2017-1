package com.coding.mini_jvm.src.com.coderising.jvm.cmd;

import com.coding.mini_jvm.src.com.coderising.jvm.clz.ClassFile;
import com.coding.mini_jvm.src.com.coderising.jvm.constant.ConstantPool;

public class GetFieldCmd extends TwoOperandCmd {

	public GetFieldCmd(ClassFile clzFile,String opCode) {
		super(clzFile,opCode);		
	}

	@Override
	public String toString(ConstantPool pool) {
		
		return super.getOperandAsField(pool);
	}

	
	

}
