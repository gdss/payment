[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=gdss_payment&metric=alert_status)](https://sonarcloud.io/dashboard?id=gdss_payment)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=gdss_payment&metric=coverage)](https://sonarcloud.io/dashboard?id=gdss_payment)

## Endpoints

Method | Path
--- | ---
GET | `/payment/{salary}`

## Run with Docker

- Run `./build` script

```
curl http://localhost:8090/payment/10000
```
```JSON
{
  "salary": 10000,
  "inss": 751.99,
  "irrf": 1673.84,
  "payment": 7574.17
}
```
