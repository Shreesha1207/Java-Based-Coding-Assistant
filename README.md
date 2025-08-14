**Java-Based Coding Assistant**

Introduction
This repository contains a command-line chatbot application developed in Java. The program integrates with the Google Gemini API to deliver intelligent, context-aware responses. This project serves as a clear and functional example of how to incorporate a sophisticated Large Language Model (LLM) into a standard, Maven-managed Java application.
A key feature of this application is its use of a configurable system instruction, which directs the model to assume a specific role. For this implementation, the chatbot is configured to act as a specialized coding assistant.

Core Features

Direct API Integration: Establishes a direct connection to the Google Gemini API to leverage its advanced generative AI functionalities.
Interactive Command-Line Interface: Provides a real-time, interactive console for users to communicate with the chatbot.
Configurable Model Behavior: Employs a system instruction to define the chatbot's operational role and conversational tone, ensuring specialized and consistent output.
Secure Credential Management: Utilizes a .env file for API key storage, adhering to the best practice of separating secrets from source code.
Standardized Build Process: Relies on Apache Maven for robust dependency management and a reproducible project build lifecycle.

Technical Stack

Programming Language: Java 21
Build Automation Tool: Apache Maven
Primary Libraries:
google-cloud-genai: The official Google client library for the Gemini API.
java-dotenv: A library for loading environment variables from a .env file.

Prerequisites

To build and run this application, the following software components must be installed and configured on the local system:
Java Development Kit (JDK), version 21 or later.
Apache Maven.
An active Google Gemini API Key, which can be obtained from Google AI Studio.

Setup

After obtaining the api key , create a .env file and store the key under the name "GOOGLE_API_KEY".
