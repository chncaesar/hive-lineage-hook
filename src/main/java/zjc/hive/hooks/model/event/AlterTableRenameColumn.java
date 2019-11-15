package zjc.hive.hooks.model.event;

import zjc.hive.hooks.model.Table;

import java.util.Objects;

public class AlterTableRenameColumn extends BaseEvent {
    private Table table;
    private String oldColumnName;
    private String newColumnName;

    public AlterTableRenameColumn() {
    }

    public AlterTableRenameColumn(Table table, String oldColumnName, String newColumnName) {
        this.table = table;
        this.oldColumnName = oldColumnName;
        this.newColumnName = newColumnName;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public String getOldColumnName() {
        return oldColumnName;
    }

    public void setOldColumnName(String oldColumnName) {
        this.oldColumnName = oldColumnName;
    }

    public String getNewColumnName() {
        return newColumnName;
    }

    public void setNewColumnName(String newColumnName) {
        this.newColumnName = newColumnName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlterTableRenameColumn that = (AlterTableRenameColumn) o;
        return Objects.equals(table, that.table) &&
                Objects.equals(oldColumnName, that.oldColumnName) &&
                Objects.equals(newColumnName, that.newColumnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, oldColumnName, newColumnName);
    }

    @Override
    public String toString() {
        return "AlterTableRenameColumn{" +
                "table=" + table +
                ", oldColumnName='" + oldColumnName + '\'' +
                ", newColumnName='" + newColumnName + '\'' +
                '}';
    }
}
