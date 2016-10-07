# Getting Started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](http://apidocs.io/illustration/java?step=import0&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](http://apidocs.io/illustration/java?step=import1&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](http://apidocs.io/illustration/java?step=import2&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](http://apidocs.io/illustration/java?step=import3&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

## How to Use

The following section explains how to use the Tester library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](http://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](http://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](http://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](http://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](http://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *TesterLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](http://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

Clicking the ``` Add ``` button will open a dialog where you need to specify Tester in ``` Group Id ``` and TesterLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=org3000.hopto.apimatic)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *TesterLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Initialization

API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};


TesterClient client = new TesterClient();
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [ResponseTypesController](#response_types_controller)
* [TemplateParamsController](#template_params_controller)
* [QueryParamController](#query_param_controller)
* [FormParamsController](#form_params_controller)
* [BodyParamsController](#body_params_controller)
* [EchoController](#echo_controller)
* [HeaderController](#header_controller)
* [ErrorCodesController](#error_codes_controller)

### <a name="response_types_controller"></a>![Class: ](http://apidocs.io/img/class.png "org3000.hopto.apimatic.controllers.ResponseTypesController") ResponseTypesController

#### Get singleton instance

The singleton instance of the ``` ResponseTypesController ``` class can be accessed from the API Client.

```java
ResponseTypesController responseTypes = client.getResponseTypes();
```

#### <a name="get_string_enum_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getStringEnumArrayAsync") getStringEnumArrayAsync

> TODO: Add a method description


```java
void getStringEnumArrayAsync(final APICallBack<List<Days>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getStringEnumArrayAsync(new APICallBack<List<Days>>() {
    public void onSuccess(HttpContext context, List<Days> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_boolean_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getBooleanArrayAsync") getBooleanArrayAsync

> TODO: Add a method description


```java
void getBooleanArrayAsync(final APICallBack<List<Boolean>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getBooleanArrayAsync(new APICallBack<List<Boolean>>() {
    public void onSuccess(HttpContext context, List<Boolean> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_headers_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getHeadersAsync") getHeadersAsync

> TODO: Add a method description


```java
void getHeadersAsync(final APICallBack<Object> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getHeadersAsync(new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_boolean_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getBooleanAsync") getBooleanAsync

> TODO: Add a method description


```java
void getBooleanAsync(final APICallBack<Boolean> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getBooleanAsync(new APICallBack<Boolean>() {
    public void onSuccess(HttpContext context, Boolean response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_datetime_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getDatetimeAsync") getDatetimeAsync

> TODO: Add a method description


```java
void getDatetimeAsync(final APICallBack<Date> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getDatetimeAsync(new APICallBack<Date>() {
    public void onSuccess(HttpContext context, Date response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_datetime_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getDatetimeArrayAsync") getDatetimeArrayAsync

> TODO: Add a method description


```java
void getDatetimeArrayAsync(final APICallBack<List<Date>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getDatetimeArrayAsync(new APICallBack<List<Date>>() {
    public void onSuccess(HttpContext context, List<Date> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_dynamic_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getDynamicAsync") getDynamicAsync

> TODO: Add a method description


```java
void getDynamicAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getDynamicAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_dynamic_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getDynamicArrayAsync") getDynamicArrayAsync

> TODO: Add a method description


```java
void getDynamicArrayAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getDynamicArrayAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_integer_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getIntegerArrayAsync") getIntegerArrayAsync

> Get an array of integers.


```java
void getIntegerArrayAsync(final APICallBack<List<Integer>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getIntegerArrayAsync(new APICallBack<List<Integer>>() {
    public void onSuccess(HttpContext context, List<Integer> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_integer_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getIntegerAsync") getIntegerAsync

> Gets a integer response


```java
void getIntegerAsync(final APICallBack<Integer> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getIntegerAsync(new APICallBack<Integer>() {
    public void onSuccess(HttpContext context, Integer response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_binary_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getBinaryAsync") getBinaryAsync

> gets a binary object


```java
void getBinaryAsync(final APICallBack<InputStream> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getBinaryAsync(new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_precision_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getPrecisionAsync") getPrecisionAsync

> TODO: Add a method description


```java
void getPrecisionAsync(final APICallBack<Double> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getPrecisionAsync(new APICallBack<Double>() {
    public void onSuccess(HttpContext context, Double response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_int_enum_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getIntEnumArrayAsync") getIntEnumArrayAsync

> TODO: Add a method description


```java
void getIntEnumArrayAsync(final APICallBack<List<SuiteCode>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getIntEnumArrayAsync(new APICallBack<List<SuiteCode>>() {
    public void onSuccess(HttpContext context, List<SuiteCode> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_int_enum_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getIntEnumAsync") getIntEnumAsync

> TODO: Add a method description


```java
void getIntEnumAsync(final APICallBack<SuiteCode> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getIntEnumAsync(new APICallBack<SuiteCode>() {
    public void onSuccess(HttpContext context, SuiteCode response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_model_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getModelArrayAsync") getModelArrayAsync

> TODO: Add a method description


```java
void getModelArrayAsync(final APICallBack<List<Employee>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getModelArrayAsync(new APICallBack<List<Employee>>() {
    public void onSuccess(HttpContext context, List<Employee> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_model_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getModelAsync") getModelAsync

> TODO: Add a method description


```java
void getModelAsync(final APICallBack<Employee> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getModelAsync(new APICallBack<Employee>() {
    public void onSuccess(HttpContext context, Employee response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_long_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getLongAsync") getLongAsync

> TODO: Add a method description


```java
void getLongAsync(final APICallBack<Long> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getLongAsync(new APICallBack<Long>() {
    public void onSuccess(HttpContext context, Long response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_string_enum_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ResponseTypesController.getStringEnumAsync") getStringEnumAsync

> TODO: Add a method description


```java
void getStringEnumAsync(final APICallBack<Days> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
responseTypes.getStringEnumAsync(new APICallBack<Days>() {
    public void onSuccess(HttpContext context, Days response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="template_params_controller"></a>![Class: ](http://apidocs.io/img/class.png "org3000.hopto.apimatic.controllers.TemplateParamsController") TemplateParamsController

#### Get singleton instance

The singleton instance of the ``` TemplateParamsController ``` class can be accessed from the API Client.

```java
TemplateParamsController templateParams = client.getTemplateParams();
```

#### <a name="send_integer_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.TemplateParamsController.sendIntegerArrayAsync") sendIntegerArrayAsync

> TODO: Add a method description


```java
void sendIntegerArrayAsync(
        final List<Integer> integers,
        final APICallBack<EchoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| integers |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String integersValue = "[1,2,3,4,5]";
List<Integer> integers = mapper.readValue(integersValue,new TypeReference<List<Integer>> (){});
// Invoking the API call with sample inputs
templateParams.sendIntegerArrayAsync(integers, new APICallBack<EchoResponse>() {
    public void onSuccess(HttpContext context, EchoResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_string_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.TemplateParamsController.sendStringArrayAsync") sendStringArrayAsync

> TODO: Add a method description


```java
void sendStringArrayAsync(
        final List<String> strings,
        final APICallBack<EchoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| strings |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String stringsValue = "[\"abc\", \"def\"]";
List<String> strings = mapper.readValue(stringsValue,new TypeReference<List<String>> (){});
// Invoking the API call with sample inputs
templateParams.sendStringArrayAsync(strings, new APICallBack<EchoResponse>() {
    public void onSuccess(HttpContext context, EchoResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="query_param_controller"></a>![Class: ](http://apidocs.io/img/class.png "org3000.hopto.apimatic.controllers.QueryParamController") QueryParamController

#### Get singleton instance

The singleton instance of the ``` QueryParamController ``` class can be accessed from the API Client.

```java
QueryParamController queryParam = client.getQueryParam();
```

#### <a name="integer_enum_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.QueryParamController.integerEnumArrayAsync") integerEnumArrayAsync

> TODO: Add a method description


```java
void integerEnumArrayAsync(
        final List<SuiteCode> suites,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| suites |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String suitesValue = "[1, 3, 4, 2, 3]";
List<SuiteCode> suites = mapper.readValue(suitesValue,new TypeReference<List<SuiteCode>> (){});
// Invoking the API call with sample inputs
queryParam.integerEnumArrayAsync(suites, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="string_enum_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.QueryParamController.stringEnumArrayAsync") stringEnumArrayAsync

> TODO: Add a method description


```java
void stringEnumArrayAsync(
        final List<Days> days,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| days |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String daysValue = "[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]";
List<Days> days = mapper.readValue(daysValue,new TypeReference<List<Days>> (){});
// Invoking the API call with sample inputs
queryParam.stringEnumArrayAsync(days, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="string_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.QueryParamController.stringArrayAsync") stringArrayAsync

> TODO: Add a method description


```java
void stringArrayAsync(
        final List<String> strings,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| strings |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String stringsValue = "[\"abc\", \"def\"]";
List<String> strings = mapper.readValue(stringsValue,new TypeReference<List<String>> (){});
// Invoking the API call with sample inputs
queryParam.stringArrayAsync(strings, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="number_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.QueryParamController.numberArrayAsync") numberArrayAsync

> TODO: Add a method description


```java
void numberArrayAsync(
        final List<Integer> integers,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| integers |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String integersValue = "[1,2,3,4,5]";
List<Integer> integers = mapper.readValue(integersValue,new TypeReference<List<Integer>> (){});
// Invoking the API call with sample inputs
queryParam.numberArrayAsync(integers, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="multiple_params_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.QueryParamController.multipleParamsAsync") multipleParamsAsync

> TODO: Add a method description


```java
void multipleParamsAsync(
        final MultipleParamsInput input,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| number |  ``` Required ```  | TODO: Add a parameter description |
| precision |  ``` Required ```  | TODO: Add a parameter description |
| string |  ``` Required ```  | TODO: Add a parameter description |
| url |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
MultipleParamsInput collect = new MultipleParamsInput();

int number = 123412312;
collect.setNumber(number);

double precision = 1112.34;
collect.setPrecision(precision);

String string = "\"\"test./;\";12&&3asl\"\";\"qw1&34\"///..//.";
collect.setString(string);

String url = "http://www.abc.com/test?a=b&c=\"http://lolol.com?param=no&another=lol\"";
collect.setUrl(url);

// Invoking the API call with sample inputs
queryParam.multipleParamsAsync(collect, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="url_param_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.QueryParamController.urlParamAsync") urlParamAsync

> TODO: Add a method description


```java
void urlParamAsync(
        final String url,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| url |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String url = "https://www.shahidisawesome.com/and/also/a/narcissist?thisis=aparameter&another=one";
// Invoking the API call with sample inputs
queryParam.urlParamAsync(url, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="no_params_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.QueryParamController.noParamsAsync") noParamsAsync

> TODO: Add a method description


```java
void noParamsAsync(final APICallBack<ServerResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
queryParam.noParamsAsync(new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="simple_query_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.QueryParamController.simpleQueryAsync") simpleQueryAsync

> TODO: Add a method description


```java
void simpleQueryAsync(
        final SimpleQueryInput input,
        Map<String, Object> queryParameters,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| mboolean |  ``` Required ```  | TODO: Add a parameter description |
| number |  ``` Required ```  | TODO: Add a parameter description |
| string |  ``` Required ```  | TODO: Add a parameter description |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |


#### Example Usage

```java
SimpleQueryInput collect = new SimpleQueryInput();

boolean mboolean = true;
collect.setMboolean(mboolean);

int number = 4;
collect.setNumber(number);

String string = "TestString";
collect.setString(string);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
queryParam.simpleQueryAsync(collect, , queryParams, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="string_param_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.QueryParamController.stringParamAsync") stringParamAsync

> TODO: Add a method description


```java
void stringParamAsync(
        final String string,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| string |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String string = "l;asd;asdwe[2304&&;'.d??\\a\\\\\\;sd//";
// Invoking the API call with sample inputs
queryParam.stringParamAsync(string, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="form_params_controller"></a>![Class: ](http://apidocs.io/img/class.png "org3000.hopto.apimatic.controllers.FormParamsController") FormParamsController

#### Get singleton instance

The singleton instance of the ``` FormParamsController ``` class can be accessed from the API Client.

```java
FormParamsController formParams = client.getFormParams();
```

#### <a name="send_string_enum_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendStringEnumArrayAsync") sendStringEnumArrayAsync

> TODO: Add a method description


```java
void sendStringEnumArrayAsync(
        final List<Days> days,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| days |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String daysValue = "[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]";
List<Days> days = mapper.readValue(daysValue,new TypeReference<List<Days>> (){});
// Invoking the API call with sample inputs
formParams.sendStringEnumArrayAsync(days, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_integer_enum_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendIntegerEnumArrayAsync") sendIntegerEnumArrayAsync

> TODO: Add a method description


```java
void sendIntegerEnumArrayAsync(
        final List<SuiteCode> suites,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| suites |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String suitesValue = "[1, 3, 4, 2, 3]";
List<SuiteCode> suites = mapper.readValue(suitesValue,new TypeReference<List<SuiteCode>> (){});
// Invoking the API call with sample inputs
formParams.sendIntegerEnumArrayAsync(suites, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_mixed_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendMixedArrayAsync") sendMixedArrayAsync

> Send a variety for form params. Returns file count and body params


```java
void sendMixedArrayAsync(
        final SendMixedArrayInput input,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| file |  ``` Required ```  | TODO: Add a parameter description |
| integers |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |
| models |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |
| strings |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
SendMixedArrayInput collect = new SendMixedArrayInput();

File file = new File("PathToFile");
collect.setFile(file);

String integersValue = "[1,2,3,4,5]";
List<Integer> integers = mapper.readValue(integersValue,new TypeReference<List<Integer>> (){});
collect.setIntegers(integers);

String modelsValue = "[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}, {\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}]";
List<Employee> models = mapper.readValue(modelsValue,new TypeReference<List<Employee>> (){});
collect.setModels(models);

String stringsValue = "[\"abc\", \"def\"]";
List<String> strings = mapper.readValue(stringsValue,new TypeReference<List<String>> (){});
collect.setStrings(strings);

// Invoking the API call with sample inputs
formParams.sendMixedArrayAsync(collect, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="send_string_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendStringAsync") sendStringAsync

> TODO: Add a method description


```java
void sendStringAsync(
        final String value,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| value |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String value = "TestString";
// Invoking the API call with sample inputs
formParams.sendStringAsync(value, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_file_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendFileAsync") sendFileAsync

> TODO: Add a method description


```java
void sendFileAsync(
        final File file,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| file |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
File file = new File("PathToFile");
// Invoking the API call with sample inputs
formParams.sendFileAsync(file, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_model_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendModelArrayAsync") sendModelArrayAsync

> TODO: Add a method description


```java
void sendModelArrayAsync(
        final List<Employee> models,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| models |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String modelsValue = "[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}, {\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}]";
List<Employee> models = mapper.readValue(modelsValue,new TypeReference<List<Employee>> (){});
// Invoking the API call with sample inputs
formParams.sendModelArrayAsync(models, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_model_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendModelAsync") sendModelAsync

> TODO: Add a method description


```java
void sendModelAsync(
        final Employee model,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| model |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String modelValue = "{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}";
Employee model = mapper.readValue(modelValue,new TypeReference<Employee> (){});
// Invoking the API call with sample inputs
formParams.sendModelAsync(model, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_string_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendStringArrayAsync") sendStringArrayAsync

> TODO: Add a method description


```java
void sendStringArrayAsync(
        final List<String> strings,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| strings |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String stringsValue = "[\"abc\", \"def\"]";
List<String> strings = mapper.readValue(stringsValue,new TypeReference<List<String>> (){});
// Invoking the API call with sample inputs
formParams.sendStringArrayAsync(strings, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_integer_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendIntegerArrayAsync") sendIntegerArrayAsync

> TODO: Add a method description


```java
void sendIntegerArrayAsync(
        final List<Integer> integers,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| integers |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
String integersValue = "[1,2,3,4,5]";
List<Integer> integers = mapper.readValue(integersValue,new TypeReference<List<Integer>> (){});
// Invoking the API call with sample inputs
formParams.sendIntegerArrayAsync(integers, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_long_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.FormParamsController.sendLongAsync") sendLongAsync

> TODO: Add a method description


```java
void sendLongAsync(
        final long value,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| value |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
long value = 5147483647L;
// Invoking the API call with sample inputs
formParams.sendLongAsync(value, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="body_params_controller"></a>![Class: ](http://apidocs.io/img/class.png "org3000.hopto.apimatic.controllers.BodyParamsController") BodyParamsController

#### Get singleton instance

The singleton instance of the ``` BodyParamsController ``` class can be accessed from the API Client.

```java
BodyParamsController bodyParams = client.getBodyParams();
```

#### <a name="send_integer_enum_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.BodyParamsController.sendIntegerEnumArrayAsync") sendIntegerEnumArrayAsync

> TODO: Add a method description


```java
void sendIntegerEnumArrayAsync(
        final List<SuiteCode> suites,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| suites |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String suitesValue = "[1, 3, 4, 2, 3]";
    List<SuiteCode> suites = mapper.readValue(suitesValue,new TypeReference<List<SuiteCode>> (){});
    // Invoking the API call with sample inputs
    bodyParams.sendIntegerEnumArrayAsync(suites, new APICallBack<ServerResponse>() {
        public void onSuccess(HttpContext context, ServerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="send_string_enum_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.BodyParamsController.sendStringEnumArrayAsync") sendStringEnumArrayAsync

> TODO: Add a method description


```java
void sendStringEnumArrayAsync(
        final List<Days> days,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| days |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String daysValue = "[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]";
    List<Days> days = mapper.readValue(daysValue,new TypeReference<List<Days>> (){});
    // Invoking the API call with sample inputs
    bodyParams.sendStringEnumArrayAsync(days, new APICallBack<ServerResponse>() {
        public void onSuccess(HttpContext context, ServerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="send_string_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.BodyParamsController.sendStringAsync") sendStringAsync

> TODO: Add a method description


```java
void sendStringAsync(
        final String value,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| value |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String value = "TestString";
// Invoking the API call with sample inputs
bodyParams.sendStringAsync(value, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="send_dynamic_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.BodyParamsController.sendDynamicAsync") sendDynamicAsync

> TODO: Add a method description


```java
void sendDynamicAsync(
        final Object dynamic,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dynamic |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String dynamicValue = "{\"uid\": \"1123213\", \"name\": \"Shahid\"}";
    Object dynamic = mapper.readValue(dynamicValue,new TypeReference<Object> (){});
    // Invoking the API call with sample inputs
    bodyParams.sendDynamicAsync(dynamic, new APICallBack<ServerResponse>() {
        public void onSuccess(HttpContext context, ServerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="send_model_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.BodyParamsController.sendModelArrayAsync") sendModelArrayAsync

> TODO: Add a method description


```java
void sendModelArrayAsync(
        final List<Employee> models,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| models |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String modelsValue = "[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}, {\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}]";
    List<Employee> models = mapper.readValue(modelsValue,new TypeReference<List<Employee>> (){});
    // Invoking the API call with sample inputs
    bodyParams.sendModelArrayAsync(models, new APICallBack<ServerResponse>() {
        public void onSuccess(HttpContext context, ServerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="send_model_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.BodyParamsController.sendModelAsync") sendModelAsync

> TODO: Add a method description


```java
void sendModelAsync(
        final Employee model,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| model |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String modelValue = "{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}";
    Employee model = mapper.readValue(modelValue,new TypeReference<Employee> (){});
    // Invoking the API call with sample inputs
    bodyParams.sendModelAsync(model, new APICallBack<ServerResponse>() {
        public void onSuccess(HttpContext context, ServerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="send_integer_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.BodyParamsController.sendIntegerArrayAsync") sendIntegerArrayAsync

> TODO: Add a method description


```java
void sendIntegerArrayAsync(
        final List<Integer> integers,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| integers |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String integersValue = "[1,2,3,4,5]";
    List<Integer> integers = mapper.readValue(integersValue,new TypeReference<List<Integer>> (){});
    // Invoking the API call with sample inputs
    bodyParams.sendIntegerArrayAsync(integers, new APICallBack<ServerResponse>() {
        public void onSuccess(HttpContext context, ServerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="send_string_array_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.BodyParamsController.sendStringArrayAsync") sendStringArrayAsync

> sends a string body param


```java
void sendStringArrayAsync(
        final List<String> sarray,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| sarray |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String sarrayValue = "[\"abc\", \"def\"]";
    List<String> sarray = mapper.readValue(sarrayValue,new TypeReference<List<String>> (){});
    // Invoking the API call with sample inputs
    bodyParams.sendStringArrayAsync(sarray, new APICallBack<ServerResponse>() {
        public void onSuccess(HttpContext context, ServerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

### <a name="echo_controller"></a>![Class: ](http://apidocs.io/img/class.png "org3000.hopto.apimatic.controllers.EchoController") EchoController

#### Get singleton instance

The singleton instance of the ``` EchoController ``` class can be accessed from the API Client.

```java
EchoController echo = client.getEcho();
```

#### <a name="query_echo_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.EchoController.queryEchoAsync") queryEchoAsync

> TODO: Add a method description


```java
void queryEchoAsync(
        Map<String, Object> queryParameters,
        final APICallBack<EchoResponse> callBack)
```

#### Example Usage

```java
// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
echo.queryEchoAsync(queryParams, new APICallBack<EchoResponse>() {
    public void onSuccess(HttpContext context, EchoResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="form_echo_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.EchoController.formEchoAsync") formEchoAsync

> Sends the request including any form params as JSON


```java
void formEchoAsync(
        final Object input,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| input |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String inputValue = "{\"uid\": \"1123213\", \"name\": \"Shahid\"}";
Object input = mapper.readValue(inputValue,new TypeReference<Object> (){});
// Invoking the API call with sample inputs
echo.formEchoAsync(input, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="json_echo_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.EchoController.jsonEchoAsync") jsonEchoAsync

> Echo's back the request


```java
void jsonEchoAsync(
        final Object input,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| input |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String inputValue = "{\"uid\": \"1123213\", \"name\": \"Shahid\"}";
    Object input = mapper.readValue(inputValue,new TypeReference<Object> (){});
    // Invoking the API call with sample inputs
    echo.jsonEchoAsync(input, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

### <a name="header_controller"></a>![Class: ](http://apidocs.io/img/class.png "org3000.hopto.apimatic.controllers.HeaderController") HeaderController

#### Get singleton instance

The singleton instance of the ``` HeaderController ``` class can be accessed from the API Client.

```java
HeaderController header = client.getHeader();
```

#### <a name="send_headers_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.HeaderController.sendHeadersAsync") sendHeadersAsync

> Sends a single header params


```java
void sendHeadersAsync(
        final SendHeadersInput input,
        final APICallBack<ServerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customHeader |  ``` Required ```  | TODO: Add a parameter description |
| value |  ``` Required ```  | Represents the value of the custom header |


#### Example Usage

```java
SendHeadersInput collect = new SendHeadersInput();

String customHeader = "TestString";
collect.setCustomHeader(customHeader);

String value = "TestString";
collect.setValue(value);

// Invoking the API call with sample inputs
header.sendHeadersAsync(collect, new APICallBack<ServerResponse>() {
    public void onSuccess(HttpContext context, ServerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="error_codes_controller"></a>![Class: ](http://apidocs.io/img/class.png "org3000.hopto.apimatic.controllers.ErrorCodesController") ErrorCodesController

#### Get singleton instance

The singleton instance of the ``` ErrorCodesController ``` class can be accessed from the API Client.

```java
ErrorCodesController errorCodes = client.getErrorCodes();
```

#### <a name="get500_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ErrorCodesController.get500Async") get500Async

> TODO: Add a method description


```java
void get500Async(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
errorCodes.get500Async(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get400_async"></a>![Method: ](http://apidocs.io/img/method.png "org3000.hopto.apimatic.controllers.ErrorCodesController.get400Async") get400Async

> TODO: Add a method description


```java
void get400Async(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
errorCodes.get400Async(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



