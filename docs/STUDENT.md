# Student Entity Controller

## List student - Paginated

### Endpoint call

`GET <protocol>://<host>:<port>/student[?]<params>`

| Name | Description                                                                                                                  | Example       |
|------|------------------------------------------------------------------------------------------------------------------------------|---------------|
| page | Zero-based page index (0..N)                                                                                                 | page=1        |
| size | The size of the page to be returned                                                                                          | size=2        |
| sort | Sorting criteria in the format: property,(asc\desc). Default sort order is ascending. Multiple sort criteria are supported.  | sort=name asc |

### Output

```json
{
  "_embedded": {
    "student": [
      {
        "name": "Roselia Mosciski IV",
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
            "href": "http://localhost:8080/student/1"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/1"
          },
          "registrations": {
            "href": "http://localhost:8080/student/1/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Rey Waters",
        "_embedded": {
          "registrations": [
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
            "href": "http://localhost:8080/student/2"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/2"
          },
          "registrations": {
            "href": "http://localhost:8080/student/2/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Bennett Jakubowski",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/3"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/3"
          },
          "registrations": {
            "href": "http://localhost:8080/student/3/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Jason Ankunding",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/4"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/4"
          },
          "registrations": {
            "href": "http://localhost:8080/student/4/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Chung Graham",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/5"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/5"
          },
          "registrations": {
            "href": "http://localhost:8080/student/5/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dr. Judson Pollich",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/6"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/6"
          },
          "registrations": {
            "href": "http://localhost:8080/student/6/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dr. Tasha Jacobi",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/7"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/7"
          },
          "registrations": {
            "href": "http://localhost:8080/student/7/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ceola Schneider PhD",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/8"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/8"
          },
          "registrations": {
            "href": "http://localhost:8080/student/8/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Lou Gleichner DVM",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/9"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/9"
          },
          "registrations": {
            "href": "http://localhost:8080/student/9/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Bobby Morissette",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/10"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/10"
          },
          "registrations": {
            "href": "http://localhost:8080/student/10/registrations{?projection}",
            "templated": true
          }
        }
      }
    ]
  },
  "_links": {
    "first": {
      "href": "http://localhost:8080/student?page=0&size=10"
    },
    "self": {
      "href": "http://localhost:8080/student?page=0&size=10"
    },
    "next": {
      "href": "http://localhost:8080/student?page=1&size=10"
    },
    "last": {
      "href": "http://localhost:8080/student?page=19&size=10"
    },
    "profile": {
      "href": "http://localhost:8080/profile/student"
    },
    "search": {
      "href": "http://localhost:8080/student/search"
    }
  },
  "page": {
    "size": 10,
    "totalElements": 200,
    "totalPages": 20,
    "number": 0
  }
}
```

## Create Student

### Endpoint call

`POST <protocol>://<host>:<port>/student`

### Payload

```json
{
  "name": "Chuck Norris"
}
```

### Output

```json
{
  "name": "Chuck Norris",
  "_links": {
    "self": {
      "href": "http://localhost:8080/student/201"
    },
    "studentEntity": {
      "href": "http://localhost:8080/student/201"
    },
    "registrations": {
      "href": "http://localhost:8080/student/201/registrations{?projection}",
      "templated": true
    }
  }
}
``` 

## Update Student

### Endpoint call

`POST <protocol>://<host>:<port>/student/{id}`

### Payload

```json
{
  "name": "Bruce Lee"
}
```

### Output

```json
{
  "name": "Bruce Lee",
  "_links": {
    "self": {
      "href": "http://localhost:8080/student/201"
    },
    "studentEntity": {
      "href": "http://localhost:8080/student/201"
    },
    "registrations": {
      "href": "http://localhost:8080/student/201/registrations{?projection}",
      "templated": true
    }
  }
}
``` 


## Get Student

### Endpoint call

`GET <protocol>://<host>:<port>/student/{id}`

### Output

```json
{
  "name": "Bruce Lee",
  "_links": {
    "self": {
      "href": "http://localhost:8080/student/201"
    },
    "studentEntity": {
      "href": "http://localhost:8080/student/201"
    },
    "registrations": {
      "href": "http://localhost:8080/student/201/registrations{?projection}",
      "templated": true
    }
  }
}
``` 


## Delete Student

### Endpoint call

`DELETE <protocol>://<host>:<port>/student/{id}`




## List All Students For a Given Course

### Endpoint call

`GET <protocol>://<host>:<port>/course/search/allCoursesForStudent/{courseId}`

### Output
 ```json
{
  "_embedded": {
    "student": [
      {
        "name": "Roselia Mosciski IV",
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
            "href": "http://localhost:8080/student/1"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/1"
          },
          "registrations": {
            "href": "http://localhost:8080/student/1/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Rey Waters",
        "_embedded": {
          "registrations": [
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
            "href": "http://localhost:8080/student/2"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/2"
          },
          "registrations": {
            "href": "http://localhost:8080/student/2/registrations{?projection}",
            "templated": true
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8080/student/search/allStudentsForCourse?courseId=1"
    }
  }
} 
```

## List All Students Without Any Course

### Endpoint call

`GET <protocol>://<host>:<port>/course/search/allStudentsWithoutAnyCourse`

### Output
 ```json
{
  "_embedded": {
    "student": [
      {
        "name": "Bennett Jakubowski",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/3"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/3"
          },
          "registrations": {
            "href": "http://localhost:8080/student/3/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Jason Ankunding",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/4"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/4"
          },
          "registrations": {
            "href": "http://localhost:8080/student/4/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Chung Graham",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/5"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/5"
          },
          "registrations": {
            "href": "http://localhost:8080/student/5/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dr. Judson Pollich",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/6"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/6"
          },
          "registrations": {
            "href": "http://localhost:8080/student/6/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dr. Tasha Jacobi",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/7"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/7"
          },
          "registrations": {
            "href": "http://localhost:8080/student/7/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ceola Schneider PhD",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/8"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/8"
          },
          "registrations": {
            "href": "http://localhost:8080/student/8/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Lou Gleichner DVM",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/9"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/9"
          },
          "registrations": {
            "href": "http://localhost:8080/student/9/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Bobby Morissette",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/10"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/10"
          },
          "registrations": {
            "href": "http://localhost:8080/student/10/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Maxwell Rowe",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/11"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/11"
          },
          "registrations": {
            "href": "http://localhost:8080/student/11/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Alfonzo Mohr MD",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/12"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/12"
          },
          "registrations": {
            "href": "http://localhost:8080/student/12/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Cletus Stracke",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/13"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/13"
          },
          "registrations": {
            "href": "http://localhost:8080/student/13/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Clement Feil",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/14"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/14"
          },
          "registrations": {
            "href": "http://localhost:8080/student/14/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Perry Witting III",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/15"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/15"
          },
          "registrations": {
            "href": "http://localhost:8080/student/15/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Terrell Langworth",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/16"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/16"
          },
          "registrations": {
            "href": "http://localhost:8080/student/16/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Wilhemina Walker",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/17"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/17"
          },
          "registrations": {
            "href": "http://localhost:8080/student/17/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dr. Anna Beatty",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/18"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/18"
          },
          "registrations": {
            "href": "http://localhost:8080/student/18/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Shane Orn",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/19"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/19"
          },
          "registrations": {
            "href": "http://localhost:8080/student/19/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Gayle Yundt",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/20"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/20"
          },
          "registrations": {
            "href": "http://localhost:8080/student/20/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Vashti Cruickshank DDS",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/21"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/21"
          },
          "registrations": {
            "href": "http://localhost:8080/student/21/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Son Heathcote",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/22"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/22"
          },
          "registrations": {
            "href": "http://localhost:8080/student/22/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Karry Hudson",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/23"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/23"
          },
          "registrations": {
            "href": "http://localhost:8080/student/23/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Terrell Lesch",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/24"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/24"
          },
          "registrations": {
            "href": "http://localhost:8080/student/24/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Christoper Wilderman",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/25"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/25"
          },
          "registrations": {
            "href": "http://localhost:8080/student/25/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Daisy Davis Sr.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/26"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/26"
          },
          "registrations": {
            "href": "http://localhost:8080/student/26/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Emery Harber",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/27"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/27"
          },
          "registrations": {
            "href": "http://localhost:8080/student/27/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Russell Cremin",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/28"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/28"
          },
          "registrations": {
            "href": "http://localhost:8080/student/28/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dawne Collier",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/29"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/29"
          },
          "registrations": {
            "href": "http://localhost:8080/student/29/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dave Cruickshank",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/30"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/30"
          },
          "registrations": {
            "href": "http://localhost:8080/student/30/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Jacques Friesen",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/31"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/31"
          },
          "registrations": {
            "href": "http://localhost:8080/student/31/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Alonzo Quigley",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/32"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/32"
          },
          "registrations": {
            "href": "http://localhost:8080/student/32/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Rochell Hodkiewicz",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/33"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/33"
          },
          "registrations": {
            "href": "http://localhost:8080/student/33/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Rudy Wolff",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/34"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/34"
          },
          "registrations": {
            "href": "http://localhost:8080/student/34/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Tamara Monahan",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/35"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/35"
          },
          "registrations": {
            "href": "http://localhost:8080/student/35/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Berenice Tromp",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/36"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/36"
          },
          "registrations": {
            "href": "http://localhost:8080/student/36/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Michell Haley",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/37"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/37"
          },
          "registrations": {
            "href": "http://localhost:8080/student/37/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Donovan Yundt",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/38"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/38"
          },
          "registrations": {
            "href": "http://localhost:8080/student/38/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Clement Frami",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/39"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/39"
          },
          "registrations": {
            "href": "http://localhost:8080/student/39/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Kurtis Turcotte",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/40"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/40"
          },
          "registrations": {
            "href": "http://localhost:8080/student/40/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Jolie Heller",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/41"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/41"
          },
          "registrations": {
            "href": "http://localhost:8080/student/41/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Danuta Bogisich IV",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/42"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/42"
          },
          "registrations": {
            "href": "http://localhost:8080/student/42/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Vivan Koss",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/43"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/43"
          },
          "registrations": {
            "href": "http://localhost:8080/student/43/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Mrs. Desire West",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/44"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/44"
          },
          "registrations": {
            "href": "http://localhost:8080/student/44/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Jeff Beier",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/45"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/45"
          },
          "registrations": {
            "href": "http://localhost:8080/student/45/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Arturo Auer",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/46"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/46"
          },
          "registrations": {
            "href": "http://localhost:8080/student/46/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ms. Erlinda Gislason",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/47"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/47"
          },
          "registrations": {
            "href": "http://localhost:8080/student/47/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Leola Purdy",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/48"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/48"
          },
          "registrations": {
            "href": "http://localhost:8080/student/48/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Arnoldo Keebler",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/49"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/49"
          },
          "registrations": {
            "href": "http://localhost:8080/student/49/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Maybell Stamm",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/50"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/50"
          },
          "registrations": {
            "href": "http://localhost:8080/student/50/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Kourtney Rosenbaum",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/51"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/51"
          },
          "registrations": {
            "href": "http://localhost:8080/student/51/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Selma Mills V",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/52"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/52"
          },
          "registrations": {
            "href": "http://localhost:8080/student/52/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dr. Mckinley Zemlak",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/53"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/53"
          },
          "registrations": {
            "href": "http://localhost:8080/student/53/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Deloras Schowalter",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/54"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/54"
          },
          "registrations": {
            "href": "http://localhost:8080/student/54/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Theodore Nader",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/55"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/55"
          },
          "registrations": {
            "href": "http://localhost:8080/student/55/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Bernarda Effertz",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/56"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/56"
          },
          "registrations": {
            "href": "http://localhost:8080/student/56/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Stan Schultz",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/57"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/57"
          },
          "registrations": {
            "href": "http://localhost:8080/student/57/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Matthew Bernier",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/58"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/58"
          },
          "registrations": {
            "href": "http://localhost:8080/student/58/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Valencia Dickinson",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/59"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/59"
          },
          "registrations": {
            "href": "http://localhost:8080/student/59/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Lenny Aufderhar",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/60"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/60"
          },
          "registrations": {
            "href": "http://localhost:8080/student/60/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Shu Wisozk I",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/61"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/61"
          },
          "registrations": {
            "href": "http://localhost:8080/student/61/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Alex McDermott",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/62"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/62"
          },
          "registrations": {
            "href": "http://localhost:8080/student/62/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Fabian Stoltenberg",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/63"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/63"
          },
          "registrations": {
            "href": "http://localhost:8080/student/63/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Shelby Pagac",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/64"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/64"
          },
          "registrations": {
            "href": "http://localhost:8080/student/64/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Erica Rolfson Jr.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/65"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/65"
          },
          "registrations": {
            "href": "http://localhost:8080/student/65/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Marcelene Maggio",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/66"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/66"
          },
          "registrations": {
            "href": "http://localhost:8080/student/66/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Alfredo Wintheiser",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/67"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/67"
          },
          "registrations": {
            "href": "http://localhost:8080/student/67/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ezequiel Bogan",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/68"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/68"
          },
          "registrations": {
            "href": "http://localhost:8080/student/68/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Marguerita Bosco",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/69"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/69"
          },
          "registrations": {
            "href": "http://localhost:8080/student/69/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Fiona Mayert",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/70"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/70"
          },
          "registrations": {
            "href": "http://localhost:8080/student/70/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Gaylord Gulgowski",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/71"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/71"
          },
          "registrations": {
            "href": "http://localhost:8080/student/71/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Branden Powlowski",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/72"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/72"
          },
          "registrations": {
            "href": "http://localhost:8080/student/72/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ms. Jenette Leannon",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/73"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/73"
          },
          "registrations": {
            "href": "http://localhost:8080/student/73/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Weston Lakin",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/74"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/74"
          },
          "registrations": {
            "href": "http://localhost:8080/student/74/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Claudie Klocko",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/75"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/75"
          },
          "registrations": {
            "href": "http://localhost:8080/student/75/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Kimberely Lemke",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/76"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/76"
          },
          "registrations": {
            "href": "http://localhost:8080/student/76/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Alex Kutch V",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/77"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/77"
          },
          "registrations": {
            "href": "http://localhost:8080/student/77/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dorcas Cartwright",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/78"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/78"
          },
          "registrations": {
            "href": "http://localhost:8080/student/78/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Myrtle Luettgen",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/79"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/79"
          },
          "registrations": {
            "href": "http://localhost:8080/student/79/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Milo Steuber",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/80"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/80"
          },
          "registrations": {
            "href": "http://localhost:8080/student/80/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ms. Herta Bogisich",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/81"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/81"
          },
          "registrations": {
            "href": "http://localhost:8080/student/81/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Misty Muller Jr.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/82"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/82"
          },
          "registrations": {
            "href": "http://localhost:8080/student/82/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Winfred Marvin",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/83"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/83"
          },
          "registrations": {
            "href": "http://localhost:8080/student/83/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Mariana Koelpin",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/84"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/84"
          },
          "registrations": {
            "href": "http://localhost:8080/student/84/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Darin West",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/85"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/85"
          },
          "registrations": {
            "href": "http://localhost:8080/student/85/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Illa Quitzon",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/86"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/86"
          },
          "registrations": {
            "href": "http://localhost:8080/student/86/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Enrique Stehr",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/87"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/87"
          },
          "registrations": {
            "href": "http://localhost:8080/student/87/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Renae Yundt",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/88"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/88"
          },
          "registrations": {
            "href": "http://localhost:8080/student/88/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Berta Dooley",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/89"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/89"
          },
          "registrations": {
            "href": "http://localhost:8080/student/89/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Sam Kling",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/90"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/90"
          },
          "registrations": {
            "href": "http://localhost:8080/student/90/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Malka Leuschke",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/91"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/91"
          },
          "registrations": {
            "href": "http://localhost:8080/student/91/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Leora OConner",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/92"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/92"
          },
          "registrations": {
            "href": "http://localhost:8080/student/92/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Awilda Bergnaum",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/93"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/93"
          },
          "registrations": {
            "href": "http://localhost:8080/student/93/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Tamra Wolff",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/94"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/94"
          },
          "registrations": {
            "href": "http://localhost:8080/student/94/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Daniel Kautzer",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/95"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/95"
          },
          "registrations": {
            "href": "http://localhost:8080/student/95/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Matilda Boehm",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/96"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/96"
          },
          "registrations": {
            "href": "http://localhost:8080/student/96/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Mrs. Marvella Marquardt",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/97"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/97"
          },
          "registrations": {
            "href": "http://localhost:8080/student/97/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Kasi Rodriguez DDS",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/98"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/98"
          },
          "registrations": {
            "href": "http://localhost:8080/student/98/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Eugene Parisian",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/99"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/99"
          },
          "registrations": {
            "href": "http://localhost:8080/student/99/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Jeff Jaskolski",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/100"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/100"
          },
          "registrations": {
            "href": "http://localhost:8080/student/100/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Assunta McDermott",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/101"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/101"
          },
          "registrations": {
            "href": "http://localhost:8080/student/101/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Brad Schoen",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/102"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/102"
          },
          "registrations": {
            "href": "http://localhost:8080/student/102/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Lamont Padberg",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/103"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/103"
          },
          "registrations": {
            "href": "http://localhost:8080/student/103/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Hung Franecki",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/104"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/104"
          },
          "registrations": {
            "href": "http://localhost:8080/student/104/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Garry Stiedemann",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/105"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/105"
          },
          "registrations": {
            "href": "http://localhost:8080/student/105/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Johnetta Breitenberg DVM",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/106"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/106"
          },
          "registrations": {
            "href": "http://localhost:8080/student/106/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Wallace OConner Sr.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/107"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/107"
          },
          "registrations": {
            "href": "http://localhost:8080/student/107/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Melodie Nolan",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/108"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/108"
          },
          "registrations": {
            "href": "http://localhost:8080/student/108/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Derek Runte",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/109"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/109"
          },
          "registrations": {
            "href": "http://localhost:8080/student/109/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Nancey Rosenbaum",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/110"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/110"
          },
          "registrations": {
            "href": "http://localhost:8080/student/110/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Earl Farrell",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/111"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/111"
          },
          "registrations": {
            "href": "http://localhost:8080/student/111/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Maxwell Hand",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/112"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/112"
          },
          "registrations": {
            "href": "http://localhost:8080/student/112/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Raymundo Simonis",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/113"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/113"
          },
          "registrations": {
            "href": "http://localhost:8080/student/113/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Arvilla Flatley",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/114"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/114"
          },
          "registrations": {
            "href": "http://localhost:8080/student/114/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Magda Satterfield",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/115"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/115"
          },
          "registrations": {
            "href": "http://localhost:8080/student/115/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dr. Dick Feest",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/116"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/116"
          },
          "registrations": {
            "href": "http://localhost:8080/student/116/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Joshua Hamill V",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/117"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/117"
          },
          "registrations": {
            "href": "http://localhost:8080/student/117/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Paulita Dach",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/118"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/118"
          },
          "registrations": {
            "href": "http://localhost:8080/student/118/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Lasandra Haag",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/119"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/119"
          },
          "registrations": {
            "href": "http://localhost:8080/student/119/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Valentin Berge",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/120"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/120"
          },
          "registrations": {
            "href": "http://localhost:8080/student/120/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Julianna Mueller",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/121"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/121"
          },
          "registrations": {
            "href": "http://localhost:8080/student/121/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Luigi Kris",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/122"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/122"
          },
          "registrations": {
            "href": "http://localhost:8080/student/122/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ed Spinka",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/123"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/123"
          },
          "registrations": {
            "href": "http://localhost:8080/student/123/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Cory Wuckert PhD",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/124"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/124"
          },
          "registrations": {
            "href": "http://localhost:8080/student/124/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Rey McKenzie",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/125"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/125"
          },
          "registrations": {
            "href": "http://localhost:8080/student/125/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Billye Streich",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/126"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/126"
          },
          "registrations": {
            "href": "http://localhost:8080/student/126/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dr. Elizabeth Koelpin",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/127"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/127"
          },
          "registrations": {
            "href": "http://localhost:8080/student/127/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Reva Bechtelar",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/128"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/128"
          },
          "registrations": {
            "href": "http://localhost:8080/student/128/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Erin Kohler II",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/129"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/129"
          },
          "registrations": {
            "href": "http://localhost:8080/student/129/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Sylvester Marks",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/130"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/130"
          },
          "registrations": {
            "href": "http://localhost:8080/student/130/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Fabiola Franecki",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/131"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/131"
          },
          "registrations": {
            "href": "http://localhost:8080/student/131/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Marcos Gulgowski",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/132"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/132"
          },
          "registrations": {
            "href": "http://localhost:8080/student/132/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Malka Miller",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/133"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/133"
          },
          "registrations": {
            "href": "http://localhost:8080/student/133/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Jennette Rice",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/134"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/134"
          },
          "registrations": {
            "href": "http://localhost:8080/student/134/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Patria Bartell",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/135"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/135"
          },
          "registrations": {
            "href": "http://localhost:8080/student/135/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Rutha Donnelly",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/136"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/136"
          },
          "registrations": {
            "href": "http://localhost:8080/student/136/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Homer Auer",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/137"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/137"
          },
          "registrations": {
            "href": "http://localhost:8080/student/137/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Elizabet Hills",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/138"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/138"
          },
          "registrations": {
            "href": "http://localhost:8080/student/138/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Agnes Larkin",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/139"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/139"
          },
          "registrations": {
            "href": "http://localhost:8080/student/139/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Valentin Renner",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/140"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/140"
          },
          "registrations": {
            "href": "http://localhost:8080/student/140/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Santo Ruecker",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/141"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/141"
          },
          "registrations": {
            "href": "http://localhost:8080/student/141/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Antonio Bins",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/142"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/142"
          },
          "registrations": {
            "href": "http://localhost:8080/student/142/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Emelina Bailey",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/143"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/143"
          },
          "registrations": {
            "href": "http://localhost:8080/student/143/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Demetria OHara",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/144"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/144"
          },
          "registrations": {
            "href": "http://localhost:8080/student/144/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Luetta Wisoky DVM",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/145"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/145"
          },
          "registrations": {
            "href": "http://localhost:8080/student/145/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Tonya Okuneva",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/146"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/146"
          },
          "registrations": {
            "href": "http://localhost:8080/student/146/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Stephen Hoppe",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/147"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/147"
          },
          "registrations": {
            "href": "http://localhost:8080/student/147/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miki Hansen Sr.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/148"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/148"
          },
          "registrations": {
            "href": "http://localhost:8080/student/148/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dr. Lecia Hane",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/149"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/149"
          },
          "registrations": {
            "href": "http://localhost:8080/student/149/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Florance Pagac DVM",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/150"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/150"
          },
          "registrations": {
            "href": "http://localhost:8080/student/150/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Florine Dooley",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/151"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/151"
          },
          "registrations": {
            "href": "http://localhost:8080/student/151/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ms. Normand Harris",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/152"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/152"
          },
          "registrations": {
            "href": "http://localhost:8080/student/152/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Kendall Osinski",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/153"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/153"
          },
          "registrations": {
            "href": "http://localhost:8080/student/153/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Syble Leffler",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/154"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/154"
          },
          "registrations": {
            "href": "http://localhost:8080/student/154/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Moriah Goyette",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/155"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/155"
          },
          "registrations": {
            "href": "http://localhost:8080/student/155/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Brianne Walter",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/156"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/156"
          },
          "registrations": {
            "href": "http://localhost:8080/student/156/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Blake Dickens",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/157"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/157"
          },
          "registrations": {
            "href": "http://localhost:8080/student/157/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Hilton Jones V",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/158"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/158"
          },
          "registrations": {
            "href": "http://localhost:8080/student/158/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Osvaldo Feeney Sr.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/159"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/159"
          },
          "registrations": {
            "href": "http://localhost:8080/student/159/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Alvaro Bosco",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/160"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/160"
          },
          "registrations": {
            "href": "http://localhost:8080/student/160/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ms. Nicolas Rosenbaum",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/161"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/161"
          },
          "registrations": {
            "href": "http://localhost:8080/student/161/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Troy Mueller",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/162"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/162"
          },
          "registrations": {
            "href": "http://localhost:8080/student/162/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Kenny Dibbert",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/163"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/163"
          },
          "registrations": {
            "href": "http://localhost:8080/student/163/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ms. Carly Brekke",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/164"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/164"
          },
          "registrations": {
            "href": "http://localhost:8080/student/164/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Crysta Ferry V",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/165"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/165"
          },
          "registrations": {
            "href": "http://localhost:8080/student/165/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Clemente Konopelski PhD",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/166"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/166"
          },
          "registrations": {
            "href": "http://localhost:8080/student/166/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Mrs. Mindi Mraz",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/167"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/167"
          },
          "registrations": {
            "href": "http://localhost:8080/student/167/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dawn Marks",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/168"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/168"
          },
          "registrations": {
            "href": "http://localhost:8080/student/168/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Vonnie Schiller Sr.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/169"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/169"
          },
          "registrations": {
            "href": "http://localhost:8080/student/169/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Romaine Borer",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/170"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/170"
          },
          "registrations": {
            "href": "http://localhost:8080/student/170/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Bennie Hermann",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/171"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/171"
          },
          "registrations": {
            "href": "http://localhost:8080/student/171/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Chieko Jerde",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/172"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/172"
          },
          "registrations": {
            "href": "http://localhost:8080/student/172/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ms. Walter Harvey",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/173"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/173"
          },
          "registrations": {
            "href": "http://localhost:8080/student/173/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Anton Effertz Jr.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/174"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/174"
          },
          "registrations": {
            "href": "http://localhost:8080/student/174/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Denice Bailey",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/175"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/175"
          },
          "registrations": {
            "href": "http://localhost:8080/student/175/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Yolande Konopelski",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/176"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/176"
          },
          "registrations": {
            "href": "http://localhost:8080/student/176/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Janay Sanford",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/177"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/177"
          },
          "registrations": {
            "href": "http://localhost:8080/student/177/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Janessa Jast",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/178"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/178"
          },
          "registrations": {
            "href": "http://localhost:8080/student/178/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Miss Leticia Heller",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/179"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/179"
          },
          "registrations": {
            "href": "http://localhost:8080/student/179/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Michal Dare",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/180"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/180"
          },
          "registrations": {
            "href": "http://localhost:8080/student/180/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Leora Howe",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/181"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/181"
          },
          "registrations": {
            "href": "http://localhost:8080/student/181/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Isreal Heller",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/182"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/182"
          },
          "registrations": {
            "href": "http://localhost:8080/student/182/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Dean Anderson V",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/183"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/183"
          },
          "registrations": {
            "href": "http://localhost:8080/student/183/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Shane Cormier",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/184"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/184"
          },
          "registrations": {
            "href": "http://localhost:8080/student/184/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ms. Silas Waters",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/185"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/185"
          },
          "registrations": {
            "href": "http://localhost:8080/student/185/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Odis Haley",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/186"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/186"
          },
          "registrations": {
            "href": "http://localhost:8080/student/186/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Mr. Tim Aufderhar",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/187"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/187"
          },
          "registrations": {
            "href": "http://localhost:8080/student/187/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Jamie Lesch",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/188"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/188"
          },
          "registrations": {
            "href": "http://localhost:8080/student/188/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Casie Champlin",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/189"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/189"
          },
          "registrations": {
            "href": "http://localhost:8080/student/189/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Michael Kautzer",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/190"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/190"
          },
          "registrations": {
            "href": "http://localhost:8080/student/190/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Sherryl Schamberger",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/191"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/191"
          },
          "registrations": {
            "href": "http://localhost:8080/student/191/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Shelby Anderson",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/192"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/192"
          },
          "registrations": {
            "href": "http://localhost:8080/student/192/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Valery Runte",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/193"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/193"
          },
          "registrations": {
            "href": "http://localhost:8080/student/193/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Mrs. Dalton Lubowitz",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/194"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/194"
          },
          "registrations": {
            "href": "http://localhost:8080/student/194/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Mr. Ginger Kunze",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/195"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/195"
          },
          "registrations": {
            "href": "http://localhost:8080/student/195/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Gracia Oara",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/196"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/196"
          },
          "registrations": {
            "href": "http://localhost:8080/student/196/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Rachele Wuckert",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/197"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/197"
          },
          "registrations": {
            "href": "http://localhost:8080/student/197/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Ann Keefe",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/198"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/198"
          },
          "registrations": {
            "href": "http://localhost:8080/student/198/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Rigoberto Aufderhar",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/199"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/199"
          },
          "registrations": {
            "href": "http://localhost:8080/student/199/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Cordie Hessel Jr.",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/200"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/200"
          },
          "registrations": {
            "href": "http://localhost:8080/student/200/registrations{?projection}",
            "templated": true
          }
        }
      },
      {
        "name": "Bruce Lee",
        "_links": {
          "self": {
            "href": "http://localhost:8080/student/201"
          },
          "studentEntity": {
            "href": "http://localhost:8080/student/201"
          },
          "registrations": {
            "href": "http://localhost:8080/student/201/registrations{?projection}",
            "templated": true
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8080/student/search/allStudentsWithoutAnyCourse"
    }
  }
}
```
