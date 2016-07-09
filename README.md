# Spring-OAuth2-JSON-Support

Example how to use `application/json` as Content-Type for `/oauth/token` endpoint.

Also the `/oauth/token` endpoint is not secured by HTTP Basic Auth by this [line](https://github.com/koprivajakub/Spring-OAuth2-JSON-Support/blob/master/src/cz/koprivajakub/rest/oauth2/server/config/AuthorizationServerConfiguration.java#L38)

## How to authenticate:
```
curl -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{
    "username": "user",
    "password": "password",
    "grant_type": "password",
    "client_id": "acme",
    "client_secret": "acmesecret"
}' "http://localhost:9999/api/oauth/token"
```
