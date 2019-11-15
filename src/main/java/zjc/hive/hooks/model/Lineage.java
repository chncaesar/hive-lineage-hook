package zjc.hive.hooks.model;

import java.util.List;
import java.util.Objects;

public class Lineage {
    private String queryId;
    private String queryString;
    private List<Table> sourceTables;
    private List<Table> targetTables;
    private List<UpstreamsDownstream> dependencies;

    public Lineage() {
    }

    public Lineage(String queryId, String queryString, List<Table> sourceTables, List<Table> targetTables, List<UpstreamsDownstream> dependencies) {
        this.queryId = queryId;
        this.queryString = queryString;
        this.sourceTables = sourceTables;
        this.targetTables = targetTables;
        this.dependencies = dependencies;
    }

    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public List<Table> getSourceTables() {
        return sourceTables;
    }

    public void setSourceTables(List<Table> sourceTables) {
        this.sourceTables = sourceTables;
    }

    public List<Table> getTargetTables() {
        return targetTables;
    }

    public void setTargetTables(List<Table> targetTables) {
        this.targetTables = targetTables;
    }

    public List<UpstreamsDownstream> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<UpstreamsDownstream> dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lineage lineage = (Lineage) o;
        return Objects.equals(queryId, lineage.queryId) &&
                Objects.equals(queryString, lineage.queryString) &&
                Objects.equals(sourceTables, lineage.sourceTables) &&
                Objects.equals(targetTables, lineage.targetTables) &&
                Objects.equals(dependencies, lineage.dependencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryId, queryString, sourceTables, targetTables, dependencies);
    }

    @Override
    public String toString() {
        return "Lineage{" +
                "queryId='" + queryId + '\'' +
                ", queryString='" + queryString + '\'' +
                ", sourceTables=" + sourceTables +
                ", targetTables=" + targetTables +
                ", dependencies=" + dependencies +
                '}';
    }
}
