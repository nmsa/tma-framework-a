UPDATE METABASE_DATABASE
SET
DETAILS = '{"host":"mysql-0.mysql.default.svc.cluster.local","port":3306,"dbname":"knowledge","user":"root","password":"passtobereplaced","ssl":false,"tunnel-port":22,"let-user-control-scheduling":false}'
WHERE Name = 'knowledge';