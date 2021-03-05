## Run with Docker

- Run `./build` script

## Endpoints

Method | Path
--- | ---
GET | `/payment/{salary}`

## Demo

```
curl https://gdss-payment.herokuapp.com/payment/10000
```
```JSON
{
  "salary": 10000,
  "inss": 751.99,
  "irrf": 1673.84,
  "payment": 7574.17
}
```
