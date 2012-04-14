package de.CallmePain.MobArena.Command;

import de.CallmePain.MobArena.MobArena;

public class MACmdManager {
	public test MA_Test;
	private MACommand MA_Cmd;
	public MACmdManager(MobArena instance) {
		MA_Test = new test(instance);
		MA_Cmd = new MACommand(instance);
		
		instance.getCommand("MobArena").setExecutor(MA_Cmd);
	}
}
