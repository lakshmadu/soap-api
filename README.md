# soap-api
## SOAP Web Service - README

This README file provides information about the SOAP web service implemented using Java 1.8, Apache CXF 3.6, and web module version 2.5. The web service is deployed on Apache Tomcat 8.5.

### Web Service Details

- WSDL Link: [http://localhost:8080/E2041351_SOAP_API/services/MarkSubmitionPort](http://localhost:8080/E2041351_SOAP_API/services/MarkSubmitionPort)

### Console Output

#### Outbound Message - StoreMarks

- Request ID: 5
- Address: http://localhost:8080/E2041351_SOAP_API/services/MarkSubmitionPort
- Encoding: UTF-8
- HTTP Method: POST
- Content-Type: text/xml;charset=UTF-8
- Headers:
  - accept-encoding: [gzip,deflate]
  - connection: [Keep-Alive]
  - Content-Length: [383]
  - content-type: [text/xml;charset=UTF-8]
  - host: [localhost:8080]
  - SOAPAction: ["urn:StoreMarks"]
  - user-agent: [Apache-HttpClient/4.5.5 (Java/16.0.1)]
- Payload:
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:test="http://test.soap/">
   <soapenv:Header/>
   <soapenv:Body>
      <test:storeMarks>
         <!--Optional:-->
         <arg0>E2041351</arg0>
         <!--Optional:-->
         <arg1>ITE3742</arg1>
         <arg2>98</arg2>
      </test:storeMarks>
   </soapenv:Body>
</soapenv:Envelope>
```

#### Inbound Message - StoreMarks Response

- Request ID: 5
- Response Code: 200
- Encoding: UTF-8
- Content-Type: text/xml
- Headers: {}
- Payload:
```
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:storeMarksResponse xmlns:ns2="http://test.soap/"/>
   </soap:Body>
</soap:Envelope>
```

#### Inbound Message - RetrieveMarks

- Request ID: 6
- Address: http://localhost:8080/E2041351_SOAP_API/services/MarkSubmitionPort
- Encoding: UTF-8
- HTTP Method: POST
- Content-Type: text/xml;charset=UTF-8
- Headers:
  - accept-encoding: [gzip,deflate]
  - connection: [Keep-Alive]
  - Content-Length: [363]
  - content-type: [text/xml;charset=UTF-8]
  - host: [localhost:8080]
  - SOAPAction: ["urn:RetrieveMarks"]
  - user-agent: [Apache-HttpClient/4.5.5 (Java/16.0.1)]
- Payload:
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:test="http://test.soap/">
   <soapenv:Header/>
   <soapenv:Body>
      <test:retrieveMarks>
         <!--Optional:-->
         <arg0>E2041351</arg0>
         <!--Optional:-->
         <arg1>ITE3742</arg1>
      </test:retrieveMarks>
   </soapenv:Body>
</soapenv:Envelope>
```

#### Outbound Message - RetrieveMarks
