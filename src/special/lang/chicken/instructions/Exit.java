package special.lang.chicken.instructions;

import special.lang.chicken.ChickenExecuter;
import special.lang.chicken.Instruction;

public class Exit extends Instruction{

	@Override
	public void run(ChickenExecuter executer) {
		executer.exit();
	}
	
}
