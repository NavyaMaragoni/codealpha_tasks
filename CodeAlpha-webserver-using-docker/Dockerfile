# Dockerfile - Instructions to build our Docker image
# Think of this like a recipe to set up a mini computer

# Step 1: Start from the official Nginx web server image
# Nginx is a lightweight web server that serves HTML files
FROM nginx:alpine

# Step 2: Copy our HTML file into the container
# nginx looks for files in /usr/share/nginx/html by default
COPY app/index.html /usr/share/nginx/html/index.html

# Step 3: Tell Docker that this container uses port 80
# Port 80 is the default port for websites (HTTP)
EXPOSE 80

# Step 4: Start the nginx web server when container runs
# (nginx:alpine image already starts nginx by default, this is just for clarity)
CMD ["nginx", "-g", "daemon off;"]
