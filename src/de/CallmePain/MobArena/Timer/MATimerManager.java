package de.CallmePain.MobArena.Timer;

import de.CallmePain.MobArena.MobArena;

public class MATimerManager {
	public int taskId1 = 0;
	public int taskId2 = 0;
	public int taskid3 = 0;
	public MATimer1 MA_T1;
	public MATimer2 MA_T2;
	public MATimer3 MA_T3;
	
	public MATimerManager(MobArena instance) {
		MA_T1 = new MATimer1(instance);
		MA_T2 = new MATimer2(instance);
		MA_T3 = new MATimer3(instance);
	}
}
