# YAMAS

YAMAS, Yet Another Machine Learning Automation System, is organized into five main areas: editor, model, storage, engine, and visualizer. This repository contains both end-user applications and internal services that are started either with Docker Compose or directly with language-specific tooling.

## First Step

Initialize all git submodules before working with any service in this repository. Each service is maintained as a submodule, so the repository will be incomplete until submodules are fetched.

```bash
git submodule update --init --recursive
```

## Repository Tree

The current top-level layout matches the repository tree below:

```text
.
├── LICENSE
├── README.md
├── editor
│   ├── ide
│   └── portal
├── engine
│   ├── engine
│   └── fs
├── examples
│   └── user
├── model
│   ├── dsl
│   └── metamodel
├── storage
│   ├── dal
│   └── dms
└── visualizer
    ├── api
    └── frontend
```

## Services

Use this section as a map of the repository. For setup, configuration, environment variables, and startup commands, read the README inside each service directory.

### Portal
This is the main component that starts the user portal, where users can sign in, open the graphical editor, and access the platform entry point for experiments and workflows. Read the service README for setup and usage details.

Path: `editor/portal`

### IDE
This is the textual editing environment for the DSL. It combines a web-based VS Code instance with the language server used to validate and assist workflow authoring. Read the service README for setup and usage details.

Path: `editor/ide`

### Experimentation Engine
This component executes workflows and experiments across supported backends, manages execution state, and coordinates runtime interaction with storage and data services. Read the service README for setup and usage details.

Path: `engine/engine`

### Filesystem API
This component provides a minimal filesystem API for listing directories and creating or updating files inside the configured workspace root. Read the service README for setup and usage details.

Path: `engine/fs`

### DSL Model
This component contains the domain-specific language used to describe experiments, workflows, tasks, and data flow in the platform. Read the service README for setup and usage details.

Path: `model/dsl`

### Workflow Metamodel
This component defines the EMF-based workflow metamodel that underpins experiment structure, task composition, links, and parameter types. Read the service README for setup and usage details.

Path: `model/metamodel`

### Data Abstraction Layer
This component stores and exposes runtime metadata, experiment results, and related analytics data for the wider platform. Read the service README for setup and usage details.

Path: `storage/dal`

### Design Model Storage
This component provides the DMS API used to store and retrieve workflow and experiment models. Read the service README for setup and usage details.

Path: `storage/dms`

### Visualization API
This component provides backend APIs for visual analytics and explainability features used by the visualization layer. Read the service README for setup and usage details.

Path: `visualizer/api`

### Visualization Frontend
This component provides the web dashboard for exploring, monitoring, and explaining AI pipelines and experiment outputs. Read the service README for setup and usage details.

Path: `visualizer/frontend`
