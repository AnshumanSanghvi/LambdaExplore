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

#### AWS Lambda
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
