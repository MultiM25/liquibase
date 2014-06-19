package liquibase.statement.core;

import liquibase.changelog.ChangeSet;
import liquibase.statement.AbstractSqlStatement;
import liquibase.structure.DatabaseObject;

public class MarkChangeSetRanStatement extends AbstractSqlStatement {

    private ChangeSet changeSet;

    private ChangeSet.ExecType execType;

    public MarkChangeSetRanStatement(ChangeSet changeSet, ChangeSet.ExecType execType) {
        this.changeSet = changeSet;
        this.execType = execType;
    }

    public ChangeSet getChangeSet() {
        return changeSet;
    }

    public ChangeSet.ExecType getExecType() {
        return execType;
    }

    @Override
    protected DatabaseObject[] getBaseAffectedDatabaseObjects() {
        return null;
    }
}
