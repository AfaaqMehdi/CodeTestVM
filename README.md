# CodeTestVM
Calculator App
Overview :
1. 2 Api's to add and substract numbers
2. Basic Authentication with credentials hardcored InMemory username and password
3. Exceptional scenarios have not been handled

Authentication Details :
##
User : admin
Password : admin

Sample Request and Response :
1. Post URL : http://{{IpAddress}}:9091/api/add
##
       Request : 
      {
        "x" : "5",
        "y" : "4"
      }
      Response :
      {
          "result": 9
      }
      
2. Post URL : http://{{IpAddress}}:9091/api/diff
##
       Request : 
      {
        "x" : "5",
        "y" : "4"
      }
      Response :
      {
          "result": 1
      }      
