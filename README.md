# amaysim

END POINTS:

https://nino-in-amaysim.herokuapp.com/Products <BR>
https://nino-in-amaysim.herokuapp.com/Products/{code}

Access the Rest Service in Curl. This was deployed in Heroku.

> curl https://nino-in-amaysim.herokuapp.com/Products

Expected result:

Note: Taken from my local test, you'll expect different href when accessing the one depoyed in heroku. Returns the first four field of dataset as header.

<code>
[{"code":"ult_xlarge","name":"Unlimited 8GB","description":"","price":"49.90","links":[{"rel":"self","href":"http://localhost:8080/Products/ult_xlarge"}]},{"cod
e":"ult_medium","name":"Unlimited 2GB","description":"","price":"29.90","links":[{"rel":"self","href":"http://localhost:8080/Products/ult_medium"}]},{"code":"ul
t_large","name":"Unlimited 5GB","description":"","price":"44.90","links":[{"rel":"self","href":"http://localhost:8080/Products/ult_large"}]},{"code":"ult_small"
,"name":"Unlimited 1GB","description":"","price":"24.90","links":[{"rel":"self","href":"http://localhost:8080/Products/ult_small"}]}]
</code>

> curl href":"http://localhost:8080/Products/ult_small

Expected Output:

{"code":"ult_small","name":"Unlimited 1GB","description":"","price":"24.90","expiry":"30","isPlan":true,"isUnlimited":true,"size":"1024","is4G":true,"isAutoRene
w":true,"termURL":"http://amaysim.com.au/terms-conditions/special-conditions-and-service-description-unlimited-1gb.pdf","infoURL":"","_links":
{"List All":{"href":"http://localhost:8080/Products"}}
}


