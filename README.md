# Spring Boot CRUD Application with Kubernetes Configuration

This project is a simple Spring Boot CRUD application with full Kubernetes (k8s) deployment configuration.

## Features
- **CRUD Operations:** Functional REST API for basic Create and Read operations.
- **Kubernetes Deployment:** Ready-to-use Kubernetes manifests for deployment, service, and configuration.
- **MySQL Database Integration:** Pre-configured MySQL database connection with Secrets and ConfigMaps for managing sensitive data and database configuration.

## Folder Structure
- `src/`: Contains the Spring Boot application code.
- `Dockerfile`: Docker configuration for building the application image.
- `app-deployment.yaml`: Kubernetes Deployment and Service manifest for the Spring Boot app.
- `db-deployment.yaml`: Kubernetes Deployment and Service manifest for the MySQL database.
- `mysql-configMap.yaml`: ConfigMap for MySQL database configuration.
- `mysql-secrets.yaml`: Secrets for sensitive MySQL credentials.
- `pom.xml`: Maven configuration file for managing dependencies.

## Prerequisites
To run this project, you need:
1. **Docker** installed to build the application image.
2. **Kubernetes cluster** (e.g., Minikube, Kind, or any cloud provider's Kubernetes service).
3. **kubectl** CLI tool installed and configured to manage the Kubernetes cluster.
