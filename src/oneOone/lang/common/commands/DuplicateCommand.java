package oneOone.lang.common.commands;

import oneOone.lang.common.ICommand;
import oneOone.lang.common.ICompiler;
import oneOone.lang.common.IDecompiler;
import oneOone.lang.common.IExecutor;

public class DuplicateCommand extends ICommand {
	
	@Override
	public String getName() {
		return "duplicate";
	}
	
	@Override
	public void execute(IExecutor exe) {
		exe.stack.add(exe.getLastStackNumber());
	}
	
	@Override
	public String compile(ICompiler compiler, String code) {
		return getCompiledPrefix();
	}
	
	@Override
	public String decompile(IDecompiler decompiler, String binary) {
		return getDecompiledPrefix();
	}
	
	@Override
	public String getCompiledPrefix() {
		return "11101";
	}
	
	@Override
	public String getDecompiledPrefix() {
		return getName();
	}

	@Override
	public String getDescription() {
		return "Duplicates the last value on the stack."
				+ "For example if the stack is [1,2,3] and you do a duplicate command, the stack will look like [1,2,3,3]";
	}
	
}
