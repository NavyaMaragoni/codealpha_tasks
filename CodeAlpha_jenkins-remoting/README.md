# Task 2: Jenkins Remoting Project

## What is Jenkins Remoting?
Jenkins Remoting allows Jenkins to run build jobs on a **separate machine (agent)** instead of the main server (master). This is useful when you have many builds and want to distribute the load.

```
[Your Browser] --> [Jenkins Master :8080] --> [Jenkins Agent]
                        (controls)               (does the work)
```

---

## Files in this Project
```
task2-jenkins-remoting/
├── docker-compose.yml   # Sets up Jenkins master + agent using Docker
├── Jenkinsfile          # Defines the build pipeline steps
└── README.md            # This file
```

---

## Requirements
- Docker installed on your PC
- Docker Compose installed

---

## How to Run (Step by Step)

### Step 1: Start Jenkins
Open a terminal in this folder and run:
```bash
docker-compose up -d
```

### Step 2: Open Jenkins in Browser
Go to: **http://localhost:8080**

### Step 3: Unlock Jenkins
Get the initial admin password by running:
```bash
docker exec jenkins-master cat /var/jenkins_home/secrets/initialAdminPassword
```
Copy that password and paste it in the browser.

### Step 4: Install Suggested Plugins
Click **"Install suggested plugins"** and wait.

### Step 5: Create an Agent Node in Jenkins UI
1. Go to **Manage Jenkins → Nodes → New Node**
2. Name it: `my-agent`
3. Select **Permanent Agent**
4. Set Remote root directory: `/home/jenkins/agent`
5. Set Labels: `my-agent`
6. Launch method: **Launch agent by connecting it to the controller**
7. Save → Copy the **secret key** shown

### Step 6: Update docker-compose.yml
Replace `your_agent_secret_here` in `docker-compose.yml` with the secret you copied.
Then restart:
```bash
docker-compose down
docker-compose up -d
```

### Step 7: Create a Pipeline Job
1. New Item → Pipeline
2. In Pipeline section, choose **Pipeline script from SCM** or paste the Jenkinsfile content
3. Click **Build Now**

---

## What You Will See
- Jenkins master running at localhost:8080
- Agent connected and visible under **Manage Jenkins → Nodes**
- Pipeline running on the agent (not master)

---

## Key Concepts Learned
| Concept | Meaning |
|---|---|
| Master | Main Jenkins server that manages jobs |
| Agent | Remote worker that runs the actual build |
| Node Isolation | Agent runs in its own environment |
| Pipeline | Steps defined in Jenkinsfile |
| JNLP Port 50000 | How agent connects to master |
