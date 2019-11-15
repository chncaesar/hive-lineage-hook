package zjc.hive.hooks.model.event;

import zjc.hive.hooks.model.Lineage;
import zjc.hive.hooks.model.Table;

import java.util.Objects;

public class CreateTableAsSelect extends BaseEvent {
    private Table createdTable;
    private Lineage lineage;

    public CreateTableAsSelect(Table createdTable, Lineage lineage) {
        this.createdTable = createdTable;
        this.lineage = lineage;
    }

    public CreateTableAsSelect() {
    }

    public Table getCreatedTable() {
        return createdTable;
    }

    public void setCreatedTable(Table createdTable) {
        this.createdTable = createdTable;
    }

    public Lineage getLineage() {
        return lineage;
    }

    public void setLineage(Lineage lineage) {
        this.lineage = lineage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateTableAsSelect that = (CreateTableAsSelect) o;
        return Objects.equals(createdTable, that.createdTable) &&
                Objects.equals(lineage, that.lineage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdTable, lineage);
    }

    @Override
    public String toString() {
        return "CreateTableAsSelect{" +
                "createdTable=" + createdTable +
                ", lineage=" + lineage +
                '}';
    }
}
