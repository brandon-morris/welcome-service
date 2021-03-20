### welcome-service 
_A dummy rest service for example / learning purposes_

```
request url: {{host}}/welcome-service
method: GET

{
    "message": "Welcome!"
}


```

[See the qa-automation postman repo/directory that pairs with this service](https://github.com/brandon-morris/qa-automation)

[See the qa-performance jmeter repo/directory that pairs with this service](https://github.com/brandon-morris/qa-performance)


##### Startup instructions
_If you have java setup properly on your machine, you "should" not have to change anything in the service itself_


###### Build the service
```
./gradlew build
```

###### Start the service
_From the root directory of the service run_
```
./gradlew bootRun
```

##### Note: PORT set to 8081 in application.properties

