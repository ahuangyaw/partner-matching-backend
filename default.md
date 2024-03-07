# 伙伴匹配系统

**简介**:伙伴匹配系统接口文档

**HOST**:localhost:8080

**联系人**:黄志涛

**Version**:1.0

**接口路径**:/v2/api-docs


[TOC]






# user-controller


## getCurrentUser


**接口地址**:`/api/user/current`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«User»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||User|User|
|&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;email||string||
|&emsp;&emsp;gender||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;planetCode||string||
|&emsp;&emsp;profile||string||
|&emsp;&emsp;tags||string||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userAccount||string||
|&emsp;&emsp;userPassword||string||
|&emsp;&emsp;userRole||integer||
|&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;username||string||
|description||string||
|message||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"avatarUrl": "",
		"createTime": "",
		"email": "",
		"gender": 0,
		"id": 0,
		"isDelete": 0,
		"phone": "",
		"planetCode": "",
		"profile": "",
		"tags": "",
		"updateTime": "",
		"userAccount": "",
		"userPassword": "",
		"userRole": 0,
		"userStatus": 0,
		"username": ""
	},
	"description": "",
	"message": ""
}
```


## deleteUser


**接口地址**:`/api/user/delete`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|body|true|integer||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«boolean»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||boolean||
|description||string||
|message||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": true,
	"description": "",
	"message": ""
}
```


## userLogin


**接口地址**:`/api/user/login`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "userAccount": "",
  "userPassword": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userLoginRequest|userLoginRequest|body|true|UserLoginRequest|UserLoginRequest|
|&emsp;&emsp;userAccount|||false|string||
|&emsp;&emsp;userPassword|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«User»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||User|User|
|&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;email||string||
|&emsp;&emsp;gender||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;planetCode||string||
|&emsp;&emsp;profile||string||
|&emsp;&emsp;tags||string||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userAccount||string||
|&emsp;&emsp;userPassword||string||
|&emsp;&emsp;userRole||integer||
|&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;username||string||
|description||string||
|message||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"avatarUrl": "",
		"createTime": "",
		"email": "",
		"gender": 0,
		"id": 0,
		"isDelete": 0,
		"phone": "",
		"planetCode": "",
		"profile": "",
		"tags": "",
		"updateTime": "",
		"userAccount": "",
		"userPassword": "",
		"userRole": 0,
		"userStatus": 0,
		"username": ""
	},
	"description": "",
	"message": ""
}
```


## userLogout


**接口地址**:`/api/user/logout`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«int»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||integer(int32)|integer(int32)|
|description||string||
|message||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": 0,
	"description": "",
	"message": ""
}
```


## recommendUsers


**接口地址**:`/api/user/recommend`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum|pageNum|query|false|integer(int64)||
|pageSize|pageSize|query|false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«Page«User»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Page«User»|Page«User»|
|&emsp;&emsp;countId||string||
|&emsp;&emsp;current||integer||
|&emsp;&emsp;maxLimit||integer||
|&emsp;&emsp;optimizeCountSql||boolean||
|&emsp;&emsp;orders||array|OrderItem|
|&emsp;&emsp;&emsp;&emsp;asc||boolean||
|&emsp;&emsp;&emsp;&emsp;column||string||
|&emsp;&emsp;pages||integer||
|&emsp;&emsp;records||array|User|
|&emsp;&emsp;&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;&emsp;&emsp;createTime||string||
|&emsp;&emsp;&emsp;&emsp;email||string||
|&emsp;&emsp;&emsp;&emsp;gender||integer||
|&emsp;&emsp;&emsp;&emsp;id||integer||
|&emsp;&emsp;&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;&emsp;&emsp;phone||string||
|&emsp;&emsp;&emsp;&emsp;planetCode||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;tags||string||
|&emsp;&emsp;&emsp;&emsp;updateTime||string||
|&emsp;&emsp;&emsp;&emsp;userAccount||string||
|&emsp;&emsp;&emsp;&emsp;userPassword||string||
|&emsp;&emsp;&emsp;&emsp;userRole||integer||
|&emsp;&emsp;&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;&emsp;&emsp;username||string||
|&emsp;&emsp;searchCount||boolean||
|&emsp;&emsp;size||integer||
|&emsp;&emsp;total||integer||
|description||string||
|message||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"countId": "",
		"current": 0,
		"maxLimit": 0,
		"optimizeCountSql": true,
		"orders": [
			{
				"asc": true,
				"column": ""
			}
		],
		"pages": 0,
		"records": [
			{
				"avatarUrl": "",
				"createTime": "",
				"email": "",
				"gender": 0,
				"id": 0,
				"isDelete": 0,
				"phone": "",
				"planetCode": "",
				"profile": "",
				"tags": "",
				"updateTime": "",
				"userAccount": "",
				"userPassword": "",
				"userRole": 0,
				"userStatus": 0,
				"username": ""
			}
		],
		"searchCount": true,
		"size": 0,
		"total": 0
	},
	"description": "",
	"message": ""
}
```


## userRegister


**接口地址**:`/api/user/register`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "checkPassword": "",
  "planetCode": "",
  "userAccount": "",
  "userPassword": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userRegisterRequest|userRegisterRequest|body|true|UserRegisterRequest|UserRegisterRequest|
|&emsp;&emsp;checkPassword|||false|string||
|&emsp;&emsp;planetCode|||false|string||
|&emsp;&emsp;userAccount|||false|string||
|&emsp;&emsp;userPassword|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«long»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||integer(int64)|integer(int64)|
|description||string||
|message||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": 0,
	"description": "",
	"message": ""
}
```


## searchUsers


**接口地址**:`/api/user/search`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|username|username|query|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«List«User»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|User|
|&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;email||string||
|&emsp;&emsp;gender||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;planetCode||string||
|&emsp;&emsp;profile||string||
|&emsp;&emsp;tags||string||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userAccount||string||
|&emsp;&emsp;userPassword||string||
|&emsp;&emsp;userRole||integer||
|&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;username||string||
|description||string||
|message||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": [
		{
			"avatarUrl": "",
			"createTime": "",
			"email": "",
			"gender": 0,
			"id": 0,
			"isDelete": 0,
			"phone": "",
			"planetCode": "",
			"profile": "",
			"tags": "",
			"updateTime": "",
			"userAccount": "",
			"userPassword": "",
			"userRole": 0,
			"userStatus": 0,
			"username": ""
		}
	],
	"description": "",
	"message": ""
}
```


## searchUsersByTags


**接口地址**:`/api/user/search/tags`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|tagNameList|tagNameList|query|false|array|string|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«List«User»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|User|
|&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;email||string||
|&emsp;&emsp;gender||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;planetCode||string||
|&emsp;&emsp;profile||string||
|&emsp;&emsp;tags||string||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userAccount||string||
|&emsp;&emsp;userPassword||string||
|&emsp;&emsp;userRole||integer||
|&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;username||string||
|description||string||
|message||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": [
		{
			"avatarUrl": "",
			"createTime": "",
			"email": "",
			"gender": 0,
			"id": 0,
			"isDelete": 0,
			"phone": "",
			"planetCode": "",
			"profile": "",
			"tags": "",
			"updateTime": "",
			"userAccount": "",
			"userPassword": "",
			"userRole": 0,
			"userStatus": 0,
			"username": ""
		}
	],
	"description": "",
	"message": ""
}
```


## updateUser


**接口地址**:`/api/user/update`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "avatarUrl": "",
  "createTime": "",
  "email": "",
  "gender": 0,
  "id": 0,
  "isDelete": 0,
  "phone": "",
  "planetCode": "",
  "profile": "",
  "tags": "",
  "updateTime": "",
  "userAccount": "",
  "userPassword": "",
  "userRole": 0,
  "userStatus": 0,
  "username": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|user|user|body|true|User|User|
|&emsp;&emsp;avatarUrl|||false|string||
|&emsp;&emsp;createTime|||false|string||
|&emsp;&emsp;email|||false|string||
|&emsp;&emsp;gender|||false|integer||
|&emsp;&emsp;id|||false|integer||
|&emsp;&emsp;isDelete|||false|integer||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;planetCode|||false|string||
|&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;tags|||false|string||
|&emsp;&emsp;updateTime|||false|string||
|&emsp;&emsp;userAccount|||false|string||
|&emsp;&emsp;userPassword|||false|string||
|&emsp;&emsp;userRole|||false|integer||
|&emsp;&emsp;userStatus|||false|integer||
|&emsp;&emsp;username|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«int»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||integer(int32)|integer(int32)|
|description||string||
|message||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": 0,
	"description": "",
	"message": ""
}
```