AI
- ML
  - Deep Learning
    - Artifical Neural Networks
    - Discriminative AI
    - Generative AI (Gen AI)
      - LLM
  - Reinforcement Learning
- Supervised Learning
- Unsupervised Learning

Neural Networks:
  - Here, we could give pictures of cat and dog and ask it - 

Gen AI: 
  WHAT?
  - It creates new content based on what is has learned from the existing content.

  HOW? 
  - It depends a lot on the training data that is fed into it.

  WHY?


Terminology: 

Agent: 
  - An Agent is a system that leverages an AI model to interact with its environment in order to achieve a user defined task.
  - Agent's work is a continous cycle of Think, Action and Observation.

Tools: 
  - They are just functions that give AI models extra capabilities - like, web search or any complex math calculations.
  Why? 
  - To overcome the limitations of static data training, handle real-time tasks and specialized operations.
  How they are used?
  - Agents make use of LLMs to generate tool invocation code.

  AI models convert the user input to a formatted prompt by concatenating system, user and assistant messages.

Tokens: 
  WHAT?
  - A basic unit of text that an LLM processes.
  - They are the basic building blocks of text in LLM, which can either be a character, a word or special characters. 
  - this is how an LLM internally segments a text (or a prompt) before generating a response.
  - LLM takes text (or prompt) as input, splits it into tokens, processed the tokens and generates the response as sequence of tokens, then converted back to text.
  - the more number of tokens an LLM has, greater its ability to continue a conversation.
  - Type of tokens: 
    - input token
    - output token
    - cached token (reused tokens in conversation history)
    - reasoning tokens ( this is for the extra "thinking steps" internally before producing the final output)

  WHY?
  - Each model has a maximum combined token limit  (input + output).

Context window:
  - It is the maximum number of tokens that an LLM can handle. 
  - It is the attention span of an LLM. (It is input + output tokens combined)

Parameters: They are like a brain of a model. 
  - They are the memories and knowledge of an LLM that the machine learned from model training.
  - They define skill of a model in problem solving.
  - the more parameters an LLM has, greater its ability to think. This is often correlated, but not guaranteed. Intelligence is more tied to training, architecture and tuning.

Training: 
  - Process of learning from existing content is called training.

Inference: 
  - It is the process of using a trained LLM to generate output based on the input.
  How inference works?
  - Input processing: Convert prompt into tokens
  - Model computation: Process the tokens through its layers to predict the probability of the next token.
  - Autoregressive generation: It generates one token at a time (predicts the most likely next token, appends it to the input, repeats until a stop condition)
  - Output decoding: generated tokens are converted back into readable text.
  That is why output comes out one token at a time - the model is literally predicting one token at a time.

Prompt: 
  - It is a short piece of text that is given to a LLM.

HuggingFace: 
  - It is an index of open source models. (community driven)

Vertex AI Studio: 
  - It is a MLOps platform for building , deploying and managing models.

MLOps: 
  - Stands for Machine Learning Operations.
  - It refers to the process of managing Machine Learning lifecycle - from development to deployment and monitoring.

Modal: 
  - It refers to the "medium" of information, such as text, audio, video etc. 
  - Also, can be referred as "format" of information.

Multimodal: 
  - It means many "modes".
  - A "Multimodal" AI can see images, hear audio, read texts all at once.

LLM: 
  - They are a subset of Deep Learning.
  - They are large, general purpose language models that are pre-trained and then fine-tuned for specific purposes.
  - They are trained to solve common language problems like, 
    - Text classification
    - question answering
    - document summarization
    - text generation
  - They can then be trained to solve problems in specific fields such as retail, finance and entertainment using a relatively small size of data subsets.
  - Large: It refers to 2 things.
    - Refers to the subset of the training data.
    - Refers to the parameters (or hyperparameters)
  - General purpose:
    - sufficient to solve human problems
  - pre-trained and fine-tuned:
    - LLM is pre trained for general purpose (to solve common language problems) with a large dataset
    - fine tuned for a specific aim with a much smaller dataset.
  - LLMs are based on Tranformer model.

Transformer:
  - 

shots: 
  - In LLMs, "shots" refer to the number of examples you provide to the model in your prompt to help it understand the task.

zero-shot learning: 
  - Model relies entirely on the pre-existing knowledge.

one-shot learning: 
  - you give exactly one example to follow.

few-shot learning
  - you give a small set of examples to show a pattern.

Transformers basics

Prompting patterns

Embeddings

RAG basics:
  Retrieval Augmented Generation.
    It is a framework that combines LLM's with external knowledge bases to improve their outputs or to be more accurate or up-to-date.
    Generation: It refers to LLM's generating text in response to user's prompts.
    Augmented: enhanced
    Retrieval: retrieving information.

    So, instead of re-training the model, we just augment it using a data store.

    Instead of an LLM generating a response based on its training data, RAG enables a LLM to connect with a data source to remain up to date or to generate domain specific knowledge.
  Why use RAG?
    It is to extend the capabilities of a LLM to a specific domain or an organization's internal knowledge base, all without the need to retrain the model.
    We can use RAG to connect LLM to live social media feeds, news sites and other frequently updated  information.

  How it works? 
    In RAG framework, LLM has an instruction - to retrieve relevant content from data source first, combine that with user's question and then generate the answer.







  RAG system consists of 2 models.
  1. Retrieval model.
  2. Language model.

  There are several ways to implement RAG.
  1. Graph RAG
  2. Hybrid RAG
  3. Hierarchical RAG

  System will have the following components:
  1. embedding model: A pretrained model that converts input text into embeddings.
  2. vector database: A storage system for knowledge and its corresponding embedding vectors.
  3. chatbot: A language model that generates responses based on retrieved knowledge.


  First phase: 
  Indexing phase: dataset is broken into small chunks, and vector representation of each chunk is calculated.

  To compare the similarity between 2 vectors, we can use cosine similarity, euclidean distances or any other option.
  Here, we will be using cosine similarity.

  


  
Vector database:

Semantic database: 
  It stores data in a way that maps relationship between things.- like a graph based database.


MCP vs RAG: 

RAG: its a technique where user sends a prompt to an application or system, then that app searches in a knowledge base (mostly vector DB), gets relevant chunks, adds them to the prompt and then send to LLM for response. 
MCP: Its a open, standard protocol that defines how an AI application connects to external systems.
    MCP client inside the host application connects to MCP server, which exposes tools, resources and prompts. 
    The host application places those results in the LLM's context window at request time. 
    The model's trained knowledge does not change.

    MCP server can answer to every request either using a JSON object or Server sent Streamable events.


    Finally, the host sends the entire conversation (including the tool list, and the response from the tool) to the LLM and LLM frames the response output based on the info it has.
    
<img width="851" height="641" alt="image" src="https://github.com/user-attachments/assets/cfd6c7c9-74eb-423c-90f9-bcb6ac65039b" />

<img width="855" height="749" alt="image" src="https://github.com/user-attachments/assets/63116612-3889-48b1-8537-e57cf0b72ea0" />


handshake: 
  Its the set of messages exchanged at the start of a connection, before any real work begins, so that they can agree on how to communicate.

  Eg: TCP handshake: 
      TLS handshake:

  Now, the remote MCP server can run several identical instances behind a load balancer.
    So the request 1 can reach instance A and request 2 can reach instance B.

Even in a traditional REST API, the client communicates with server. But, the client always initiates a connection. The server cannot just say "hey, I have something for you". It is not truly bi-directional.
When we compare in layman's terms: REST API is where client speaks and server replies. Server never speaks.
But RAG - its like a phone. Both sides can communicate - both people speaking at the same time.

MCP is not like a traditional REST API model or WebSockets. It uses Streamable HTTP (client sends request over HTTP and server streams response using Server Sent Events). 
SSE is a one-directional streaming mechanism


Instead of exposing a tool to be used by each application separately, we can create a MCP server, so that any MCP compatible host can use it.

The LLM itself does not interact with MCP. The host application contains one MCP client for each MCP server that it connects to.


Skill.md: It is for domain expertise for a type of output (how to generate a React project, a ppt file etc.)
Claude.md: It is for project context for your specific codebase/environment.

User Story: Requirement framed from a User's perspective.
Acceptance Criteria: specific, testable conditions that define done. 

PRD: Product Requirements Document

In the traditional model, a vague spec was tolerable because the human coder could fill in gaps using judgment and context as they wrote. With AI, a vague spec produces vague or wrong output. So the spec has to be more precise, more explicit about
edge cases, and clearer about constraints. Ironically, the AI-assisted approach is making teams better at writing specs because the cost of a bad spec is now immediate — you get broken code instead of just a confused developer who asks clarifying
questions.


Horse harness: Its a strap that connects a Horse to its cart. Without the harness, the power from horse remains unused.
Harness: 
  It is the code that runs the agent loop around the model; it builds each request to the model, sends it, read the model's output, executes any tool calls, feeds the tool response back to the model, and repeats until the task ends.

Eg: Test harness 
  JUnit + test setup is test harness. A class cannot test itself, so we need the JUnit + test setup for testing it.


Agentic Harness: 
  It is the Harness (that includes tools, memory, context building, guardrails and error handling) in which the model decides the next 
step, running in a loop until the task is done.
  What tool to call, memory, guardrails, agentic loop etc. live inside Agentic harness.

So we can say that: 
AI agent = AI model + Agentic Harness

Memory lives in the harness.


Agentic: 
  Who controls the flow? That decides whether something is agentic or not. 
  In normal harness, your code decides the next step. 
  In agentic harness, model decides the next step, again and again until its done.


context window = working memory.

Plan -> Action -> Observe

<img width="960" height="548" alt="image" src="https://github.com/user-attachments/assets/97b2e248-5b80-47fb-9b78-657877fb3610" />

agents.md: 
  It sits at the root of the project and when the agent starts working in that project, it reads this file. 
  This file tells which commands to run for test, which coding conventions to use, which projects to look for etc.
  We can have multiple agents.md files. But the files closer to the working directory override the earlier files, because they appear later.


agents skill:
  skill.md
  It tells the agent how to do a specific kind of task.
  invoke me when the user wants to create subscription: create_subscription

MCP:

A2A:
  protocol for agent to agent communication.
  Each agent publishes agent card - which is like a description of what the agent does and how to integrate with it.

Sub-agent: 
  it is the child agent that the main agent spins up. 
  each sub-agent runs in its own context window.

  Q: is the main agent's context window split between the sub-agents or is it the same for all sub-agents and main agent? 
    Who decides the number of sub-agents to spawn?


LLM is stateless. It doesn't remember the memory or the previous prompts/replies.
So the harness sends the previous messages along with the new prompt to the model every time. 
As chat history grows, the content that the LLM has to read also grows. 
- which can result in increased context window. Size
- Cost: cost is mesasured per tokens.
- Quality: very long inputs, full of old, irrelevant details can make the model pay less attention to what is new now.

So the harness has to manage the history. Common strategies are: 
- Sliding window (remember only the last N messages)
- Summarization
- Pinning key facts.

TODO: Know more about above. 

An agent's memory is split into two types.
- short term memory: across a single task/session
- long term memory: across multiple sessions.


  




