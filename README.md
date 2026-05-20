# Sistema de Detecção de Possíveis Golpes Bancários com Busca Binária

## 📌 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de demonstrar a utilização do algoritmo de **Busca Binária** aplicado na análise de históricos bancários para identificação de possíveis golpes financeiros.

O sistema simula um histórico de transações bancárias, calcula o nível de risco de cada transação com base em padrões lógicos e utiliza busca binária para localizar rapidamente operações suspeitas.

---

# 🎯 Objetivo

Detectar possíveis fraudes bancárias utilizando:

* Estruturas de dados
* Busca Binária
* Programação Orientada a Objetos
* Regras lógicas de risco
* Organização em camadas

---

# 🧠 Como Funciona

O sistema segue o seguinte fluxo:

```txt
Histórico Bancário
        ↓
Cálculo de Risco
        ↓
Ordenação por Risco
        ↓
Busca Binária
        ↓
Detecção de Transações Suspeitas
```

---

# ⚙️ Regras de Risco

O sistema considera alguns padrões suspeitos, como:

* Transações realizadas de madrugada
* PIX com valores altos
* Destinatário nunca utilizado anteriormente
* Localização diferente do padrão do usuário
* Transferências com valores muito elevados

Cada característica aumenta a pontuação de risco da transação.

---

# 🚨 Exemplo de Detecção

```txt
Risco < 0.80 → Transação Normal
Risco ≥ 0.80 → Possível Golpe
```

---

# 🏗️ Estrutura do Projeto

```txt
src/
├── Main.java
├── model/
│   └── Transacao.java
├── repository/
│   └── HistoricoRepository.java
└── service/
    ├── RiscoService.java
    └── BuscaBinariaService.java
```

---

# 📂 Responsabilidade de Cada Arquivo

## `Transacao.java`

Representa uma transação bancária.

Contém:

* valor
* tipo
* horário
* destinatário
* cidade
* risco
* informações de comportamento suspeito

---

## `HistoricoRepository.java`

Responsável por gerar o histórico fictício de transações.

---

## `RiscoService.java`

Responsável por:

* calcular o risco de cada transação
* aplicar as regras lógicas de fraude

---

## `BuscaBinariaService.java`

Responsável por:

* ordenar o histórico por risco
* executar a busca binária
* localizar rapidamente transações suspeitas

---

## `Main.java`

Classe principal responsável por:

* iniciar o sistema
* integrar os serviços
* exibir os resultados

---

# 🔎 Complexidade do Algoritmo

## Busca Linear

```txt
O(n)
```

Percorre toda a lista.

---

## Busca Binária

```txt
O(log n)
```

Divide o problema pela metade a cada execução, tornando a busca muito mais rápida em grandes volumes de dados.

---

# 💻 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Estrutura de Dados
* Algoritmo de Busca Binária

---

# ▶️ Como Executar

## Compilar

```bash
javac Main.java model/Transacao.java repository/HistoricoRepository.java service/RiscoService.java service/BuscaBinariaService.java
```

## Executar

```bash
java Main
```

---

# 👨‍💻 Divisão da Equipe

## Pessoa 1

Responsável por:

* `Transacao.java`
* `HistoricoRepository.java`
* `Main.java`

---

## Pessoa 2

Responsável por:

* `RiscoService.java`
* `BuscaBinariaService.java`
* testes e validações

---

# 📚 Conceitos Aplicados

* Busca Binária
* Encapsulamento
* Organização em camadas
* Separação de responsabilidades
* Simulação de análise antifraude bancária

---

# 📈 Possíveis Melhorias Futuras

* Integração com banco de dados
* API REST
* Inteligência Artificial
* Machine Learning
* Dashboard web
* Análise em tempo real
* Integração com Open Finance

---

# 🏦 Contexto Real

Sistemas bancários reais utilizam motores antifraude muito mais avançados, envolvendo:

* IA
* Machine Learning
* Análise comportamental
* Big Data
* Redes neurais

Este projeto representa uma simulação acadêmica simplificada baseada em lógica e estrutura de dados.

---

# 📄 Licença

Projeto desenvolvido para fins acadêmicos e educacionais.
