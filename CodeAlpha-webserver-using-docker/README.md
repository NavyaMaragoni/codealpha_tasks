# Task 4: Web Server using Docker

## What is Docker?
Docker lets you package an application and everything it needs into a **container**.
A container is like a mini computer that runs your app in an isolated environment.

```
Without Docker:  "It works on my PC but not yours!"
With Docker:     "It works everywhere!"
```

---

## Project Structure
```
task4-docker-webserver/
├── Dockerfile           # Instructions to build the Docker image
├── docker-compose.yml   # Easy way to run the container
├── README.md            # This file
└── app/
    └── index.html       # The web page shown in the browser
```

---

## Requirements
- Docker Desktop installed (download from https://www.docker.com)

Check if Docker is working:
```bash
docker --version
```

---

## How to Run

### Method 1: Using Docker Compose (Easiest)
```bash
# Start the web server
docker-compose up -d

# Open your browser and visit:
# http://localhost:8090
```

To stop it:
```bash
docker-compose down
```

---

### Method 2: Using Docker commands manually

```bash
# Step 1: Build the image from Dockerfile
docker build -t my-webserver .

# Step 2: Run the container
docker run -d -p 8090:80 --name my-website my-webserver

# Step 3: Open browser at http://localhost:8090
```

---

## Useful Docker Commands

| Command | What it does |
|---|---|
| `docker build -t name .` | Builds an image from Dockerfile |
| `docker run -d -p 8090:80 name` | Runs a container in background |
| `docker ps` | Lists running containers |
| `docker stop my-website` | Stops the container |
| `docker rm my-website` | Deletes the container |
| `docker images` | Lists all images on your system |
| `docker logs my-website` | Shows container logs |

---

## Key Concepts Learned
| Concept | Meaning |
|---|---|
| Image | A template/blueprint for a container |
| Container | A running instance of an image |
| Dockerfile | Recipe to build an image |
| `EXPOSE 80` | Opens port 80 inside the container |
| `-p 8090:80` | Maps your PC port 8090 → container port 80 |
| Nginx | A lightweight web server used in our container |
| `docker-compose` | Tool to manage multi-container apps easily |
