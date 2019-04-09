# Serverless Development

#### Concept

Instead of running an application on a server, the application is abstracted into functions whose deployment is managed by the service provider.

That is, the maintenance, initiation etc. of a server is taken away, so you can concentrate on business logic.

The main idea is that instead of an application or monolithic service, each (micro/nano) service (or function) should implement a single action or responsibility.

It adds the complexity in deployment and reduces the complexity of development.

#### Scalability
Serverless scalability is abstracted since you don't have to manage monitoring and spinning up/down of new servers. You just need to specify the maximum number of simultaneous function requests, the serverless platform does the scaling for you.

#### Pricing
Serverless computing pricing model is directly proportional to usage.

---

#### AWS Lambda Concepts


AWS Lambda lets you run _functions_ in a serverless environment to process events in the language of your choice. Each instance of your function runs in an isolated execution context and processes one event at a time. When it finishes processing the event, it returns a response and Lambda sends it another event. Lambda automatically scales up the number of instances of your function to handle high numbers of events.

- **Function** – A script or program that runs in AWS Lambda. Lambda passes invocation events to your function. The function processes an event and returns a response.

- **Runtimes** – Lambda runtimes allow functions in different languages to run in the same base execution environment. You configure your function to use a runtime that matches your programming language. The runtime sits in-between the Lambda service and your function code, relaying invocation events, context information, and responses between the two. You can use runtimes provided by Lambda, or build your own.

- **Layers** – Lambda layers are a distribution mechanism for libraries, custom runtimes, and other function dependencies. Layers let you manage your in-development function code independently from the unchanging code and resources that it uses. You can configure your function to use layers that you create, layers provided by AWS, or layers from other AWS customers.

- **Event source** – An AWS service, such as Amazon SNS, or a custom service, that triggers your function and executes its logic.

- **Downstream resources** – An AWS service, such as DynamoDB tables or Amazon S3 buckets, that your Lambda function calls once it is triggered.

- **Log streams** – While Lambda automatically monitors your function invocations and reports metrics to CloudWatch, you can annotate your function code with custom logging statements that allow you to analyze the execution flow and performance of your Lambda function to ensure it's working properly.

- **AWS SAM** – A model to define [serverless applications](https://aws.amazon.com/serverless). AWS SAM is natively supported by AWS CloudFormation and defines simplified syntax for expressing serverless resources.

---

#### Creating and Using Lambda Functions

##### When should you use a Lambda function?
When your application is / can be converted to a set of functions which are all separately implemented, each of which are stateless/idempotent, have a short run time, and designed in a way that scalability is dependent on individual functions being scaled up/down individually.

##### Configuring:
You have to specify runtime environment, memory to allocate, identity and access management roles, and method to execute.

##### Execution:
AWS Lambda uses your configuration to setup a container and deploy it to an EC2 instance. Your code is encrypted and stored in an S3 bucket. It then executes the method that you've specified, in the order of package, class, and method.

##### Execution Modes / Triggers:
Functions can run synchronously as well as asynchronously (responding to events). For example, you could configure a Lambda to run whenever a file was uploaded to an S3 bucket. Lambdas can be triggered by other sources, such as records being inserted into a DynamoDB database and analytic information streaming from Amazon Kinesis.

##### Writing Lambda Functions:
You can write a Lambda function in one of two ways:

- The function can **receive an input stream to the client** and **write to an output stream back to the client**.
- The function can use **a predefined interface**, in which case AWS Lambda will **automatically de-serialize the input stream to an object**, **pass it to your function**, and **serialize your function's response** before **returning it to the client**.

---
