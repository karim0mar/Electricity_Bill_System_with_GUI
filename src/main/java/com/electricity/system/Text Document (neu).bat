@echo off
:: Create the directory for the model files if it doesn't exist
if not exist src\models (
    mkdir src\models
)

:: Change to the models directory
cd src\models

:: Create Customer.java
echo package models; > Customer.java
echo. >> Customer.java
echo public class Customer { >> Customer.java
echo     private int id; >> Customer.java
echo     private String name; >> Customer.java
echo     private String email; >> Customer.java
echo     private String meterCode; >> Customer.java
echo     private String contractAttachment; >> Customer.java
echo. >> Customer.java
echo     public Customer() {} >> Customer.java
echo. >> Customer.java
echo     public Customer(int id, String name, String email, String meterCode, String contractAttachment) { >> Customer.java
echo         this.id = id; >> Customer.java
echo         this.name = name; >> Customer.java
echo         this.email = email; >> Customer.java
echo         this.meterCode = meterCode; >> Customer.java
echo         this.contractAttachment = contractAttachment; >> Customer.java
echo     } >> Customer.java
echo. >> Customer.java
echo     public int getId() { return id; } >> Customer.java
echo     public void setId(int id) { this.id = id; } >> Customer.java
echo. >> Customer.java
echo     public String getName() { return name; } >> Customer.java
echo     public void setName(String name) { this.name = name; } >> Customer.java
echo. >> Customer.java
echo     public String getEmail() { return email; } >> Customer.java
echo     public void setEmail(String email) { this.email = email; } >> Customer.java
echo. >> Customer.java
echo     public String getMeterCode() { return meterCode; } >> Customer.java
echo     public void setMeterCode(String meterCode) { this.meterCode = meterCode; } >> Customer.java
echo. >> Customer.java
echo     public String getContractAttachment() { return contractAttachment; } >> Customer.java
echo     public void setContractAttachment(String contractAttachment) { this.contractAttachment = contractAttachment; } >> Customer.java
echo } >> Customer.java

:: Repeat this pattern for Operator.java, Admin.java, etc.

echo Java model files created successfully!
pause
