## Hive table lineage hook
### Deployment
Packaging
```shell
mvn package -DskipTests
```

Deploy the jar to hive lib path

Add config to hive-site.xml

```
<property>
    <name>hive.exec.post.hooks</name>
    <value>zjc.hive.hooks.LineageHook</value>
</property>
```