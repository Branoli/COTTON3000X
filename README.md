```yaml
token: 410890615:AAEqZ9N2QusaWYIlXf49LhVzEX61tlmgMdQ

services:
  - uri: http://api.dev.pi.itnap.ru/v1/logs
    alias: dev
    secret: xuGGyKOi84dvZo7mKIlcsNljUxkpLSmo687srCxnwFCsoFaAuqy12LcaBY3Zzt7i
  - uri: http://api.prod.pi.itnap.ru/v1/logs
    alias: prod
    secret: xuGGyKOi84dvZo7mKIlcsNljUxkpLSmo687srCxnwFCsoFaAuqy12LcaBY3Zzt7i
allowed_users:
  - r9032504423
  - abogushov
  - luwao
  - justPasxa

time_intervals:
  check_service: 10
  alert_interval: 60
  silent_starttime: 7:00 PM
  silent_endtime: 2:00 AM

provider:
  name: clickhouse
  config:
    host: localhost
    db_name: pibot

proxy:
  proxy_url: socks5://51.15.245.50:1080
  port: 1080
  username: Napoleon
  password: NapoleonB
```

