# Course Entity Controller

## List course - Paginated

### Endpoint call

`GET <protocol>://<host>:<port>/course[?]<params>`

| Name | Description                                                                                                                  | Example       |
|------|------------------------------------------------------------------------------------------------------------------------------|---------------|
| page | Zero-based page index (0..N)                                                                                                 | page=1        |
| size | The size of the page to be returned                                                                                          | size=2        |
| sort | Sorting criteria in the format: property,(asc\desc). Default sort order is ascending. Multiple sort criteria are supported. | sort=name asc |

### Output

```json
{
  "_embedded": {
    "course": [
      {
        "name": "Ultimate AWS Certified Solutions Architect Associate 2022",
        "description": "Full Practice Exam | Learn Cloud Computing | Pass the AWS Certified Solutions Architect Associate Certification SAA-C02!",
        "_links": {
          "self": {
            "href": "http://localhost:8080/course/3"
          },
          "courseEntity": {
            "href": "http://localhost:8080/course/3"
          },
          "registrations": {
            "href": "http://localhost:8080/course/3/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ultimate AWS Certified Developer Associate 2022 - NEW!",
        "description": "Full Practice Exam with Explanations included! PASS the Amazon Web Services Certified Developer Certification DVA-C01.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/course/4"
          },
          "courseEntity": {
            "href": "http://localhost:8080/course/4"
          },
          "registrations": {
            "href": "http://localhost:8080/course/4/registrations{?projection}",
            "templated": true
          }
        }
      }
    ]
  },
  "_links": {
    "first": {
      "href": "http://localhost:8080/course?page=0&size=2"
    },
    "prev": {
      "href": "http://localhost:8080/course?page=0&size=2"
    },
    "self": {
      "href": "http://localhost:8080/course?page=1&size=2&sort=name%20desc"
    },
    "next": {
      "href": "http://localhost:8080/course?page=2&size=2"
    },
    "last": {
      "href": "http://localhost:8080/course?page=2&size=2"
    },
    "profile": {
      "href": "http://localhost:8080/profile/course"
    },
    "search": {
      "href": "http://localhost:8080/course/search"
    }
  },
  "page": {
    "size": 2,
    "totalElements": 5,
    "totalPages": 3,
    "number": 1
  }
}
```

## Create Course

### Endpoint call

`POST <protocol>://<host>:<port>/course`

### Payload

```json
{
  "name": "JavaScript Algorithms and Data Structures Masterclass",
  "description": "The Missing Computer Science and Coding Interview Bootcamp"
}
```

### Output

```json
{
  "name": "JavaScript Algorithms and Data Structures Masterclass",
  "description": "The Missing Computer Science and Coding Interview Bootcamp",
  "_links": {
    "self": {
      "href": "http://localhost:8080/course/6"
    },
    "courseEntity": {
      "href": "http://localhost:8080/course/6"
    },
    "registrations": {
      "href": "http://localhost:8080/course/6/registrations{?projection}",
      "templated": true
    }
  }
}
``` 


## Update Course

### Endpoint call

`POST <protocol>://<host>:<port>/course/{id}`

### Payload

```json
{
  "name": "JavaScript Algorithms and Data Structures Masterclass Updated",
  "description": "The Missing Computer Science and Coding Interview Bootcamp Updated"
}
```

### Output

```json
{
  "name": "JavaScript Algorithms and Data Structures Masterclass Updated",
  "description": "The Missing Computer Science and Coding Interview Bootcamp Updated",
  "_links": {
    "self": {
      "href": "http://localhost:8080/course/6"
    },
    "courseEntity": {
      "href": "http://localhost:8080/course/6"
    },
    "registrations": {
      "href": "http://localhost:8080/course/6/registrations{?projection}",
      "templated": true
    }
  }
}
``` 


## Get Course

### Endpoint call

`GET <protocol>://<host>:<port>/course/{id}`

### Output

```json
{
  "name": "JavaScript Algorithms and Data Structures Masterclass 2",
  "description": "The Missing Computer Science and Coding Interview Bootcamp 2",
  "_links": {
    "self": {
      "href": "http://localhost:8080/course/6"
    },
    "courseEntity": {
      "href": "http://localhost:8080/course/6"
    },
    "registrations": {
      "href": "http://localhost:8080/course/6/registrations{?projection}",
      "templated": true
    }
  }
}
``` 

## Delete Course

### Endpoint call

`DELETE <protocol>://<host>:<port>/course/{id}`


## List All Courses For a Given Student

### Endpoint call

`GET <protocol>://<host>:<port>/course/search/allCoursesForStudent/{studentId}`

### Output
 ```json
{
  "_embedded": {
    "course": [
      {
        "name": "The Complete 2022 Web Development Bootcamp",
        "description": "Become a Full-Stack Web Developer with just ONE course. HTML, CSS, Javascript, Node, React, MongoDB, Web3 and DApps",
        "_embedded": {
          "registrations": [
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
                "course": {
                  "href": "http://localhost:8080/registration/1/course"
                },
                "student": {
                  "href": "http://localhost:8080/registration/1/student"
                },
                "self": {
                  "href": "http://localhost:8080/registration/1{?projection}",
                  "templated": true
                }
              }
            }
          ]
        },
        "_links": {
          "self": {
            "href": "http://localhost:8080/course/1"
          },
          "courseEntity": {
            "href": "http://localhost:8080/course/1"
          },
          "registrations": {
            "href": "http://localhost:8080/course/1/registrations{?projection}",
            "templated": true
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8080/course/search/allCoursesForStudent?studentId=1"
    }
  }
} 
```

## List All Courses Without Any Student

### Endpoint call

`GET <protocol>://<host>:<port>/course/search/allCoursesWithoutAnyStudent`

### Output
 ```json
{
  "_embedded": {
    "course": [
      {
        "name": "PMP Certification Exam Prep Course 35 PDU Contact Hours/PDU",
        "description": "Get your PMP Certification with this course. Fully updated for the 2021 PMP Exam",
        "_links": {
          "self": {
            "href": "http://localhost:8080/course/2"
          },
          "courseEntity": {
            "href": "http://localhost:8080/course/2"
          },
          "registrations": {
            "href": "http://localhost:8080/course/2/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ultimate AWS Certified Solutions Architect Associate 2022",
        "description": "Full Practice Exam | Learn Cloud Computing | Pass the AWS Certified Solutions Architect Associate Certification SAA-C02!",
        "_links": {
          "self": {
            "href": "http://localhost:8080/course/3"
          },
          "courseEntity": {
            "href": "http://localhost:8080/course/3"
          },
          "registrations": {
            "href": "http://localhost:8080/course/3/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ultimate AWS Certified Developer Associate 2022 - NEW!",
        "description": "Full Practice Exam with Explanations included! PASS the Amazon Web Services Certified Developer Certification DVA-C01.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/course/4"
          },
          "courseEntity": {
            "href": "http://localhost:8080/course/4"
          },
          "registrations": {
            "href": "http://localhost:8080/course/4/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "JavaScript Algorithms and Data Structures Masterclass",
        "description": "The Missing Computer Science and Coding Interview Bootcamp",
        "_links": {
          "self": {
            "href": "http://localhost:8080/course/5"
          },
          "courseEntity": {
            "href": "http://localhost:8080/course/5"
          },
          "registrations": {
            "href": "http://localhost:8080/course/5/registrations{?projection}",
            "templated": true
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8080/course/search/allCoursesWithoutAnyStudent"
    }
  }
}
```


## List All Courses With Students

### Endpoint call

`GET <protocol>://<host>:<port>/course/search/allWithStudents`

### Output
 ```json
{
  "_embedded": {
    "course": [
      {
        "name": "The Complete 2022 Web Development Bootcamp",
        "description": "Become a Full-Stack Web Developer with just ONE course. HTML, CSS, Javascript, Node, React, MongoDB, Web3 and DApps",
        "_embedded": {
          "registrations": [
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
                "course": {
                  "href": "http://localhost:8080/registration/1/course"
                },
                "student": {
                  "href": "http://localhost:8080/registration/1/student"
                },
                "self": {
                  "href": "http://localhost:8080/registration/1{?projection}",
                  "templated": true
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
                "course": {
                  "href": "http://localhost:8080/registration/2/course"
                },
                "student": {
                  "href": "http://localhost:8080/registration/2/student"
                },
                "self": {
                  "href": "http://localhost:8080/registration/2{?projection}",
                  "templated": true
                }
              }
            }
          ]
        },
        "_links": {
          "self": {
            "href": "http://localhost:8080/course/1"
          },
          "courseEntity": {
            "href": "http://localhost:8080/course/1"
          },
          "registrations": {
            "href": "http://localhost:8080/course/1/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "The Complete 2022 Web Development Bootcamp",
        "description": "Become a Full-Stack Web Developer with just ONE course. HTML, CSS, Javascript, Node, React, MongoDB, Web3 and DApps",
        "_embedded": {
          "registrations": [
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
                "course": {
                  "href": "http://localhost:8080/registration/1/course"
                },
                "student": {
                  "href": "http://localhost:8080/registration/1/student"
                },
                "self": {
                  "href": "http://localhost:8080/registration/1{?projection}",
                  "templated": true
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
                "course": {
                  "href": "http://localhost:8080/registration/2/course"
                },
                "student": {
                  "href": "http://localhost:8080/registration/2/student"
                },
                "self": {
                  "href": "http://localhost:8080/registration/2{?projection}",
                  "templated": true
                }
              }
            }
          ]
        },
        "_links": {
          "self": {
            "href": "http://localhost:8080/course/1"
          },
          "courseEntity": {
            "href": "http://localhost:8080/course/1"
          },
          "registrations": {
            "href": "http://localhost:8080/course/1/registrations{?projection}",
            "templated": true
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8080/course/search/allWithStudents"
    }
  }
}
```
