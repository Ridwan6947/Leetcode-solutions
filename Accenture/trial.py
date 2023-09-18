import requests
import json

data = {
    "Name" : "Syed Ridwan Ahmad",
    "Email" : "RidwanAhamed@gmail.com",
    "College" : "VIT,Bhopal",
    "StudentId" : "20BCE10961",
    "FileName" : "trial.py"
}
json_data = json.dumps(data)

api_url = "https://demo-o1un.onrender.com/bajaj_Test"
headers = {
    "Content-Type": "application/json",
}
response = requests.request("PUT",api_url,data=json_data,headers=headers)
print(response.text)