<div align="center"\>
  <img width="1024" height="304" alt="image" src="https://github.com/user-attachments/assets/7cc5f8ed-9b95-4b2a-b237-86d52ac7818f" />
</div>

<br>

-----

<div align="center"\>
  <strong>Texto...</strong\>
</div>

<br>

<div align="center">
  <img src="https://img.shields.io/github/license/OfAndreS/NextBank?style=for-the-badge" alt="Licença">
  <img src="https://img.shields.io/github/stars/OfAndreS/NextBank?style=for-the-badge" alt="Stars">
  <img src="https://img.shields.io/github/forks/OfAndreS/NextBank?style=for-the-badge" alt="Forks">
  <img src="https://img.shields.io/github/last-commit/OfAndreS/NextBank?style=for-the-badge" alt="Último Commit">
</div>

<br>

<p align="center">
  <a href="#estrutura-do-projeto">Estrutura do Projeto</a> •
  <a href="#tecnologias">Tecnologias</a> •
  <a href="#como-executar">Como Executar</a> •
</p>

-----

<br>

|**Sobre o Projeto**|
|-|
|Texto...|

<br>

<div align="center"\>
  <img width="1102" height="500" alt="image" src="https://github.com/user-attachments/assets/c6fc7925-3a6c-4189-8d06-afb3a99ba65a" />
</div>

<br>

-----

<br>

| **Funcionalidades** |
|---|
| <p align="justify">  Texto... </p> |

<br>

-----

<br>

## **Estrutura do Projeto**
<br>

```bash
Código...
```

<br>

## **Tecnologias**

<br>

| Ferramenta | Descrição |
|-----------|----------------------------------------------------------------|
| **Java** | Linguagem de programação principal utilizada para toda a lógica do sistema. |

<br>

## **Como Executar**

<br>

Para ter uma cópia local deste projeto e executá-lo, siga os passos abaixo.

<details>
  <summary><strong>Pré-requisitos</strong></summary>
  
  - Você vai precisar do Java Development Kit (JDK) instalado na sua máquina.
  - Você vai precisar do Git instalado na sua máquina para clonar o repositório.
  - É bom ter um editor de texto como o VS Code ou uma IDE como IntelliJ ou Eclipse.

</details>

<details>
  <summary><strong>Rodando a Aplicação</strong></summary>

<br>

1 ) **Clone o repositório:**

```bash
git clone https://github.com/OfAndreS/FastDelivery.git
````

2 ) **Navegue até o diretório `src` do projeto:**

```bash
cd NextBank
```

3 ) **Compile todos os arquivos Java a partir do diretório `src`:**

```bash
# Para sistemas baseados em Unix (Linux, macOS)
mkdir -p bin && javac -d bin $(find src/main/java -name "*.java")

# Para Windows (PowerShell)
if (-not (Test-Path -Path "bin")) { New-Item -ItemType Directory -Path "bin" }; javac -d bin (Get-ChildItem -Recurse -Path src/main/java -Filter *.java).FullName
```

4 ) **Execute a classe principal a partir do diretório `src`:**

```bash
java -cp bin com.nextbank.application.Main
```

</details>
