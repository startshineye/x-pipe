package com.ctrip.xpipe.redis.console.migration.model;

import com.ctrip.xpipe.redis.console.model.MigrationEventTbl;

public interface MigrationEvent {
	MigrationEventTbl getEvent();
	MigrationCluster getMigrationCluster(long clusterId);
	
	void addMigrationCluster(MigrationCluster migrationClsuter);
	
}
