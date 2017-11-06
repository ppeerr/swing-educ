SETLOCAL
set NLS_LANG=AMERICAN_AMERICA.AL32UTF8
set LANG=en_US.utf8

java -jar C:\Users\PER\.m2\repository\org\liquibase\liquibase-core\3.5.3\liquibase-core-3.5.3.jar --driver=oracle.jdbc.OracleDriver --classpath=C:\Users\PER\.m2\repository\com\oracle\ojdbc14\10.2.0.4.0\ojdbc6.jar --username=lb_dev --changeLogFile=master.xml --url=jdbc:oracle:thin:@localhost:1521:XE --password=lb_dev --logLevel=info rollback -Dliquibase.rollbackCount=2
ENDLOCAL
