# Registration Entity Controller

## List registration - Paginated

### Endpoint call

`GET <protocol>://<host>:<port>/registration[?]<params>`

| Name | Description                                                                                                                  | Example       |
|------|------------------------------------------------------------------------------------------------------------------------------|---------------|
| page | Zero-based page index (0..N)                                                                                                 | page=1        |
| size | The size of the page to be returned                                                                                          | size=2        |
| sort | Sorting criteria in the format: property,(asc\desc). Default sort order is ascending. Multiple sort criteria are supported.  | sort=id desc  |

### Output

```json
{
  "_embedded": {
    "registration": [
      {
        "id": 1,
        "student": {
          "name": "Roselia Mosciski IV"
        },
        "course": {
          "name": "The Complete 2022 Web Development Bootcamp",
          "description": "Become a Full-Stack Web Developer with just ONE course. HTML, CSS, Javascript, Node, React, MongoDB, Web3 and DApps"
        },
        "_links": {
          "self": {
            "href": "http://localhost:8080/registration/1"
          },
          "registrationEntity": {
            "href": "http://localhost:8080/registration/1{?projection}",
            "templated": true
          },
          "course": {
            "href": "http://localhost:8080/registration/1/course"
          },
          "student": {
            "href": "http://localhost:8080/registration/1/student"
          }
        }
      },
      {
        "id": 2,
        "student": {
          "name": "Rey Waters"
        },
        "course": {
          "name": "The Complete 2022 Web Development Bootcamp",
          "description": "Become a Full-Stack Web Developer with just ONE course. HTML, CSS, Javascript, Node, React, MongoDB, Web3 and DApps"
        },
        "_links": {
          "self": {
            "href": "http://localhost:8080/registration/2"
          },
          "registrationEntity": {
            "href": "http://localhost:8080/registration/2{?projection}",
            "templated": true
          },
          "course": {
            "href": "http://localhost:8080/registration/2/course"
          },
          "student": {
            "href": "http://localhost:8080/registration/2/student"
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8080/registration?page=0&size=20"
    },
    "profile": {
      "href": "http://localhost:8080/profile/registration"
    }
  },
  "page": {
    "size": 20,
    "totalElements": 2,
    "totalPages": 1,
    "number": 0
  }
}
```

## Get Registration

### Endpoint call

`GET <protocol>://<host>:<port>/registration/{id}`

### Output

```json
{
  "_links": {
    "self": {
      "href": "http://localhost:8080/registration/1"
    },
    "registrationEntity": {
      "href": "http://localhost:8080/registration/1{?projection}",
      "templated": true
    },
    "course": {
      "href": "http://localhost:8080/registration/1/course"
    },
    "student": {
      "href": "http://localhost:8080/registration/1/student"
    }
  }
}
``` 

## Delete Registration

### Endpoint call

`DELETE <protocol>://<host>:<port>/registration/{id}`
