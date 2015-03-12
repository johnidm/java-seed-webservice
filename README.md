# Seed project WebService for Java

### How to use

```
git clone https://github.com/johnidm/java-seed-webservice
```

Open project in your preference IDE and run project.

### Tests URI's

Based in URL `http://localhost:8080` and URI `http://localhost:8080/api/v1`

####XML

#####GET

```bash
curl -v -H "Accept: application/xml" -H "Content-Type: application/xml" -X GET http://localhost:8080/api/v1/bier
```
---

#####GET (specify item)

```bash
curl -v -H "Accept: application/xml" -H "Content-Type: application/xml" -X GET http://localhost:8080/api/v1/bier/2
```
---

#####DELETE

```bash
curl -v -H "Accept: application/xml" -H "Content-Type: application/xml" -X DELETE http://localhost:8080/api/v1/bier/3
```
---

#####POST

```bash
curl -v -H "Accept: application/xml" -H "Content-Type: application/xml" -X POST http://localhost:8080/api/v1/bier -d '<?xml version="1.0" encoding="UTF-8" standalone="yes"?><bier><brewery>Way Beer</brewery><id>4</id><name>Way Beer Cream Porter</name><type>ALE</type></bier>'
```
---

#####PUT

```bash
curl -v -H "Accept: application/xml" -H "Content-Type: application/xml" -X PUT http://localhost:8080/api/v1/bier/3 -d '<?xml version="1.0" encoding="UTF-8" standalone="yes"?><bier><brewery>Hi-Wire Brewing</brewery><id>3</id><name>Hi-Wire Lager</name><type>ALE</type></bier>'
```
---

####JSON

#####GET
```bash
curl -v -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/api/v1/bier
```

---

#####GET (specify item)

```bash
curl -v -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/api/v1/bier/2
```
---

#####DELETE

```bash
curl -v -H "Accept: application/json" -H "Content-Type: application/json" -X DELETE http://localhost:8080/api/v1/bier/3
```
---

#####POST

```bash
curl -v -H "Accept: application/json" -H "Content-Type: application/json" -X POST http://localhost:8080/api/v1/bier/ -d '{ "brewery": "Way Beer",  "id": "4", "name": "Way Beer Cream Porter",  "type": "ALE" }'
```
---

#####PUT

```bash
curl -v -H "Accept: application/json" -H "Content-Type: application/json" -X PUT http://localhost:8080/api/v1/bier/3 -d '{"brewery":"Hi-Wire Brewing","id":"3","name":"Hi-Wire Lager","type":"ALE"}'
```
---
