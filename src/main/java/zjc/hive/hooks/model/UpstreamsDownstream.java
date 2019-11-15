package zjc.hive.hooks.model;


import java.util.List;
import java.util.Objects;

public class UpstreamsDownstream {
    private List<DbTblCol> upstreams;
    private DbTblCol downstream;

    public UpstreamsDownstream(List<DbTblCol> ups, DbTblCol downs){
        this.upstreams = ups;
        this.downstream = downs;
    }

    public UpstreamsDownstream() {
    }

    public List<DbTblCol> getUpstreams() {
        return upstreams;
    }

    public void setUpstreams(List<DbTblCol> upstreams) {
        this.upstreams = upstreams;
    }

    public DbTblCol getDownstream() {
        return downstream;
    }

    public void setDownstream(DbTblCol downstream) {
        this.downstream = downstream;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpstreamsDownstream that = (UpstreamsDownstream) o;
        return Objects.equals(upstreams, that.upstreams) &&
                Objects.equals(downstream, that.downstream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upstreams, downstream);
    }

    @Override
    public String toString() {
        return "UpstreamsDownstream{" +
                "upstreams=" + upstreams +
                ", downstream=" + downstream +
                '}';
    }
}
