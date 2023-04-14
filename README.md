# Java JSON deserialize exemple.
This Java App gets my repositories via github api and deserializes in a POJO/Array using GSON lib :heart: .

![image](https://user-images.githubusercontent.com/24380007/230791389-978444dd-b769-49a8-81a5-e6686b8d6911.png)

- ## Created a request and manage the response:
![image](https://user-images.githubusercontent.com/24380007/230791465-5c899549-be19-4466-bfab-857e037a7b22.png)

- ## Made a Class name Repos as reference to be serialized:
 
![image](https://user-images.githubusercontent.com/24380007/230791532-681ed7d1-ce66-459a-a3d9-21ff9e34c02c.png)

#### Note! GSON don´t need the anotations in the Object fields unlike JACKSON lib do.

- ## Do a GSON instance and easily deserializes response into my Repos.Class, like this response is a Array: Repos[].class

![image](https://user-images.githubusercontent.com/24380007/230791967-26a11168-d6dc-4a47-a90d-4cfa053ee552.png)


- ## The result!

![image](https://user-images.githubusercontent.com/24380007/230792010-cff5bd7b-b8e2-4537-96b4-26a15e7d9e2f.png)

- ## I can do what I want with the data mapped by my Repos Object reference.

# Reference:

- [GSON lib](https://github.com/google/gson)
- [Http Java](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html)
